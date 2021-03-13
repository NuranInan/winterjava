package day11whileloopdowhileloop;

import java.util.Scanner;

/*
 * Type java code by using while loop,
         Write a program that prompts the user to input an integer.
         It should then find sum of the digits of that number.
         	123 ==> 1+2+3 = 6
 */

public class WhileLoop01 {

	public static void main(String[] args) {
		
		sumOfDigits();	

	}
	
	
public static void sumOfDigits() {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter an integer to find the sum of digits");
	int num = scan.nextInt();
	
	int sum =0;
	
	if(num<0) {
		num=num*(-1);
	}
	
	while(num!=0) {
		
		sum=sum +num%10;
		num=num/10;
	}
	System.out.println(sum);
   scan.close();
	
}
}
 