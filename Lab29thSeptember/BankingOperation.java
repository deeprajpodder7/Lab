package Lab29thSeptember;

import java.util.*;

class BankDetails {
	private long accountNumber;
	private String accountName;
	private double accountBalance;
	Scanner sc = new Scanner(System.in);

	public void createAccount() {
		System.out.print("Enter Account No: ");
		accountNumber = sc.nextLong();
		System.out.print("Enter Name: ");
		accountName = sc.next();
	}

	public void setAmount(double accBal) {
		this.accountBalance = accBal;
	}

	public double getAmount() {
		return accountBalance;
	}

	public void withdrawAmount(double withdraw) {
		if (accountBalance >= withdraw) {
			accountBalance = accountBalance - withdraw;
			System.out.println("Cuurent Balance: " + accountBalance);
		} else {
			System.out.println("Your balance is less than " + withdraw + "\tTransaction failed...!!");
		}
	}
}

public class BankingOperation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many number of customers do you want to input? ");
		int n = sc.nextInt();
		BankDetails arr[] = new BankDetails[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new BankDetails();
			arr[i].createAccount();
			System.out.println("Enter the balance: ");
			double balance = sc.nextDouble();
			arr[i].setAmount(balance);
			System.out.println("Enter amount to withdraw: ");
			double withdraw = sc.nextDouble();
			arr[i].withdrawAmount(withdraw);
		}

	}

}
