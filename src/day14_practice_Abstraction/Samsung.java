package day14_practice_Abstraction;

public class Samsung extends Phone implements  Downloadable, AndroidApps{

    public Samsung(String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super("Samsung", model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public String downloadApp() {
        return "Download App - Galaxy Store";
    }
}
/*
Create the Following Subclasses of Phone:
 'Samsung':
        - Extends Phone class.
        - Implements Downloadable & AndroidApps interfaces.
 */
