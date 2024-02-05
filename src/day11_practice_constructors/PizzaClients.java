package day11_practice_constructors;

public class PizzaClients {
    public static void main(String[] args) {

        Pizza pizza1 = new Pizza("large", 3, 2);
        int totalCost1 = pizza1.calcCost();
        System.out.println(totalCost1);

        Pizza pizza2 = new Pizza("small", 2, 1);
        int totalCost2 = pizza2.calcCost();
        System.out.println(totalCost2);
    }
}
