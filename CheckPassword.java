//My password18 - Invalid password
//pass18 - Invalid password
//password@ - Invalid password
//password18 - Valid password

import java.util.Scanner;
public class CheckPassword {

	public static void main(String[] args) {
		//Collects the users password
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter your password: ");
		
		String p = input.nextLine();
		//Collects the results of the two methods for testing the password
		boolean isAtLeast8 = AtLeast8(p);
		
		boolean isLetterDigi = LetterOrDigit(p);

		input.close();
		//Logic to tell the user of a valid or invalid password
		if (isAtLeast8 == true && isLetterDigi == true) {
			
			System.out.println("Valid Password");
			
		}
		
		else System.out.println("Invalid Password");
			
	}
	//Tests the Passwords length
	public static boolean AtLeast8(String p) {
		
		boolean AtLeast8 = true ;
		
		if (p.length() < 8) {
			
			AtLeast8 = false;

		}
		
		return AtLeast8;
		
	}
	//Tests the characters in the passwords
	public static boolean LetterOrDigit(String p) {
		
		boolean LetterDigi = true;
		
		if(p.matches("^[a-zA-Z0-9]*")) {
			
		}
		else LetterDigi = false;
		
		return LetterDigi;
		
	}

}