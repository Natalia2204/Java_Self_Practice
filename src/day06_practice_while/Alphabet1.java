package day06_practice_while;

public class Alphabet1 {
    public static void main(String[] args) {
        String result = "";

        for (char i = 'A'; i < 'F'; i++) { // outer loop: i ==> A ~ E

            for (char j = 'a'; j <= 'z'; j++) { // inner loop: j -> 'a' ~ 'z'
                result += i;
                result += j + " ";
            }
            result += "\n";
        }
        System.out.println(result);
    }
}
