package Day06_practice_While;

public class Task6_Cube {
    public static void main(String[] args) {

        int num = cube(3);
        System.out.println("num = " + num);

    }
    public static int cube (int a){
        int square = a * a * a;

        return square;
    }
}
/*
 Create a method named cube that takes an int and returns the cube, hierarchically calling the
	square method to calculate the cube.

			Example:
				int num = cube(3);

			Output:
				9

	5.6 Overload the cube method for double numbers.

			Example:
				double num = cube(2.5);

			Output:
				15.625
 */