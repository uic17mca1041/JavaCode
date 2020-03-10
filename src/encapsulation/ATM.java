package encapsulation;

public class ATM {

	
	public static void main(String[] args) {
		
		Bank b = new Bank();
		
		b.setPin(12345678, 1234, 2222);
		b.withdrawl(12345678, 2222, 1000);
		
		
		
	}
}
