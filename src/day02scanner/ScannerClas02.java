package day02scanner;

import java.util.Scanner;

public class ScannerClas02 {
	
	/*
	 * Type a program which calculates the area and the parameter of a square
     whose side length is entered by user.
     Hint 1: Area of a square is length x length
     Hint 2: Parameter of a square is 4x length
	 */
	
	
	public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
		
		System.out.println("Please, enter the length of side of square");
		double length= scan.nextDouble();
		
		System.out.println(length*length);
		
		System.out.println(4 * length);

		scan.close();
		
	}

}
