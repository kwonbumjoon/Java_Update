package ex02;

public class problem02 {
	public static void main(String[] args) {
		BankAccount bank = new BankAccount("001122", "권범준", 10000);
		
		
		bank.deposit(300000);
		bank.withdraw(20000);
		bank.displayBalance();
	}
}
