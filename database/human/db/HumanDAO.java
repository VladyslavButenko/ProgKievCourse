package human.db;

import human.human.Human;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Date;

public class HumanDAO {
    private File file = new File("database/human/db/database.txt");
    private int shift = 0;

    public void saveHuman(Human human) {
        try (ByteArrayOutputStream byteOutput = new ByteArrayOutputStream();
             DataOutputStream dataOutput = new DataOutputStream(byteOutput);
             OutputStream output = new FileOutputStream(file, true)
        ) {
            validate(human); //Валидация.

            //Запись всех полей, начиная с имени.
            dataOutput.write(optimizeBytes(human.getName(), 50));

            dataOutput.write(optimizeBytes(human.getSurname(), 50));

            Date bday = human.getBirthday();
            String birth = "" + bday.getYear();

            if (bday.getMonth() < 10)
                birth += "0" + bday.getMonth();
            else
                birth += bday.getMonth();

            if (bday.getDate() < 10)
                birth += "0" + bday.getDate();
            else
                birth += bday.getDate();


            dataOutput.write(optimizeBytes(birth, birth.length()));

            dataOutput.write(optimizeBytes(human.getPosition(), 100));

            dataOutput.writeDouble(human.getSalary()); //Запись зарплаты

            dataOutput.writeBoolean(false); //Запись поля для удаления.

            dataOutput.write("\n".getBytes()[0]);


            byte[] arr = byteOutput.toByteArray();


            output.write(arr); //Запись в файл.
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }


    }

    private void validate(Human human) throws IOException {
        validateString(human.getName(), "Имя", 50);
        validateString(human.getSurname(), "Фамилия", 50);
        validateString(human.getPosition(), "Должность", 100);
    }

    private void validateString(String str, String field, int max) throws IOException {
        byte[] bytes = str.getBytes();
        if (bytes.length > max) {
            throw new IOException(String.format("Неправильная длина поля \"%s\": %d байт." +
                    " Максимально допустимое значение: %d байт", field, bytes.length, max));
        }
    }


    private byte[] optimizeBytes(String str, int max) { //Метод для расширения строки до максимальной.
        byte[] strBytes = str.getBytes();
        return Arrays.copyOf(strBytes, max);

    }

    public Human readHuman(int index) throws Exception {
        setShift((index - 1) * 218);

        Human human = new Human();
        RandomAccessFile randFile = new RandomAccessFile(file, "rw");
        randFile.seek(shift);

        byte[] bytes = randFile.readLine().getBytes();


        byte[] workArr = Arrays.copyOf(bytes, 50);
        setField(human, workArr, 0);

        workArr = Arrays.copyOfRange(bytes, 50, 100);
        setField(human, workArr, 1);

        workArr = Arrays.copyOfRange(bytes, 100, 108);
        setField(human, workArr, 2);

        workArr = Arrays.copyOfRange(bytes, 108, 208);
        setField(human, workArr, 3);

        randFile.seek(208 + shift);
        human.setSalary(randFile.readDouble());

//        randFile.seek(216 + shift);              !!! Признак удаления, пока что не нужен
//        boolean b = randFile.readBoolean();
//        System.out.println(b);


        return human;


    }

    private void setField(Human human, byte[] workarr, int whatCase) throws IOException {
        int positionOfNull;
        switch (whatCase) {
            case 0:
                positionOfNull = getPostionOfNull(workarr);
                workarr = Arrays.copyOf(workarr, positionOfNull);
                human.setName(new String(workarr, StandardCharsets.UTF_8));
                break;
            case 1:
                positionOfNull = getPostionOfNull(workarr);
                workarr = Arrays.copyOf(workarr, positionOfNull);
                human.setSurname(new String(workarr, StandardCharsets.UTF_8));
                break;
            case 2:
                String strDate = new String(workarr, StandardCharsets.UTF_8);
                int year = Integer.parseInt(strDate.substring(0, 4));
                int month = Integer.parseInt(strDate.substring(4, 6));
                int day = Integer.parseInt(strDate.substring(6));
                Date date = new Date(year, month, day);
                human.setBirthday(date);
                break;
            case 3:
                positionOfNull = getPostionOfNull(workarr);
                workarr = Arrays.copyOf(workarr, positionOfNull);
                human.setPosition(new String(workarr, StandardCharsets.UTF_8));
                break;

        }

    }

    private int getPostionOfNull(byte[] workArr) {
        int positionOfNull = 0;
        for (int a = 0; a < workArr.length; a++) {
            if (workArr[a] == 0) {
                positionOfNull = a;
                break;
            }
        }
        return positionOfNull;
    }


    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    private void setShift(int shift) {
        this.shift = shift;
    }


}
