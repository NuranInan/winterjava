package day02scanner;

public class IncrementDecrement01 {
	//Increment: if you increase the value of a variable then this process is called
	
	public static void main(String[] args) {
		
		int num1 = 5;
		System.out.println("Before increment"+num1);
		
		//increase the value of num1 by 3
		//1. way
		
		num1 = num1 + 3;//java works like Arabic reads the last to the first
		System.out.println("After increment "+ num1);
		
		//2. way 
		num1 += 3;
		
		//3. way
		num1++;
		
		//Note: increment can be done by multiplication as well
		num1 = num1 * 2;
		num1*=2;
		
		//Decrease the num1 by 2 
		//1. way
		
		num1 = num1 - 2;
		//2. way 
		num1-=2;
		//3. way
		num1--;
		System.out.println("After decrement"+ num1);
		
		//Note: decrement can be done by division as well
		num1 = num1 /2 ;
		
		System.out.println("after division decrement"+ num1);
		
		num1 /= 3;
		
		System.out.println("after division decrement"+ num1);
		
		
		
	}

}
