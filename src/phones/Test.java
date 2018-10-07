package phones;

public class Test {
    public static void main(String[] args) {

        Nokia3310 nokia = new Nokia3310();
        System.out.println("Nokia3310 screen size is: " + nokia.getScreenSize());
        nokia.call("123-45-67");
        nokia.sendSms("567-78-89", "text message");
        System.out.println("Nokia3310 called for " + nokia.callCounter + " time(s).");
        System.out.println("Nokia3310 send sms fo r" + nokia.smsCounter + " time(s).");

        System.out.println("----------------------");

        Iphone iphone = new Iphone();
        System.out.println("Iphone screen size is: " + iphone.getScreenSize());
        iphone.call("123-45-67");
        iphone.sendSms("567-78=89", "text message");
        System.out.println("Iphone called for " + iphone.callCounter + " time(s).");
        System.out.println("Iphone send sms for " + iphone.smsCounter + " time(s).");

        System.out.println("----------------------");

        Iphone5 iphone5 = new Iphone5();
        System.out.println("Iphone5 screen size is: " + iphone5.getScreenSize());
        iphone5.call("123-45-67");
        iphone5.sendSms("567-78-89", "text message");
        System.out.println("Iphone5 called for " + iphone5.callCounter + " time(s).");
        System.out.println("Iphone5 send sms for " + iphone5.smsCounter + " time(s).");

        System.out.println("----------------------");

        SamsungS4 samsung = new SamsungS4();
        System.out.println("SamsungS4 screen size is: " + samsung.getScreenSize());
        samsung.call("123-45-67");
        samsung.sendSms("567-78-89", "text message");
        System.out.println("SamsungS4 called for " + samsung.callCounter + " time(s).");
        System.out.println("SamsungS4 send sms for " + samsung.smsCounter + " time(s).");


    }
}
