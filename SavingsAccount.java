import java.util.Scanner;

public class SavingsAccount extends BankAccount {

	private static final int rate = 0;

	private double intrestRate;

	Scanner scan = new Scanner(System.in);

	public SavingsAccount(String name, double rate) {
		super(name);
		if (rate > 0 && rate < 10)
			this.intrestRate = rate;
		else
			this.intrestRate = 1;

	}

	public double getRate() {
		this.intrestRate = SavingsAccount.rate / 100;
		return intrestRate;
	}

	public String toString() {
		addIntrest();
		return ("Savings Account\n" + super.toString() + "\n" + String.format(intrestRate));
	}

	public void addIntrest() {
		balance = balance + (getRate() + 1);

	}

}