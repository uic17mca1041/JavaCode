package constructors;

public class Class1 {
	
	Class1(){
		this(10);
		System.out.println("this is non arg cons");
	}
	
	Class1(int a){
		System.out.println("this is parameterized constructor");
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("This is main method");
		Class1 c1 = new Class1();
		System.out.println("This is constructor class");
		Class1 c2 = new Class1(10);
		System.out.println("This is Java");
		
	}
	
	

}
