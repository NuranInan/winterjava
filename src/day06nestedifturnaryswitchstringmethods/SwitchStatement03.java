package day06nestedifturnaryswitchstringmethods;

import java.util.Scanner;

public class SwitchStatement03 {
	
	/*
	 * Ask user enter one of the 'U', 'S', 'A'.
	 * Then type a program by using "switch statement " to print
	 * "United" for 'U', "States" for 'S', and "America" for 'A'
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		 System.out.println("Enter the number of a day");
		 char ch = scan.next().charAt(0);
		 
		 switch(ch) {
		 
		 case 'U':
		 case 'u':
			 System.out.println("United");
			 break;
			 
		 case 'S':
		 case 's':
			 System.out.println("States");
			 break;
			 
		 case 'A':
			 System.out.println("America");
			 break;
		default:
			 System.out.println("Enter a valid character");
		 
		 
		 
		 }
		 
		 scan.close();
		
	}

}
