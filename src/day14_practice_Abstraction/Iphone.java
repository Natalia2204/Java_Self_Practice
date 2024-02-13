package day14_practice_Abstraction;

public class Iphone extends Phone implements Downloadable, AppleApps{

    public Iphone(String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super("Apple", model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public String call(String phoneNum) {
        return super.call(phoneNum);
    }

    @Override
    public String text(String phoneNum) {
        return super.text(phoneNum);
    }

    @Override
    public String downloadApp() {
        return "Download App - App Store";
    }

}
/*
7. Create the Following Subclasses of Phone:
    - 'Iphone':
        - Extends Phone class.
        - Implements Downloadable & AppleApps interfaces.
 */