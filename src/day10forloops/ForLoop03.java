package day10forloops;

public class ForLoop03 {

	public static void main(String[] args) {
		
		sumOfAllInt() ;
		

	}
	
	/*
	 * Find the sum of all integers from 10 to 200
	 */
	
	public static void sumOfAllInt() {
		
		int sum= 0;
		
		for (int i = 10; i <=200; i++) {
			
			sum+= i;
			
		}
		//If you type sout after the for loop it will display the final value of sum
		//If you put inside of the loop you will see all result one by one 
		
		
		System.out.println(sum);
		
	}
	

}
