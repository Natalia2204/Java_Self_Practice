package day14_practice_Abstraction;

public abstract class Computer extends Device {
    public Computer(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

}
/*
3. Create a Child Abstract Class of Device Named 'Computer':
    - Add extra methods as needed.
 */