package day14_practice_Abstraction;

public class BMW extends Car{

    public BMW(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public String start() {
        return "Start is Remote engine start";
    }

    @Override
    public String drive() {
        return "Drive is in both rear-wheel drive and all-wheel drive versions1";
    }
}
/*
Create a Subclass of Car Named 'BMW'
 */