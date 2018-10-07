package phones;

public class Test {
    public static void main(String[] args) {
        Nokia3310 nokia = new Nokia3310();
        System.out.println("Nokia3310 screen size is: " + nokia.getScreenSize());
        nokia.call("123-45-67");
        nokia.sendSms("567-78-89","text message");

        System.out.println("----------------------");

        Iphone iphone = new Iphone();
        System.out.println("Iphone screen size is: " + iphone.getScreenSize());
        iphone.call("123-45-67");
        iphone.sendSms("567-78=89","text message");

        System.out.println("----------------------");

        Iphone5 iphone5 = new Iphone5();
        System.out.println("Iphone5 screen size is: " + iphone5.getScreenSize());
        iphone5.call("123-45-67");
        iphone5.sendSms("567-78-89","text message");

        System.out.println("----------------------");

        SamsungS4 samsung = new SamsungS4();
        System.out.println("SamsungS4 screen size is: " + samsung.getScreenSize());
        samsung.call("123-45-67");
        samsung.sendSms("567-78-89","text message");

    }
}
