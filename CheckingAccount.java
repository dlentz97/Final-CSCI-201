
public class CheckingAccount extends BankAccount {

	private int checkNumber;

	public CheckingAccount(String name, int check) {
		super(name);
		if (check > 0)
			checkNumber = check;
		else
			checkNumber = 1000;

	}

	public int getCheckNumber() {
		return checkNumber;
	}

	public String toString() {
		return ("Check number/n" + super.toString() + "/n");
	}

	public void writeCheck() {
		checkNumber++;

	}
}
