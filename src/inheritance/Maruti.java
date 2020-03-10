package inheritance;

public class Maruti extends Car{
	
	int d = 20;
	int d2 = 200;
	
	static int engines = 2;
	
	void speed() {
		System.out.println("maruti has a speed of 100kmph");
	}
	
	void marutiMethod() {
		System.out.println(super.engines);
		System.out.println("This is a maruti method");
	}


	public static void main(String[] args) {
	
		Maruti z = new Maruti();
		z.marutiMethod();
		
	/*	Car c = new Car();
		System.out.println(c.d);
		System.out.println(c.d1);
		c.speed();
		c.move();*/
		
		
		
		Car obj = new Maruti();
		
		
		
		
		
		
//		Maruti m = new Car();
		
		
		Maruti m = new Maruti();
		
		System.out.println();
	
		m.move();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
