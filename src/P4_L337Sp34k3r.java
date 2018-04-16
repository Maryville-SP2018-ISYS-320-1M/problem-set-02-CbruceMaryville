import java.util.Scanner;
/*
	ISYS 320
	Name(s):Clayton Bruce
	Date: 4/15/2018
*/


//EVERYTHING WORKS EXCEPT THE FACT THAT I CANT GET THE LETTERS TO GO PERMA CAPITALIZED***
public class P4_L337Sp34k3r {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		//String[] array = new String[3];

		// taking a line splitting it and putting it into a string array
		//Print out all uppercase like asked 
		
		//I have no idea how to change the letters to numbers or symbols
		System.out.println("Give me three words to make L334: ");
		String input;
		input = console.nextLine();

		String[] SS = input.split("\\s+");
		String[] USS = new String[3];
		//Setting all letters in the split string to uppercase
		for(int i = 0; i < SS.length; i++) {
			SS[i].toUpperCase();
			USS[i] = SS[i];
		}
		
		
		for (int i = 0; i < USS.length; i++) {
		
			//found the contains and replace functions and testing to see if viable
			if(USS[i].contains("A")) {
				USS[i] = USS[i].replace("A", "4");
				//System.out.println(SS[i]);
			}	
			 if(USS[i].contains("E")) {
				USS[i] = USS[i].replace("E", "3");
				//System.out.println(SS[i]);
			}
			if(USS[i].contains("T")) {
				USS[i] = USS[i].replace("T", "7");
				//System.out.println(SS[i]);
			}
			if(USS[i].contains("O")) {
				USS[i] = USS[i].replace("O", "()");
				//System.out.println(SS[i]);
			}
				System.out.println(USS[i]);
			
			
	}

}
}

// All letters CAPS
// a = 4
// e = 3
// t = 7
// o = ()
