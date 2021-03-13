package day03wrapperclassconcatinatelogicaloperators;

/*
 * Operators in java
 * 1) = is assignment operator
 * puts the value from right and puts it into container
 * For example; int s =12;
 * 
 *              Note: Followings are "comparison operators"
 *              "comparison operators" returns boolean every time
 * 
 * 2) ==is equal sign in Java
 * 5=2+3 returns boolean
 * If left part equals to right part it returns "true", otherwise it returns false
 * 
 * 3) != means "not equal"
 *    != returns boolean
 *    If left part does not equal to right part it returns "true", otherwise it return false
 *    Note: ! ==> Not
 *    
 *  4) >means greater than
 *     >returns boolean
 *     
 *  5) < means less than 
 *     < returns boolean
 *     
 *  6) >= means greater than or equal
 *     >= returns boolean  
 *     
 *  7) <= means less than or equal to
 *     <= returns boolean 
 *     
 *     
 *     Note: Followings are "Logical Operators"
 *     returns boolean every time
 *     
 *     
 *     
 *  8) && And operators
 *     && returns true  if everything is true   
 *     
 *  9) || OR operator
 *     || returns false is everything is false// like polyanna :)          
 * 
 */

public class LogicalOperators01 {
	
	public static void main(String[] args) {
		
		//System.out.println(5==2+3);   //true
		
		System.out.println(5!=2+4);   //true
		
		System.out.println((5<7)&&(3>1)&& (4==5));// false//It is perfection should be everything true  
		
		System.out.println((15<7)||(3>10)|| (4==5)||(11<5));//false
		
		//What is the difference between && and &
		
		//System.out.println((5>7) & (3>1) & (4==4));//test all of them. want to check all condition every time option
		
		//System.out.println((5>7) && (3>1) && (4==4));//less test, find false not test others makes test faster
		
		
		
	 }
	}


