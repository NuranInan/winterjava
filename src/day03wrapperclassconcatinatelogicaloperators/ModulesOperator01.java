package day03wrapperclassconcatinatelogicaloperators;

import java.util.Scanner;

public class ModulesOperator01 {
	
	/*
	 * Ask user to enter 3 digit integer
	 * type a program to find the sum of the digits
	 * for example; 438==> 4+3+8 =15
	 */
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please, enter a 3 digit number");
		int a = scan.nextInt();
		
		int last1=a%10;
		a=a/10;
		int last2=a%10;
		a=a/10;
		int last3=a%10;
		
		System.out.println(last1+last2+last3);
		scan.close();
	}

}
