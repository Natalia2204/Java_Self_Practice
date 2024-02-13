package day14_practice_Abstraction;

public class Nio extends Car implements AutoPilot{

    public Nio(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public String autoPark() {
        return "Autopark Nio";
    }

    @Override
    public String selfDrive() {
        return "Can self Drive ";
    }

    @Override
    public String start() {
        return "Starts with the ignition key.";
    }

    @Override
    public String drive() {
        return  "All-wheel drive car.";
    }
}
/*
9. Create two Subclasses of Car ('Tesla' and 'Nio') that Implement both AutoPark and AutoPilot Interfaces.
 */