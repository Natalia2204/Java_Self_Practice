package day14_practice_Abstraction;

public class Audi extends Car implements AutoPark{

    public Audi(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public String autoPark() {
        return "Autopark handles steering, paddles";
    }

    @Override
    public String start() {
        return "Wheel Drive Engine";
    }

    @Override
    public String drive() {
        return "All-wheel drive";
    }
}
/*
8. Create two Subclasses of Car ('Audi' and 'Mercedes') that Implement the AutoPark Interface.
 */