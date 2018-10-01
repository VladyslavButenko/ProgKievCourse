import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Player {
    public void makeMove() {
        System.out.print("Выберите поле от 0 до 8: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if (input.equals("save")) {
            try {
                saveGame();
                input = sc.nextLine();
            } catch (IOException e) {
                System.out.println("Ошибка сохранения!");
            }

        } else if (input.equals("load")) {

            try {
                loadGame();
                input = sc.nextLine();
            } catch (IOException e) {
                System.out.println("Ошибка загрузки!");
            }

        }

        if (Field.getField()[Integer.parseInt(input)] == 0) {
            int num = Integer.parseInt(input);
            Field.getField()[num] = 1;
        }
    }

    public void saveGame() throws IOException {
        try (FileWriter writer = new FileWriter("save.txt")) {
            for (int a = 0; a < Field.getField().length; a++) {
                int num = Field.getField()[a];
                writer.write(num);
            }
        }
        System.out.println("Игра сохранена!!");
    }

    public void loadGame() throws IOException {
        try (FileReader reader = new FileReader("save.txt")) {
            for (int a = 0; a < Field.getField().length; a++) {
                int b = reader.read();
                Field.getField()[a] = b - 48;
            }
        }
        System.out.println("Игра загружена!");
        System.out.println("Продолжаем партию: \n");
        Field.draw();
    }
}
