public class Test {
    public static void main(String[] args) {
        Player player = new Player();
        Computer computer = new Computer();
        System.out.println("/----------ДОБРО ПОЖАЛОВАТЬ----------\\");
        System.out.println("Введите 'save' для сохранения игры, или 'load' для загрузки.");
        Field.draw();
        for (int count = 0; count < 5; count++) {
            player.makeMove();
            Field.check(1);
            computer.makeMove();
            Field.check(2);
            Field.draw();
        }
    }
}
