package car;

public class Engine {
    private double mileage;
    private boolean started;
    private double volume; //Объем двигателя.

    public Engine(double mileage) {
        this.mileage = mileage;
    }

    public Engine(double mileage, double volume) {
        this.mileage = mileage;
        this.volume = volume;
    }

    public double getMileage() {
        return mileage;
    }

    public void addMileage(double mileage) {
        if (started)
            this.mileage += mileage;
    }

    public boolean isStarted() {
        return started;
    }

    public void turnOn() {
        started = true;
    }

    public void turnOff() {
        started = false;
    }

    //Геттер и сеттер для объема.

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}
