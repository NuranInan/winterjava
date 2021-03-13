package day04ifelseifthenelse;

import java.util.Scanner;

/*
 * Get the name of the day from user
 * Type java code by using if statement. When you enter the name of the day of a week,
output will be “Weekday” or “Weekend day” according to the name of the day.
 */

public class IfStatement03 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter day name any name to check if it is week or weekend day");
	   String dayName= scan.next().toLowerCase(); 
	    
	    //Note: To compare String DO NOT USE "==". USE "equal()" method
	   //"==" checks values  and references. If both are same then Java tells the strings are same otherwise it tells the strings are defferent
	   //equals() checks just the values
	   //"Ali".equals("Veli");==>false
	   
	   if(dayName.equals("monday")||dayName.equals("tuesday")||dayName.equals("wednesday")||
			   dayName.equals("thursday")||dayName.equals("friday")) {
		       System.out.println("Week day");
	   }
	   
	   if(dayName.equals("saturday")||dayName.equals("sunday")) {
		   System.out.println("Weekend day");
	   }
       if(!dayName.equals("monday")&& !dayName.equals("tuesday")&& !dayName.equals("wednesday")&&
    		   !dayName.equals("thursday")&& !dayName.equals("friday")&&
    		   !dayName.equals("saturday")&& !dayName.equals("sunday")) {
    	        System.out.println("Enter a valid day name");
       }
       scan.close();
	   
	}

}
