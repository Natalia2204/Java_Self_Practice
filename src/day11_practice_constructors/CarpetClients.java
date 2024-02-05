package day11_practice_constructors;

public class CarpetClients {
    public static void main(String[] args) {
        Carpet carpet1 = new Carpet(3,4,100,true);
        double totalCostCarpet1 = carpet1.calcCost();
        System.out.println(totalCostCarpet1);
    }
}
