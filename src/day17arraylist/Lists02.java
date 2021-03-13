package day17arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lists02 {

	public static void main(String[] args) {
		List <String> lists1 = new ArrayList<>();
		lists1.add("A");
		lists1.add("C");
		lists1.add("F");
		lists1.add("B");
		lists1.add("D");
		
		List <String> lists2 = new ArrayList<>();
		lists1.add("A");
		lists1.add("C");
		lists1.add("F");
		lists1.add("B");
		lists1.add("D");

		//How to check a list has a specific element
		System.out.println(lists1.contains("B"));//true
		System.out.println(lists1.contains("X"));//false
		
		//How to check if two lists are equal or not
		System.out.println(lists1.equals(lists2));//true
		
		/*INTERVIEW QUESTION
		 * Ask user to enter a letter 
		 * If the letter exists in list1 convert it to "Got it"
		 * otherwise add the element which user entered into the list
		 */
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Please unter a letter");
		String letter= scan.next().toUpperCase().substring(0,1);
		if(lists1.contains(letter)) {
			lists1.set(lists1.indexOf(letter), "Got it");
			System.out.println(lists1);
		}else {
			lists1.add(letter);
			System.out.println(lists1);
		}
		scan.close();
		
	}
	
	

}
