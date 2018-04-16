import java.util.Scanner;
/*
	ISYS 320
	Name(s):Clayton Bruce
	Date: 4/15/2018
*/


public class P4_L337Sp34k3r {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		//String[] array = new String[3];

		// taking a line splitting it and putting it into a string array
		//Print out all uppercase like asked 
		
		System.out.println("Give me three words to make L334: ");
		String input;
		input = console.nextLine();

		String[] SS = input.split("\\s+");
		
		for (int i = 0; i < SS.length; i++) {
		
			//found the contains and replace functions and testing to see if viable
			if(SS[i].contains("A")) {
				SS[i] = SS[i].replace("A", "4");	
			}
			if(SS[i].contains("a")) {
				SS[i] = SS[i].replace("a", "4");	
			}
			 if(SS[i].contains("E")) {
				SS[i] = SS[i].replace("E", "3");
			}
			 if(SS[i].contains("e")) {
				SS[i] = SS[i].replace("e", "3");
			}
			if(SS[i].contains("T")) {
				SS[i] = SS[i].replace("T", "7");
			}
			if(SS[i].contains("t")) {
				SS[i] = SS[i].replace("t", "7");
			}
			if(SS[i].contains("O")) {
				SS[i] = SS[i].replace("O", "()");
			}
			if(SS[i].contains("o")) {
				SS[i] = SS[i].replace("o", "()");
			}
				System.out.println(SS[i]);
			
			
	}

}
}

// All letters CAPS
// a = 4
// e = 3
// t = 7
// o = ()
