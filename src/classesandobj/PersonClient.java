package classesandobj;

import accessspecifiers.Class1;

public class PersonClient extends Class1{

	public static void main(String[] args) {
	
		Person p1 = new Person();
		p1.name="Twinkle";
		p1.age=23;
		//How to access properties of an object
		System.out.println("Name is :"+p1.name+" and age is :"+p1.age);
		
		Person p2 = new Person();
		
		Class1 c = new Class1();
		System.out.println(c.privateNumber);
		
		
		
		
		
	}
}
