package phones;

public class Iphone extends Phone {
    protected String imei;
    public Iphone(){
        System.out.println("Iphone constructor");
        touch = true;
        hasWifi = true;
        screenSize = 3;
    }

    @Override
    public void call(String number) {
        super.call(number);
        System.out.println("Iphone is calling " + number);
    }

    @Override
    public void sendSms(String number, String message) {
        System.out.println("Iphone5 class is sending SMS " + message + " to " + number);
    }
}