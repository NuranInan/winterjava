package day09methodoverloadingloops;



public class ForLoop01 {

	public static void main(String[] args) {
		/*
		 * Type code to print "Hello World!"10 times on the console
		 */
		
		
	for (int i = 0; i < 10; i++) {
		System.out.println("Hello World!");
	}
		
	/*
	 * Type code to print integers from 5 to 12 on the console
	 */
		
	for (int i = 5; i < 13; i++) {
		System.out.print(i+" ");
		System.out.println();
		
		/*
		 * Type code to print integers from 12 to 5 on the console
		 */
	
	}	
	for (int i = 12; i > 4; i--) {
		System.out.print(i+" ");
	}
		
	}

}
