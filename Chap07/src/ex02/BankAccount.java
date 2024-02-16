package ex02;
/* 문제 : 은행 계좌 클래스 만들기
 * 클래스 이름 : BankAccount
 * 속성 : accountNumber(계좌번호), accountHolder(계좌 소유자),
 * balance(잔액)
 * 기능 : 
 * deposit(amount): 입금 메소드
 * withdraw(amount): 출금 메소드
 * displayBalance(): 잔액을 출력하는 메소드
 * 초기화 : 생성자 이름*/
public class BankAccount {
	private String accountNumber;
	private String accountHolder;
	private int balance = 0;
	
	BankAccount(){}
	BankAccount(String n, String h, int b){
		accountNumber = n;
		accountHolder = h;
		balance = b;
	}
	
	void deposit(int amount) {
		balance += amount;
	}
	void withdraw(int amount) {
		balance -= amount;
	}
	void displayBalance() {
		System.out.println("계좌번호 : " + accountNumber);
		System.out.println("계좌 소유자 : " + accountHolder);
		System.out.println("잔액 : " + balance);
	}
}
