package day04_practice_tasks;

public class HttpStatusCode {
    public static void main(String[] args) {
        int cod = 202;

        switch (cod){
            case 200 -> System.out.println("Ok");
            case 201 -> System.out.println("Created");
            case 202 -> System.out.println("Accepted");
            case 301 -> System.out.println("Moved Permanently");
            case 303 -> System.out.println("See Other");
        }
    }
}
