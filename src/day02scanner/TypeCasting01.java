package day02scanner;

public class TypeCasting01 {
	
	/*----->easy (small box to bigger box) can be done by java
	 * byte < short < int < long < float < double
	 *    (big box to smaller one hard one    <-------
	 */                               
	
	public static void main(String[] args) {
		
		//Auto widening: If you assign small data type to a large data type, type casting
		// is done automatically by java 
		//this is called "auto widening"
		
		byte b1 =112;
		int i1 = b1;
		System.out.println(b1);
		System.out.println(i1);
		
		//Explicit Narrowing;If you assign a large data type to small data type 
		//type casting cannot be done by java automatically
		//you should take the responsibility and type the casting explicitly 
		//this process is called "Explicit Narrowing"
		
		int i2 = 120;
		short s1=(short)i2;
		System.out.println(s1);
		System.out.println(i2);
		
		//when you type "float f1 = 2.3;", it will complain
		//to fix that issue
		//1. way
		//float f1 = 2.3f;
		//2. way
		//float f2 = 2.3F;
		//3. way
		//float f3 = (float)2.3;
		//4. way
		//double f4= 2.3;
		
		//If you use explicit narrowing with the numbers which are not in the interval
		//then you will get different results. The result will be calculated acording to 
		//modules operation
		short s2= 255;
		byte b4 = (byte)s2;
		System.out.println(s2);//255
		System.out.println(b4);//-1
		
		int i3 = 5;
		int i4 = 2;
		//java does not do rounding operation
		System.out.println(i3/i4);//result will be 2 because int/int=int

		//if you use differant data type in mathmatical operation result will be largest data type
		int i5 = 5;
		double d1 = 2;
		
		System.out.println(i5/d1);//2.5 ==>double
		
	
		
		
		
		
	}

}
