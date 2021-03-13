package day10forloops;

public class WhileLoop01 {

	public static void main(String[] args) {
		
		printOdd1();
		System.out.println();
		printOdd2();
	}
	
	/*
	 * Type a program to print odd integers from 4 to 25 in the same line with a space on the console
	 * 1)Use for-loop
	 * 2)Use while-loop
	 */
	public static void printOdd1() {
		
		for (int i = 4; i <26; i++) {
			if(i%2!=0){
				System.out.print(i+" ");
			}
		}
	}
//while loop
	
	public static void printOdd2() {
		int i=4;
		while(i<26) {
			if(i%2!=0){
				System.out.print(i+" ");
		}
			i++;
	}
	
	

	/*
	 * Create method to print integers which are divisible by 6 and 8 from 500 to 25 on the console
	 */
		
		int k =500;
	
	while(k >24) {
		
		if(i%6==0 && i%8==0) {
			
		}
		k++;
	}
}
}
	
	
	
	
	


