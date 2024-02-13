package day14_practice_Abstraction;

public class Tesla extends Car implements AutoPilot {
    public Tesla(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }


    @Override
    public String autoPark() {
        return "Autopark handles steering, paddles and shifting";
    }

    @Override
    public String selfDrive() {
        return "Full Self-Driving (Beta) capabilities evolv";
    }

    @Override
    public String start() {
        return "Wheel Drive Engine";
    }

    @Override
    public String drive() {
        return "All-wheel drive car";
    }
}
/*
9. Create two Subclasses of Car ('Tesla' and 'Nio') that Implement both AutoPark and AutoPilot Interfaces.
 */