package day14_practice_Abstraction;

public class DeviceShop {
    public static void main(String[] args) {

        Iphone iphone13 = new Iphone( "Iphone 13", 900, "White", "6.1", true, true);
        System.out.println(iphone13.toString());
        System.out.println(iphone13.downloadApp());
        System.out.println(iphone13.turnOff());
        System.out.println(iphone13.turnOn());
        System.out.println(iphone13.call("234-79-06"));
        System.out.println(iphone13.text("908-64-53"));

        Samsung samsungS23 = new Samsung("S23", 750, "Black", "6.1", true,true);
        System.out.println(samsungS23.toString());
        System.out.println(samsungS23.call("453-90-77"));
        System.out.println(samsungS23.text("564-12-00"));
        System.out.println(samsungS23.downloadApp());
        System.out.println(samsungS23.turnOff());
        System.out.println(samsungS23.turnOn());

        Google google8 = new Google("Pixel 8", 700, "White", "6.2", true, true);
        System.out.println(google8.toString());
        System.out.println(google8.downloadApp());
        System.out.println(google8.turnOff());
        System.out.println(google8.call("788-23-76"));

    }


}
/*
9. Create a Class Named 'DeviceShop':
    - Instantiate an object from each concrete class.
    - Test all functions of each object.
    - Analyze the relationships between the classes.
 */