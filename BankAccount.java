import java.util.Date;
import java.util.Random;
// Name: David Lentz (Hamlton)
// Assignment:  PA12 BankAccount 
// Description: This class is used to create BankAccount objects 
// Time spent:  

public class BankAccount {
	protected String name;
	protected double balance;
	protected int acctNum;
	protected Date date;
	protected static int accountsCreated;

	public BankAccount(String name) {
		this.name = name;
		this.balance = 0;
		this.acctNum = generateAcctNum();
		this.date = new Date();
		accountsCreated++;
	}

	public double getBalance() {
		return balance;
	}

	public boolean deposit(double amt) {
		if (amt >= 0) {
			balance += amt;
			return true;
		}
		return false;
	}

	public boolean withdraw(double amt) {
		if (amt >= 0 && amt <= balance) {
			balance -= amt;
			return true;
		}
		return false;
	}

	public boolean transfer(BankAccount a, double amt) {
		if (amt >= 0 && amt <= this.balance) {
			this.balance -= amt;
			a.balance += amt;
			return true;
		}
		return false;
	}

	public int getAccountNumber() {
		return acctNum;
	}
	
	public String toString() {
		return name + " [" + acctNum + "]\n" + date.toString() + "\n" + "$" + String.format("%,.2f", balance);
	}

	public boolean equals(BankAccount that) {
		if (this.acctNum == that.acctNum)
			return true;
		else
			return false;
	}

	protected int generateAcctNum() {
		Random r = new Random();
		String s = r.nextInt(9) + 1 + "";
		for (int i = 1; i <= 8; i++)
			s += r.nextInt(10);
		return Integer.parseInt(s);
	}

	public static int getAccountsCreated() {
		return accountsCreated;
	}
}
