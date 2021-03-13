package day06nestedifturnaryswitchstringmethods;

import java.util.Scanner;

/*
 * Ask user to enter an integer. If the number has 3 digits, output will be
“This number has 3 digits.” Otherwise, output will be “This number has no 3 digits.”
How can you decide the number of digits of an integer?
 */

/*
 * Ask user to enter a String. If the String has 2 characters, output will be
“It is valid for state abbreviations” Otherwise, output will be “It is not valid for state abbreviations”
 */

public class Ternary03 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = scan.nextInt();
		
		
		String result1 = (a>99 && a<1000)|| (a<-99 && a>-1000) ? "Number has 3 digits" : "Number has no 3 digits";
		
		System.out.println(result1);
		
		//Second question
		System.out.println("Enter the abreviation of a state.....");
		String abrv = scan.next();
		
		String result2= abrv.length()==2 ? "It is valid for state abbreviations" : "It is  not valid for state abbreviations" ;
			System.out.println(result2);
		
		scan.close();
		
		
		
		
}
	
	

}
