package car;

public class Test {
    public static void main(String[] args) {
        Car bmw = new Car("BMW", 10000, 1.8);
        Car ferrari = new Car("Ferrari", 20000, 2.3);
        bmw.turnOn();
        ferrari.turnOn();

        bmw.addGas(60); //Заправляем
        ferrari.addGas(70);

        final int[] speeds = {20, 60, 100};
        for (int s : speeds)
            bmw.start(s, 0.5);
        for (int s : speeds)
            ferrari.start(s, 1);

        bmw.turnOff();
        ferrari.turnOff();


        System.out.println(bmw.getName() + ": " + bmw.getMileage());
        System.out.println(ferrari.getName() + ": " + ferrari.getMileage());;
        System.out.println("\nGas left: " + bmw.getName() + " - " + bmw.checkGas());
        System.out.println("Gas left: " + ferrari.getName() + " - " + ferrari.checkGas());
    }

}
