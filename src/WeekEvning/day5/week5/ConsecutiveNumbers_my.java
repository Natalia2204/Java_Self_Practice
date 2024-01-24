package WeekEvning.day5.week5;

public class ConsecutiveNumbers_my {

    public static void main(String[] args) {

        System.out.println(consecutiveNumbers(31));
    }

    public static String consecutiveNumbers(int n) {

        String result = "";

        for (int i = 1; i <= n; i++) {

            String temp = "";

            if (i % 2 == 0) {
                temp += "Codility";
            }
            if (i % 3 == 0) {
                temp += "Test";
            }
            if (i % 5 == 0) {
                temp += "Coders";
            }
            if (temp.isEmpty()) {
                temp += "" + i;
            }
            result += temp + "\n";
        }
        return result;
    }
}
