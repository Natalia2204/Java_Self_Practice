package day14_practice_Abstraction;

public class Google extends Phone implements Downloadable,AndroidApps{
    public Google(String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super("Google", model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public String downloadApp() {
        return "Download App -  Play Store app";
    }
}
/*
7. Create the Following Subclasses of Phone
 - 'Google':
        - Extends Phone class.
        - Implements Downloadable & AndroidApps interfaces.
 */
