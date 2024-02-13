package day14_practice_Abstraction;

public class Toyota extends Car {

    @Override
    public String start() {
        return "Start is LOCK button";
    }

    @Override
    public String drive() {
        return "Drive is All-Wheel Drive";
    }

    public Toyota(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }
}
/*
Create a Subclass of Car Named 'Toyota'.
 */