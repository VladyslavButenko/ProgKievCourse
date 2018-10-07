package phones;

public class SamsungS4 extends Phone{
    public SamsungS4(){
        System.out.println("SamsungS4 constructor");
        screenSize = 5;
        hasWifi = true;
    }
    @Override
    public void call(String number) {
        super.call(number);
        System.out.println("SamsungS4 is calling " + number);
    }

    @Override
    public void sendSms(String number, String message) {
        System.out.println("SamsungS4 class is sending SMS " + message + " to " + number + " Hello");
        smsCounter++;
    }
}
