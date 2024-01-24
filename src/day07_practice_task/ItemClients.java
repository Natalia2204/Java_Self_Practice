package day07_practice_task;

public class ItemClients {
    public static void main(String[] args) {
        
        Item item = new Item();
        
        item.itemName = "box";
        item.unitPrice = 30;
        item.quantity = 50;

        
        item.calcCost();
        System.out.println("item = " + item);


        
        
    }
}
