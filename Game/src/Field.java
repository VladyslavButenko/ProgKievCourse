
public class Field {
    private static int[] field = new int[9];

    public static void draw() {
        for (int a = 0; a < 9; a++) {
            String str = "";
            if (field[a] == 0) str = "*";
            else if (field[a] == 1) str = "X";
            else if (field[a] == 2) str = "0";
            System.out.print("|_" + str + "_|");
            if (a == 2 || a == 5 || a == 8) System.out.println();
        }
    }

    public static void endGame(int num) {
        if (num == 1) {
            draw();
            System.out.println("\nПобедил игрок!");
            System.exit(0);
        }
        if (num == 2) {
            draw();
            System.out.println("\nПобедил компьютер!");
            System.exit(0);
        }
    }

    public static void check(int num) {
        if (field[0] == num && field[1] == num && field[2] == num) {
            endGame(num);
        } else if (field[0] == 1 && field[3] == num && field[6] == num) {
            endGame(num);
        } else if (field[0] == num && field[7] == num && field[8] == num) {
            endGame(num);
        } else if (field[0] == num && field[4] == num && field[8] == num) {
            endGame(num);
        } else if (field[2] == num && field[5] == num && field[8] == num) {
            endGame(num);
        } else if (field[6] == num && field[4] == num && field[2] == num) {
            endGame(num);
        } else if (field[1] == num && field[4] == num && field[7] == num) {
            endGame(num);
        } else if (field[3] == num && field[4] == num && field[5] == num) {
            endGame(num);
        }
    }

    public static int[] getField() {
        return field;
    }
}
