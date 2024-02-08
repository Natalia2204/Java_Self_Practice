package day13_practice_Inheritance;

public class StateClients {
    public static void main(String[] args) {
        State texas = new State("Texas", "TX", "Republican", "Greg Abbott", "Ted Cruz", 29000000);
        System.out.println(texas.toString());

    }
}
