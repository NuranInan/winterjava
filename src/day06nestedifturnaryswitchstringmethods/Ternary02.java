package day06nestedifturnaryswitchstringmethods;

import java.util.Scanner;

public class Ternary02 {
	
	/*
	 * Type java code by using ternary.
Write a program to print absolute value of an integer entered by user.
-5 ==> 5 and 5 ==> 5 and 0 ==> 0
	 */
	
	/*
	 * Type java code by using using ternary.
Take values of length and width of a rectangle from user and check if it is square or not.
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer");
		int a = scan.nextInt();
		
		int result2= a<a ? -1*a :a;
		System.out.println(result2);
		
		//Second Question
		System.out.println("Enter the length and width of the rectangle");
		double length = scan.nextDouble();
		double width = scan.nextDouble();
		
		String result3 = length==width ? "Square" : "Rectangle";
		System.out.println(result3);	
	
		scan.close();

	}

}
