package phones;

public abstract class Phone {
    protected boolean touch;
    protected boolean hasWifi;
    protected int screenSize;

    protected int callCounter; //Счетчики звонков и смс
    protected int smsCounter;

    public Phone() {
        System.out.println("Phone constructor");
    }

    public boolean isTouch() {
        return touch;
    }

    public boolean isHasWifi() {
        return hasWifi;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void call(String number) {
        System.out.println("Phone class is calling " + number);
        callCounter++;
    }

    public abstract void sendSms(String number, String message);
}
