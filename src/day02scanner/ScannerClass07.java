package day02scanner;

import java.util.Scanner;

public class ScannerClass07 {
	
	/*
	 * User will enter his/her first name you will print the first character on the console 
	 * User will enter his/her last name you will print the first character on the console 
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your first name");
		
		char firstNameInitial = scan.next().charAt(0);
		System.out.println(firstNameInitial);
		
		//if you use mathemetical operations for chars , java uses the ASCII values of chars
		//if you want not ASCII values just use string together
		//or use System.out.print()
		
		/*
		 * 1.way
		 * System.out.println(""+ firstNameInitial+ lastNameInitial);
		 * 
		 * 2.way
		 * System.out.print(firstNameInitial);
		 */
		
    scan.close();
	}

}
