package day14_practice_Abstraction;

public class Honda extends Car{

    public Honda(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public String start() {
        return "Start is Engine Start";
    }

    @Override
    public String drive() {
        return "Drive is Front-wheel-drive";
    }
}
/*
 Create a Subclass of Car Named 'Honda'.
 */