package constructor2;

public class BullDog extends Dog{
	
	public BullDog() {
		super(10);
		System.out.println("BullDog");
	}
	
	public static void main(String[] args) {
		
		BullDog b = new BullDog();
		PrivateConstructor p = new PrivateConstructor();
		
	}

}
