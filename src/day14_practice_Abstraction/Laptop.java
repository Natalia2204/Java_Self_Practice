package day14_practice_Abstraction;

public class Laptop extends  PersonalComputer{

    public Laptop(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }
}
/*
8. Create the Following Subclasses of Computer:
    - 'PersonalComputer':
        - Desktop
        - Laptop
 */