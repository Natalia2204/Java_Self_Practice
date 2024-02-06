package day12_practice_OOP;

public class CandyClients {
    public static void main(String[] args) {
        Candy candy1 = new Candy();

        candy1.setBrand("Mars");
        candy1.setQuantity(10);
        candy1.setPrice(0);
        candy1.setHasPeanuts(false);

        System.out.println(candy1.toString());


    }
}
