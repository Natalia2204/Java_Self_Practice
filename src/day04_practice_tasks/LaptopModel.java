package day04_practice_tasks;

public class LaptopModel {
    public static void main(String[] args) {
        String laptopModel = "hp";

        switch (laptopModel){
            case "apple" -> System.out.println("Apple - no virus");
            case "dell" -> System.out.println("Tough one");
            case "hp" -> System.out.println("Not recommended");
            default -> System.out.println("Do not buy that one");


        }
    }
}
