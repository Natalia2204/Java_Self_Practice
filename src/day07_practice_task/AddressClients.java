package day07_practice_task;

public class AddressClients {
    public static void main(String[] args) {

        Address address = new Address();

        address.buildingNumber = 7925;
        address.street = "Jones Branch Dr";
        address.city = "McLean";
        address.state = "VA";
        address.zipCode = "22012";

        System.out.println(address);



    }
}
