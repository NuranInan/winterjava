package day12dowhileloop;

import java.util.Scanner;

public class DoWhileLoop03 {

	public static void main(String[] args) {
		checkLength();	

	}
	/*
	 * Ask user to enter password 
	 * If the password has more than 6 characters print "It is okay"
	 * Otherwise, print "Make the password longer than 6 characters" and ask the user "Enter a new password"
	 */

	
	
	
	
	public static void checkLength() {
		Scanner scan = new Scanner(System.in);
		String psw= "";
		do {
			
			System.out.println("Enter password");
			 psw=scan.nextLine();  //may be user wants to use space as character
			
			if(psw.length()>6) {
				System.out.println("Password is valid");
			}else {
				System.out.println("Make the password longer than 6 character");
			}
			
		}while(psw.length()<=6);
		
		scan.close();
	}
}
