package day14_practice_Abstraction;

public abstract class Phone extends Device {
    public Phone(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    public String call(String phoneNum){
        return  ("Call " + phoneNum);
    }
    public String  text(String phoneNum){
        return  ("Text " + phoneNum);
    }

    @Override
    public String turnOn() {
        return "Turn On - Press and hold the power button";
    }

    @Override
    public String turnOff() {
        return "TurnOff - Press and hold down the Power button ";
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean isHasBattery() {
        return super.isHasBattery();
    }

    @Override
    public boolean isHasPowerButton() {
        return super.isHasPowerButton();
    }
}
/*
2. Create a Child Abstract Class of Device Named 'Phone':
    - Extra Non-Abstract Methods:
        - call(long phoneNum)
        - text(long phoneNum)
        - toString()
 */