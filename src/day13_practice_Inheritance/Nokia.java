package day13_practice_Inheritance;

public class Nokia extends IPhone {
    public static void main(String[] args) {
        Nokia nokia = new Nokia("Nokia", "9A", "6", 160, "Blue" );
        System.out.println(nokia.toString());
        nokia.call(8769834);
        nokia.text(4568712);
        nokia.faceTime(3426743);
    }

    public Nokia(String brand, String model, String size, double price, String color) {
        super(brand, model, size, price, color);
    }




    @Override
    public String getBrand() {
        return super.getBrand();
    }

    @Override
    public void setBrand(String brand) {
        super.setBrand(brand);
    }

    @Override
    public String getModel() {
        return super.getModel();
    }

    @Override
    public void setModel(String model) {
        super.setModel(model);
    }

    @Override
    public String getSize() {
        return super.getSize();
    }

    @Override
    public void setSize(String size) {
        super.setSize(size);
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public void setPrice(double price) {
        super.setPrice(price);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public void call(int phoneNumber) {
        super.call(phoneNumber);
    }

    @Override
    public void text(int phoneNumber) {
        super.text(phoneNumber);
    }

    @Override
    public void faceTime(int phoneNumber) {
        super.faceTime(phoneNumber);
    }

    @Override
    public String toString() {
        return super.toString();
    }


}
/*
3. Create a class named 'Nokia' with these specifications:
   Attributes:
       - Same as IPhone.

   Encapsulation:
       - Same conditions as IPhone.

   Constructor:
       - Same as IPhone.

   Actions:
       - call(phoneNumber): Display "calling the number [phoneNumber]".
       - text(phoneNumber): Display "texting to the number [phoneNumber]".
       - toString(): Prints the information of the Nokia object.
 */