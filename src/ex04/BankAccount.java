package ex04;

public class BankAccount {
	
	private int accountNumber;
	private String accountHolder;
	private int balance;
	
	public BankAccount() {
		
	}
	
	BankAccount(int an, String ah, int b){
		accountNumber = an;
		accountHolder = ah;
		balance = b;
		
	}
	
	void deposit(int amount) {
		balance += amount;
		System.out.println("입금액 : " + amount);
	}
	
	void withdraw(int amount) {
		if(amount > balance) {
			System.out.println("잔액이 부족합니다.");
		}else {
			balance -= amount;
			System.out.println("출금액 : " + amount);
		}
	}
	
	void displayBalance() {
		System.out.println("잔액 : " + balance);
	}

}
