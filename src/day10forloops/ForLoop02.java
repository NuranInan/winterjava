package day10forloops;

import java.util.Scanner;

public class ForLoop02 {

	public static void main(String[] args) {
		
		checkPalindrome();
		

	}
	
	/*
	 * 1)Ask user to enter a String
	 2)Check the String if it is “Palindrome” or not
	 */
	
	public static void checkPalindrome() {
        Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a String to see it is palindrome or not ");
		String str= scan.nextLine();
		
		//1)Reverse the string
		//2)Put the reverse string into a container
		//3)Compare the string the reversed String
		
		
		String revStr="";
		for (int i = str.length()-1; i>=0; i--) {
		
			revStr=revStr+str.substring(i,i+1);
		}
		scan.close();
			
			if(str.equalsIgnoreCase(revStr)) {
				System.out.print(str+" is palindrome" );
			}else {
				System.out.print(str+" is not palindrome" );
			}
			
		}
	
			
		}
		
	


