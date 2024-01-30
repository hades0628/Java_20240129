package ex04;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("계좌번호: ");
		int accountNumber = s.nextInt();
		s.nextLine();
		
		System.out.print("계좌소유자: ");
		String accountHolder = s.nextLine();
		
		System.out.print("초기 잔액: ");
		int balance = s.nextInt();
		
		
		BankAccount bank1 = new BankAccount(accountNumber, accountHolder, balance);
		
		System.out.print("입금할 금액: ");
		int depositAmount = s.nextInt();
		bank1.deposit(depositAmount);
		bank1.displayBalance();
		
		System.out.print("출금할 금액: ");
		int withdrawAmout = s.nextInt();
		bank1.withdraw(withdrawAmout);
		bank1.displayBalance();
		
		bank1.displayBalance();

	}

}
