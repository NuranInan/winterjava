package day06nestedifturnaryswitchstringmethods;

import java.util.Scanner;

public class Ternary01 {
	
	/*
	 * Type java code by using ternary and if-else, ask user to enter an integer, if the integer is even,
the output will be “The integer is even”. If the integer is odd, the output will be “The integer is odd”.
	 */
	
	/*
	 * Type java code by using ternary .
	 * Ask user to enter two integers
       Write a program to print the minimum one on the console.
	 */
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer");
		int a = scan.nextInt();
		
		//First question
		
		//Ternary flow
		
		//Condition   Question mark      code will be executed if the condition is true          Colon     Code will be executed if the condition false
		
		//a%2==0           ?                     "The integer is even"                              :             "The integer is odd"  
		
		
		
		String result= a%2==0 ?  "The integer is even" : "The integer is odd" ; 
		System.out.println(result);
		
		//Second question
		System.out.println("Enter 2 integer");
		
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int result1 = b>c ? c : b;
		System.out.println(result1);
		
		scan.close();
		
	}
	

}
