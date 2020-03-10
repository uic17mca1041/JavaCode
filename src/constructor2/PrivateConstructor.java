package constructor2;

public class PrivateConstructor {

	private PrivateConstructor() {
		System.out.println("private constructor");
	}
	
	public static void main(String[] args) {
		
		PrivateConstructor p = new PrivateConstructor();
		
	}
}
