package day03_practice_tasks;

public class Task13 {
    public static void main(String[] args) {

        double n = 1234 % 10;
        System.out.println("n = " + n);

        System.out.println(3+5 + "Cydeo" + (3 + 5));

        System.out.println("8" + 12 * 2 + 4);
        System.out.println(4 + 17 % 2 + "Cydeo" + 1 + 5);

        int x = 2, y = 3, z = 9;
       // y *= x + 5;
        // z %= y;
        z += 2.5;

        System.out.println(y);
        System.out.println(z);

        int a = 1;
        a = a++ + a++ / --a * --a; // 1 + 1

        System.out.println(a);

        int b = 2;
        boolean result = (++b == 2 || b == 2) && --b == 2;
        // false && false ==> false
        System.out.println(result); //false
        System.out.println(b); //3 becous &&

           boolean b1 = true, b2 = true;
           int k = 20;
           b1 = (k != 10) || (b2 = false);

        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);



    }
}
