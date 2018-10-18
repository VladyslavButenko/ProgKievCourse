package human.db;

import human.Human;

import java.io.*;
import java.util.Arrays;
import java.util.Date;

public class HumanDAO {
    private File file = new File("src/human/db/database.txt");

    public void saveHuman(Human human) {
        try (ByteArrayOutputStream byteOutput = new ByteArrayOutputStream();
             DataOutputStream dataOutput = new DataOutputStream(byteOutput);
             OutputStream output = new FileOutputStream(file,true)
        ) {
            validate(human); //Валидация.

            //Запись всех полей, начиная с имени.
            dataOutput.write(optimizeBytes(human.getName(), 50));
            dataOutput.write(optimizeBytes(human.getSurname(), 50));

            Date bday = human.getBirthday();
            String birth = "" + bday.getYear() + bday.getMonth() + bday.getDate();
            dataOutput.write(optimizeBytes(birth, birth.length()));

            dataOutput.write(optimizeBytes(human.getPosition(), 100));

            dataOutput.writeDouble(human.getSalary()); //Запись зарплаты
            dataOutput.writeBoolean(true); //Запись поля для удаления.
            dataOutput.writeUTF("\n");

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


    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
}
