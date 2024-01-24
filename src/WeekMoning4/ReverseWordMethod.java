package WeekMoning4;

public class ReverseWordMethod {
    public static void main(String[] args) {

        System.out.println("\"" + reverse("Cydeo")+ "\"" );
    }
    public static String reverse (String original){

        String reverse = "";
        for (int i = original.length()-1 ;i>=0  ; i--) {

            reverse+=original.charAt(i);

        }
        return reverse;
    }
}
