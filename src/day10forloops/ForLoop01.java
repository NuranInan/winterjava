package day10forloops;

import java.util.Scanner;

public class ForLoop01 {

	public static void main(String[] args) {
		
		
		//printEvenInt1();
		
		printStringInRevOrder();
	}
	
	/*
	 * Print all integers from 100 to 23 on the console in the same line with a space among them
	 */

	public static void printEvenInt1() {
		
		//Even number'i iki ile cikarinca yine even olur
		
		for (int i = 100; i>22; i=i-2) {
			System.out.print(i+" ");
		}
	}
	public static void printEvenInt2() {
		
		for (int i = 100; i >22; i--) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
	}
	
	/*
	 * Print all integers which are divisible by 5 from 100 to 23 on the console in the same line with a space among them
	 */
	public static void printByFive() {
		for (int i = 100; i >22; i--) {
			if(i%5==0) {
				System.out.print(i+" ");
			}
		}
		
	}
	/*Interview Question
	 * 1)Ask user to enter a String
		 2)Print the String reverse
		 For example; Germany ===> ynamreG
	 */
	
	
	public static void printStringInRevOrder() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a String to see it in reverse order ");
		String str= scan.nextLine();
		
		for (int i = str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));//Do not put ln
			
			
		}
		scan.close();
	}
	
	
	
	
	
	
	
	
	
	
	
}
 