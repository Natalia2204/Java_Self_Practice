package day13_practice_Inheritance;

public class PhoneClients {
    public static void main(String[] args) {

        IPhone iPhone = new IPhone("IPhone", "15", "8", 900, "Black");
        Samsung samsung = new Samsung("Samsung", "12", "9", 600, "White");
        Nokia nokia =new Nokia("Nokia", "15A", "7", 280,"Red");

        iPhone.call(1236787);
        samsung.text(7895432);
        nokia.faceTime(4569802);

        System.out.println(iPhone.toString());
        System.out.println(samsung.toString());
        System.out.println(nokia.toString());

    }
}
/*
4. Create a class named "PhoneClients":
   - Create multiple objects representing different phones.
   - Test the methods and variables of each object.
 */