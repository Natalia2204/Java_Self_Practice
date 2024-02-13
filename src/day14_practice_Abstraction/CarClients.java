package day14_practice_Abstraction;

public class CarClients {
    public static void main(String[] args) {

        Toyota toyota = new Toyota("Toyota", "Corolla",2012, 45000, "white");

        System.out.println(toyota.toString());
        System.out.println(toyota.start());
        System.out.println(toyota.drive());
        toyota.stop();


        Honda honda = new Honda("Honda", "Civic", 2019,35000, "Red");

        System.out.println(honda.toString());
        System.out.println(honda.start());
        System.out.println(honda.drive());

        BMW bmw = new BMW("BMW", "X5", 2020, 80000, "Black");
        System.out.println(bmw.toString());
        System.out.println(bmw.start());
        System.out.println(bmw.drive());

        Mercedes mercedes = new Mercedes("Mercedes-Benzmercedes","EQE SUV", 2016, 78000,"White");

        System.out.println(mercedes.toString());
        System.out.println(mercedes.autoPark());
        System.out.println(mercedes.start());

        Tesla tesla = new Tesla("Tesla", "M3", 2018, 40000, "Black");
        System.out.println(tesla.toString());
        System.out.println(tesla.autoPark());
        System.out.println(tesla.selfDrive());
        System.out.println(tesla.getMake() + " hasAutopark is " + Tesla.hasAutoPark);
        System.out.println(tesla.getMake() + " hasAutoPilot is " +Tesla.hasAutoPilot);

        CydeoCar cydeoCar = new CydeoCar("Cydeo", "Cydeo 15", 2020, 500000, "Green");
        System.out.println(cydeoCar.toString());
        System.out.println(cydeoCar.getMake() + " hasAutopark is " + CydeoCar.hasAutoPark);
        System.out.println(cydeoCar.getMake() + " hasAutoPilot is  " + CydeoCar.hasAutoPilot);
        System.out.println(cydeoCar.autoPark());
        System.out.println(cydeoCar.selfDrive());
        System.out.println(cydeoCar.fly());



    }

}
/*
11. Create a Class Named 'CarClients':
    - Instantiate an object from each concrete class.
    - Test all functions of each object.
    - Analyze the relationships between the classes.
 */