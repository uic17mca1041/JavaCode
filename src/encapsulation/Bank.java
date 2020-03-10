package encapsulation;

public class Bank {
	
	public int bankAccount = 12345678;
	private int pin = 1234;
	

	private int accountBalance = 10000000;
	
	public int getAccountBalance() {
		return accountBalance;
	}

	public void withdrawl(int accNo, int pinNo, int amount) {
		
		if(bankAccount==accNo && pin == pinNo) {
			
			if(amount<=accountBalance) {
				System.out.println("Amount successfully withdrawl :"+amount);
			}else {
				System.out.println("Insufficient Balance");
			}
			
		}else {
			System.out.println("Enter correct Credentials");
		}
		
	}
	
	public void setPin(int bankAcc, int oldPin, int newPin) {
		
		if(bankAcc==bankAccount && oldPin==pin) {
			pin=newPin;
		}else {
			System.out.println("Invalid credentials");
		}
	}

}
