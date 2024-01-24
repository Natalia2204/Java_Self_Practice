package day03_practice_tasks;

public class Task1 {
    public static void main(String[] args) {
        int x = 2;
        int y = x++;
        System.out.println("y = " + y); //y=2
        System.out.println("x = " + x);//x=3

        int a = 2;
        System.out.println(a++);// a=2
        System.out.println("a = " + a); //a=3
        int b = 2;
        System.out.println(--b); //b=1
        System.out.println("b = " + b);

        int m = 8;
        int n = m--;
        System.out.println(n);// n=8,
        System.out.println(m); // m=7

    }
}
