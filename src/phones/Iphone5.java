package phones;

public class Iphone5 extends Iphone {
    public Iphone5(){
        System.out.println("Iphone5 constructor");
        screenSize = 4;
        imei = "1111111";
    }

    @Override
    public void call(String number) {
        super.call(number);
        System.out.println("Iphone5 is calling " + number);
    }

    @Override
    public void sendSms(String number, String message) {
        System.out.println("Iphone5 class is sending SMS " + message + " to " + number);
        smsCounter++;
    }
}
