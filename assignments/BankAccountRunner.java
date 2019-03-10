import java.util.Scanner;

public class BankAccountRunner 
{
	public static void main(String[] args) 
	{
		int QUIT = 1;
		int ADD_MONEY = 2;
		int WITHDRAW_MONEY = 3;
		int CHECK_BALANCE = 4;
		
		//The next line only works after the BankAccount
		//class has been created.
		BankAccount savings = new BankAccount("Savings");
		Scanner scanner = new Scanner(System.in);
		
		int choice = 0;
		double amount;
		while(choice != QUIT)
		{
			displayOptions();
			choice = scanner.nextInt();
			
			if(choice == ADD_MONEY)
			{
				/*
				 * Your code here!
				 * Ask them to add the amount to add,
				 * Scan what they enter
				 * Add the amount to the savings account
				 * Tell them how much has been added
				 * to their account.
				 */
			}
			else if(choice == WITHDRAW_MONEY)
			{
				/*
				 * Your code here!
				 * Ask them to add the amount to withdraw,
				 * Scan what they enter
				 * Subtract the amount from the savings account
				 * Tell them how much has been removed
				 * to their account.
				 */
			}
			else if(choice == CHECK_BALANCE)
			{
				/*
				 * Your code here!  
				 * Just print a message about how much
				 * money is in their account, along with the 
				 * account name.
				 * Like this:
				 * 'Account: Savings has X dollars in it.'
				 */
			}
		}		
	}

	
	private static void displayOptions()
	{
		/* 
		 * Your code here!  
		 * All this method needs to do is display
		 * 'Please select an option'
		 * then display the 4 choices with their 
		 * corresponding numbers:
		 * 		1 == Quit
		 * 		2 == Add money
		 * 		3 == Withdraw money
		 * 		4 == Check balance
		 */
	}
}