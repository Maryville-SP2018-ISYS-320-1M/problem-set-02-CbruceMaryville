import java.util.Scanner;
/*
	ISYS 320
	Name(s):Clayton Bruce
	Date: 4/15/2018
*/

public class P5_StairMaster {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		System.out.println("Give me the Number of stairs: ");
		int numStairs;

		numStairs = console.nextInt();

		System.out.println("Give me the width");
		int width;

		width = console.nextInt();

		System.out.println();

		Stairs(numStairs, width);

	}

	// I have no clue how to go about this...
	public static void Stairs(int numStairs, int width) {
		for (int i = 0; i < numStairs; i++) {
			for (int f = 0; f < width; f++) {
				System.out.print("*");
				System.out.println();
				System.out.print("*");
			}
		}
	}

}
