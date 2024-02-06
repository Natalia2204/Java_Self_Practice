package day12_practice_OOP;

public class ItemClients {
    public static void main(String[] args) {

        Item item1 = new Item();
        item1.setName("Jen");
        item1.setUnitPrice(12.0);
        item1.setQuantity(10);

        System.out.println(item1.toString());
        System.out.println(item1.calcCost());

    }
}
