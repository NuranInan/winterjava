package day13constructor;

public class Dog {
	
	public String name;
	public int weight;
	public int height;
	
	//I created a constructor below
	//The constructor has no any parameter
	//The constructor has nothing inside the body
	//That kind of constructor are same with the default constructor
	//Note:If you create a constructor Java deletes the "default one"
	
	public Dog() {
		
	}
	
    public Dog(String name) {
		this.name=name;
	}
    
    public Dog(int weight, int height) {
		
	}
    
    public Dog(String name,int weight, int height) {
    	this.name=name;
    	this.height=height;
    	this.weight=weight;
	}
    

	public static void main(String[] args) {
	
		Dog dog1 = new Dog("Joe");
		
         System.out.println(dog1.name);//Joe
         dog1.sound();
         
         System.out.println("============================");
         
         //Create a dog by using name, weight, and height
         
         Dog dog2 = new Dog("Alma", 10,50);
 		
         System.out.println(dog2.name);//Alma
         System.out.println(dog2.weight);//10
         System.out.println(dog2.height);//50
         dog2.sound();
         
         
    
         //If you want to access class members, you should create object from the class
         
	}
	
	public static void sound() {
		System.out.println("Dogs bark.....");
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
