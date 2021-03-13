package day02scanner;

import java.util.Scanner;

public class ScannerClass06 {
	
	/*
	 * Ask user to enter his/her full name
	 * then ask user to enter his/her spouse's first name 
	 *  then ask user to enter his/her adress
	 *  then print them all on the console 
	 */
	
	public static void main(String[]args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Please, enter your full name");
		
		String fullName= scan.nextLine();
		
		System.out.println("Please, enter your spouse's first name ");
		String spouseFirstName= scan.next();
		//After using nextLine()
		
		scan.nextLine();
		
		System.out.println("Please, enter address ");
		String address= scan.nextLine();
		
		System.out.println("User name: "+ fullName);
		System.out.println("your spouse's first name "+ spouseFirstName);
		System.out.println("address: "+ address);
		
		scan.close();

}
}
