package constructors;

import accessspecifiers.Class1;

public class PersonClient extends Class1{

	public static void main(String[] args) {
	
		Person p1 = new Person("Twinkle",23);
		
		//p1.age= 23;  //p1.name=""sagfgsdb
		
		
		//How to access properties of an object
		System.out.println("Name is :"+p1.name+" and age is :"+p1.age);
		
		Person p2 = new Person("ABC",33);
		System.out.println("Name is :"+p2.name+" and age is :"+p2.age);
		
		Class1 c = new Class1();
		System.out.println(c.privateNumber);
		
		
		
		
		
	}
}
