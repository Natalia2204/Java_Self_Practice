package day12_practice_OOP;

public class RectangleClients {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle();

        rectangle1.setWidth(2);
        rectangle1.setLength(3);

        //System.out.println(rectangle1.getWidth());
        //System.out.println(rectangle1.getLength());

        System.out.println(rectangle1.toString());
        System.out.println("area is " + rectangle1.calcArea());
        System.out.println("perimeter is " + rectangle1.calcPerimeter());


    }
}

