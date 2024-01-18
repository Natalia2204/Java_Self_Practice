package day03_practice_tasks;

public class Task11 {
    public static void main(String[] args) {
        int score = 80;

        if (score >= 0 & score <=59 ) {
            System.out.println("Grade F");
        } else if (score >= 60 & score <=69 ){
                System.out.println("Grade D");
            } else if (score >= 70 & score <=79) {
            System.out.println("Grade C");
        } else if (score >= 80 & score <=89) {
            System.out.println("Grade B");
        } else if (score > 90 & score <=100) {
            System.out.println("Grade A");
        }else {
            System.out.println("Not correct grade");
    }

    }
}
