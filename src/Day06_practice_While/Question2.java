package Day06_practice_While;

public class Question2 {
    public static void main(String[] args) {

        int start = 1;
        int sum = 0;

        do {
            if(start % 2 == 0){
                start++;
            }
            sum += start;

        } while(++start <= 10);

        System.out.println(sum);
    }
}
