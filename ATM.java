import java.util.Scanner;
public class ATM {

	public static void main(String[] args) {
		int balance = 100000;
		int withdraw;
		int deposit;
		boolean flag = true;
		Scanner s = new Scanner(System.in);  
		System.out.println("This is an ATM machine.");
		while(flag) {
			System.out.println("Please choose one of the following options:");
			System.out.println("Choose 1 for Withdraw");
			System.out.println("Choose 2 for Deposit");  
			System.out.println("Choose 3 for Check Balance");  
			System.out.println("Choose 4 for EXIT");

			int choice = s.nextInt();
			while(choice < 1 || choice > 4) {
				System.out.println("Invalid number." + "\n" + "please try again:");
				choice = s.nextInt();
			}
			
			//costumer wants to withdraw
			if(choice == 1) {
				System.out.println("Enter money to withdraw");
				withdraw = s.nextInt();
				if(balance >= withdraw) {
					balance = balance - withdraw;
					System.out.println("Please collect your money");
					System.out.println("");
				}
				else {
					System.out.println("Action not possible due to insufficient balance");
					 System.out.println("");
				}
				
			}
			//costumer wants to deposit
			else if(choice == 2) {
				System.out.println("Enter money to deposit");
				deposit = s.nextInt();
				balance = balance + deposit;
				 System.out.println("Your Money has been successfully depsited");  
			     System.out.println("");  
			}
			//costumer wants to check balance
			else if(choice == 3) {
				System.out.println("Your current balance is: " + balance);
				System.out.println("");
			}
			else {
				flag = false;
				System.out.println("Goodbye!");
				 System.out.println("");
			}
				
				
				
		}

	}

}
