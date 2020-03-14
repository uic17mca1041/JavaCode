package exceptionHandling;

public class Class1 {

	public static void main(String[] args) {

		
		int x = 10;
		int y = 0;
		
		try {
		int z = x/y;
		System.out.println(z);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
