package day14_practice_Abstraction;

public class Mercedes extends Car implements AutoPark{
    public Mercedes(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public String autoPark() {
        return "Automated parking function INTELLIGENT PARK PILOT";
    }

    @Override
    public String start() {
        return "Start is Remote engine start";
    }

    @Override
    public String drive() {
        return "Start is All-wheel-drive";
    }
}
/*
8. Create two Subclasses of Car ('Audi' and 'Mercedes') that Implement the AutoPark Interface.
 */