package weekMoning;

public class Carpet {

    public double width;
    public double length;
    public double unitPrice;
    public boolean isPersian;

    public Carpet(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }


    public double calcCost() {

        double cost = 0;
        if (isPersian) {
            cost = width * length * unitPrice + 200;
        }else {
            cost = width * length * unitPrice ;
        }
        return cost;
    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                '}';
    }
}
/*
1. Create a custom class named Carpet with the following specifications:

    Attributes:
        width
        length
        unitPrice
        isPersian

    Actions:
        calcCost(): Calculates and returns the total price of the carpet.

        toString(): Returns a string representation of the carpet object with full
        information, including the total cost calculated by calcCost().

    The formula to calculate the price of the carpet is as follows:
        Total price of carpet = (width * length) * unitPrice
        If the carpet is a Persian carpet, add $200 to the totalPrice.
 */