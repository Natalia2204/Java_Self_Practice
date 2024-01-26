package task_of_day;

public class Manipulation {
    public static void main(String[] args) {

        String name = "  bruce lee ";
        System.out.println(manipulation(name));
    }
    public static String manipulation(String name) {

        String trimmeName = name.trim();
        return (trimmeName.substring(0, 1) + '.' + trimmeName.charAt(trimmeName.indexOf(' ') + 1) + '.').toUpperCase();
    }
}

