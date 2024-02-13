package day14_practice_Abstraction;

public class CydeoCar extends Car implements AutoPilot, Flyable{
    public CydeoCar(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public String autoPark() {
        return "Autopark handles steering";
    }

    @Override
    public String selfDrive() {
        return "Full Self-Driving";
    }

    @Override
    public String start() {
        return "Wheel Drive Engine";
    }

    @Override
    public String drive() {
        return "Drive is rear-wheel drive";
    }

    @Override
    public String fly() {
        return "Can fly";
    }
}
/*
10. Create a Subclass of Car Named 'CydeoCar' that Implements AutoPark, AutoPilot, and Flyable Interfaces.
 */