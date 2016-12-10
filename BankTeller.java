import java.util.Scanner;

public class BankTeller {

	private static Bank USAA = new Bank(2);

	public static void main(String[] args) {
			    char command;
			    Scanner input = new Scanner(System.in);
			    printMenu();
			    do {
			
			      System.out.println("\nPlease enter a command or type ?");
			      command = input.nextLine().toLowerCase().charAt(0);
			 
	        		char a;
					int entry;
					if (command == a)
	        			entry = 1;
	        		else if (command == b)
	        			 entry = 2;
	        		else if (command == c)
	        			 entry = 3;
	        		else if (command == d)
	        			 entry = 4;
	        		else if (command == e)
	        			 entry = 5;
	        		else if (command == f)
	        			entry = 6;
	        		else if (command == ?)
	        			entry = 7;
	        		else if (command == q)
	        			entry = 8;
					
					
	        		switch (entry) {
	        			case 1:  
	        			while (savingsOrcredit == 1 || savingsOrcredit == 2) {
		                    System.out.print("\nEnter 1 for Savings Account or 2 for Checking Account: ");
		                    savingsOrcredit = Integer.parseInt(input.nextLine());
		                  }
	        			Account j;
	        			if (savingsOrcredit = 1){
		                  System.out.print("Enter account hold name:  ");
		                  String make = input.nextLine();
		                  System.out.print("Enter intrest rate: ");
		                  String model = input.nextLine();
		                  System.out.print("Bank Account successfully added.");}
	        			else {
	        				System.out.print("Enter account hold name:  ");
	        				String make = input.nextLine();
	        				System.out.print("Enter starting check number: ");
	        				String model = input.nextLine();
	        				System.out.print("Bank Account seccessfully added.");
	        			}
		                  break;
	        			case 2: USAA.remove(a);
	        			  break;
	        			case 3: USAA.display(a); 
	        			  break;
	        			case 4: System.out.println("There are " + USAA.getCount);
	        			  break;
	        			case 5: Bank(sort());
	        			  break;
	        			case 6: System.out.println("Enter 1 for deposit or 2 for widthdraw: "); 
	        				depositOrwithdraw = Integer(input.nextLine());
	        				if(depositOrwithdraw = 1){
	        					System.out.println("Enter amount: ");
	        					amount = input.nextDouble();
	        					super(balance = balance + amount); 
	        					System.out.println("Transaction successful");
	        				}
	        				else{System.out.println("Enter amount: ");
	        				amount = input.nextDouble();
	        				super(balance = balance - amount);
	        				System.out.println("Transaction successful");
	        				}
	        			  break;
	        			case 7: return printMenu();
	        			  break;
	        			case 8:	System.out.println("GOODBYE!!");
	        			  break;
	        			default: return printMenu();
			               }

	private static void printMenu() {
		System.out.println("Bank Teller Options");
		System.out.println("-----------------------------------");
		System.out.println("a: add an account to the bank");
		System.out.println("b: remove an account from the bank");
		System.out.println("c: display the accounts in the bank");
		System.out.println("d: count the accounts in the bank");
		System.out.println("e: sort the accounts in the bank");
		System.out.println("f: update an account in the bank");
		System.out.println("?: display the menu again");
		System.out.println("q: quit this program");
		System.out.println("");
		System.out.println("");
		System.out.println("Please enter command or enter ?");

	}
}}
