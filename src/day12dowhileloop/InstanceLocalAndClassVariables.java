package day12dowhileloop;

public class InstanceLocalAndClassVariables {
	
	/*
	 * 1)If a variable created 
	 *    a)inside the class but outside the main method  and
	 *    b)it is not "static"
	 *    then it is called "Instance (Object) Variable"
	 *    Note: If you do not assign any value for an instance variable, Java assigns "0" for it, if the variable is a number
	 *    The values which Java assigns are called "default value"
	 *    
	 *    2) If a variable is cerated
	 *     a)inside the class but outside the main method  and
	 *     b)it is  "static"
	 *     then it is called "Class Variable"
	 *      Note:The main difference between "static (class)" and " instance(class)" variable is that
	 *      a)All updates on a static variable is visible just by all objects which are created from the class but
	 *      all updates on an "instance variable" is visible just by the object
	 *      b)"static variables" are common for all objects, but instance variable are specified for an object
	 *      
	 *      3)If a variable created inside a method , it is called "local variable"
	 *      Note: For "Local variables", there is no default value.
	 *      you have to assign value, when you create a local variable. Java does not assign default value
	 *      Note: "Local variables" which are created in a "static method" are "static" automatically
	 */
	
	//Allah her insani yaratirken basini da ayri ayri yaratiyor bu instance variable fakat ayi herkes icin ayri yaratmiyor bu class variable
	//static variable common for every object
	//If you do not make something static when you update you need to update for each
	//If you do static all related ones will see updated one

	int i=12;//This is instance variable
	int k;//This is instance variable
	String str;//This is instance variable, default value for string is null
	boolean b1;//This is instance variable, default value for b1 is false
	char ch; //This is instance variable, default value for ch is ''
	
	static byte by;  //class variable
	
	public static void main(String[] args) {
		short sh= 11;//This is "Local variable"
		sh++;
		//int bl; this is comleining bc I did not assign value and java does not give default value
		//bl++

	}

}



