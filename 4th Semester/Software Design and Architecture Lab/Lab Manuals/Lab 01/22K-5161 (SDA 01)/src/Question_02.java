import java.util.Scanner;

//Hafsa Salman
//22K-5161
//Question no. 02

public class Question_02 
{
	public static void main(String[] args) 
	{
		System.out.println("Name: Hafsa Salman");
		System.out.println("Roll no. 22K-5161");
		System.out.println("Question no. 02");
		System.out.println();
		
		Scanner s = new Scanner(System.in);
		
		SavingAccount B = new SavingAccount("ABC123", 52000);
		
		int choice;
		
		System.out.println("Enter choice:");
		System.out.println("1. Show balance.");
		System.out.println("2. Deposit");
		System.out.println("3. Withdraw");
		System.out.print("Enter choice: ");
		choice = s.nextInt();
		
		System.out.println();
		
		switch (choice)
		{
			case 1:
			{
				B.getBalance();
			}
			
			break;
			
			case 2:
			{
				B.deposit();
			}
			
			break;
			
			case 3:
			{
				B.withdraw();
			}
			
			break;
			
			default:
			{
				System.out.println("Invalid input!");
			}
			
			break;
		}
		
		s.close();
	}
}

abstract class BankAccount
{
	abstract public void deposit();
	abstract public void withdraw();
}

class SavingAccount extends BankAccount
{
	String acc;
	double balance;
	
	public SavingAccount(String acc, double balance)
	{
		this.acc = acc;
		this.balance = balance;
	}
	
	public void getBalance()
	{
		System.out.println("Account Number: " + acc);
		System.out.println("Balance: " + balance);
	}

	@Override
	public void deposit() 
	{
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter amount to deposit: ");
		double amount = s.nextDouble();
		
		if (amount > 0)
		{
			balance += amount;
			System.out.println("Amount depositted in account: " + amount);
		}
		
		else
		{
			System.out.println("Deposit should be more than 0.");
		}
	}

	@Override
	public void withdraw() 
	{
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter amount to withdraw: ");
		double amount = s.nextDouble();
		
		if (balance < 100)
		{
			System.out.println("Balance should be more than 100.");
		}
		
		else if (balance >= amount)
		{
			balance -= amount;
			System.out.println("Withdrawn amount: " + amount);
		}
		
		else
		{
			System.out.println("Insufficient balance!");
		}
	}	
}