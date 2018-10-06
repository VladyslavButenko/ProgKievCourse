package car;

public class Car {
    private String name;
    private Engine engine;
    private double gasTank; //Поле бензобак
    private Climate climate = new Climate();

    public Car(String name) {
        this.name = name;
    }

    public Car(String name, double mileage) {
        this.name = name;
        engine = new Engine(mileage);
    }

    public Car(String name, double mileage,double volume) { //Конструктор, в котором можно указать объем.
        this.name = name;
        engine = new Engine(mileage);
        engine.setVolume(volume);
    }

    public String getName() {
        return name;
    }

    public double getMileage() {
        return engine.getMileage();
    }

    public void turnOn() {
        engine.turnOn();
        climate.turnOn();
        climate.setTemperature(21);
    }

    public void turnOff() {
        climate.turnOn();
        engine.turnOn();
    }

    public void start(int speed, double hours) {
        if (engine.isStarted()) {
            double distance = hours * speed;
            engine.addMileage(distance);

            double wastedFuel = (distance*engine.getVolume()*0.1); //Расчет потраченного топлива
            gasTank -= wastedFuel;
        }
    }

    public void addGas(double volume) {
        gasTank += volume;
    }

    public double checkGas() { //Проверка бензина
        return gasTank;
    }

}
