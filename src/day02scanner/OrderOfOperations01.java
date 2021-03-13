package day02scanner;

public class OrderOfOperations01 {
	/*
	 * For mathametical operations we have some rules about order of operations
	 * 1)Do exponential operations 
	 * 2)do the operations inside the paranthesis
	 * 3)complete multiplication and division operations
	 * 4)complete addition and subtraction operations
	 * 
	 */
	
	public static void main(String[] args) {
		
	int result1 = 5+2*(16 - 2 * 5);
	System.out.println(result1);
	
	int a = 8 + 2 * (24/3 - 2*3) + 1;
	int b = 4 * 3 - 3 * (2 + 2*3);
	System.out.println(a + a * b);
	
	//what is the remainder when you divide 17 by 3 ?
	//modules operators (%) is used to find reminder
	
	System.out.println(17 % 3);//2
	
	//modules operator is used to find the digit of number
	
	int c =23456718;
	//what is the last digit of number c ?
	System.out.println(c%10);
		
	}

}
