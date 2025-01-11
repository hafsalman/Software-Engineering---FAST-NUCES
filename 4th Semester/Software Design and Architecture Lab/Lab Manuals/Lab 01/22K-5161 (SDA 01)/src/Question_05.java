import java.util.Scanner;

//Hafsa Salman
//22K-5161
//Question no. 05

public class Question_05 
{
	public static void main(String[] args)
	{
		System.out.println("Name: Hafsa Salman");
		System.out.println("Roll no. 22K-5161");
		System.out.println("Question no. 05");
		System.out.println();
		
		Scanner s = new Scanner(System.in);
		
		int choice;
		
		System.out.println("Enter \n1. if you are a full time game tester \n2. if you are a part time game tester");
		System.out.print("Enter choice: ");
		choice = s.nextInt();
		
		System.out.println();
		
		switch (choice)
		{
			case 1:
			{
				FullTimeGameTester F = new FullTimeGameTester();
				F.calculateSalary();
			}
			
			break;
			
			case 2:
			{
				PartTimeGameTester P = new PartTimeGameTester();
				P.calculateSalary();
			}
			
			break;
			
			default:
			{
				System.out.println("Invalid Input!");
			}
			
			break;
		}
		
		s.close();
	}
}

abstract class GameTester
{
	abstract public void calculateSalary();
}

class FullTimeGameTester extends GameTester
{
	public FullTimeGameTester()
	{
		
	}
	
	@Override
	public void calculateSalary() 
	{
		System.out.println("Salary for being Full Time Game Tester is $3000.");
	}
}

class PartTimeGameTester extends GameTester
{
	public PartTimeGameTester()
	{
		
	}
	
	int hours;

	@Override
	public void calculateSalary() 
	{
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter hours: ");
		hours = s.nextInt();
		
		System.out.println("Salary for 1 hour: $20");		
		System.out.println("Salary for being Part Time Game Tester is $" + (20*hours) + ".");
		
		s.close();
	}
	
}