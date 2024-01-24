package day04_practice_tasks;

public class TrafficLigh {
    public static void main(String[] args) {
        String lightColor = "Y";
        switch (lightColor){
            case "R" -> System.out.println("Red");
            case "Y" -> System.out.println("Yellow");
            case "G" -> System.out.println("Green");
            default -> System.out.println("Invalid Color");
        }
    }
}
