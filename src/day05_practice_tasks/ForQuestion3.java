package day05_practice_tasks;

public class ForQuestion3 {
    public static void main(String[] args) {
        int k = 0;
        int m = 0;

        for(int i = 0; i <= 3; i++) {
            k++;
            m++;
            if(i == 2){
                i = 4;
            }

        }
        System.out.println(k + "," + m);
    }
}
