import java.util.Scanner;

/*
	ISYS 320
	Name(s):Clayton Bruce
	Date: 4/15/2018
*/

public class P3_YouAndYourAge {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		System.out.println("Give me your Name ");
		String name = console.nextLine();
		
		System.out.println("Now what is your age? ");
		int age = console.nextInt();
		
		
		System.out.println("Wow " + name + " you've been alive "+ age +" years? Amazing.");
		
	}

}
