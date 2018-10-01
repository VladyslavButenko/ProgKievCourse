public class Computer {
    public void makeMove() {
        while (true) {
            int turn = (int) (1 + Math.random() * 8);
            if (Field.getField()[turn] == 0) {
                Field.getField()[turn] = 2;
                break;
            }
        }
    }
}
