
/*
  	ISYS 320
  	Name(s):Clayton Bruce
  	Date: 4/15/2018
*/
public class P1_NumbersRightMethod {

	public static void main(String[] args) {
		drawNumbersRight(8);
	}

	// having trouble making this nested loops I'm bad at nested for loops!
	public static void drawNumbersRight(int height) {

		for (int row = 1; row < height + 1; row++) {
			for (int spaces = 1; spaces <= height - row; spaces++) {
				System.out.print(" ");
			}
			for (int Column = 1; Column <= row; Column++) {
				System.out.print(row);

			
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();
	}
}
