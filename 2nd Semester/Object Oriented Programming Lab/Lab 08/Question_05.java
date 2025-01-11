//Hafsa Salman
//22K-5161
//Question no. 05

import java.util.Scanner;

public class Question_05
{
    public static void main(String[] args)
    {
        System.out.println("Hafsa Salman");
        System.out.println("22K-5161");
        System.out.println("Question no. 05");
        System.out.println();

        System.out.println("Initial Balance: 0");
        System.out.println();

        Scanner s = new Scanner(System.in);

        SavingsAccount s1 = new SavingsAccount();

        System.out.println("Menu: ");
        System.out.println("Press 1 to DEPOSIT");
        System.out.println("Press 2 to WITHDRAW");
        System.out.println("Press 3 to GET BALANCE");
        System.out.println("Press 4 to EXIT");

        int choice;
        double a;

        do
        {
            System.out.println();
            System.out.print("Enter choice: ");
            choice = s.nextInt();

            switch (choice)
            {
                case 1:
                {
                    System.out.println();
                    System.out.print("Enter amount: ");
                    a = s.nextDouble();
                    s1.deposit(a);
                }

                break;

                case 2:
                {
                    System.out.println();
                    System.out.print("Enter amount: ");
                    a = s.nextDouble();
                    s1.withdraw(a);
                }

                break;

                case 3:
                {
                    System.out.println(s1.getBalance());
                }

                break;
            }
        }
        while (choice!=4);

        System.out.println("EXIT!");

    }
}

interface BankAccount
{
    abstract public void deposit(double amount);
    abstract public void withdraw(double amount);
    abstract public double getBalance();
}

class SavingsAccount implements BankAccount
{
    private double balance;

    public void setBalance(double balance)
    {
        this.balance = 0;
    }

    @Override
    public void deposit(double amount)
    {
        balance = balance + amount;

        System.out.println("Balance after depositing: " + balance);
    }

    @Override
    public void withdraw(double amount)
    {
        balance = balance - amount;

        System.out.println("Balance after withdrawing: " + balance);
    }

    @Override
    public double getBalance()
    {
        System.out.println("Balance: ");
        return balance;
    }
}