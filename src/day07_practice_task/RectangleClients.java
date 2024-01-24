package day07_practice_task;

public class RectangleClients {
    public static void main(String[] args) {
        
        Rectangle rectangle = new Rectangle();
            rectangle.width = 12.5;
            rectangle.length = 10.5;

            rectangle.calculateArea();
        //System.out.println("rectangle = " + rectangle);
        
        rectangle.calculatePerimeter();
        System.out.println("rectangle = " + rectangle);
        
    }
}
