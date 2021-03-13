package day11whileloopdowhileloop;

import java.util.Scanner;

public class WhileLoop02 {
	
	/*Type java code by using while loop,
    Write a program to count the factors of an integer which is entered by user.
    Factors of 12 = 1, 2, 3, 4, 6, 12
    */
	

	public static void main(String[] args) {
	

	}
	
	public static void findFactors() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer to find the factors");
		int number = scan.nextInt();
		
		int i = 1;
		
		if(number<0) {
			number= -number;
		}
		
		while(i<=number) {
			if(number%i==0) {
				System.out.println(i+" ");
			}
			i++;
		}
		scan.close();
	}

}
