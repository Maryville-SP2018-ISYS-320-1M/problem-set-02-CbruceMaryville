import java.util.Scanner;
/*
	ISYS 320
	Name(s):Clayton Bruce
	Date: 4/15/2018
	Edited on : 4/23
	Still confused
*/

public class P5_StairMaster {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		System.out.println("Give me the Number of stairs: ");
		int height;

		height = console.nextInt();

		System.out.println("Give me the width of each stair : ");
		int width;

		width = console.nextInt();
		
		//Confused on how to get the number of spacers
		System.out.println("Give me the number of spacers: ");
		int NumOfSpacers;
		
		NumOfSpacers = console.nextInt();

	
		
		for(int row= 0; row <height; row++) {
			PrintWall(height);
			PrintSpace(NumOfSpacers, width);
			PrintStep(width);
			System.out.println();
			
		}

	}

	public static void PrintStep(int width) {
		for (int i = 0; i < width; i++) {
			System.out.print("*");
			System.out.print("*");
		}

	}

	public static void PrintSpace(int NumOfSpacers, int width) {
		for (int x = 0; x < NumOfSpacers; x++) {
			for (int i = 0; i < width; i++) {
				System.out.print(" ");
				System.out.print(" ");
			}
		}

	}
	//changing wall to || so see where they are showing up
	public static void PrintWall(int numStair) {
		for (int i = 0; i <= numStair; i++) {
			System.out.print("||");
			//System.out.print("||");
		}
	}

	

}
