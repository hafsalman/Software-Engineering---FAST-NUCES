 //Hafsa Salman
//22K-5161
//Task no. 05

import java.util.Scanner;

public class Task_05
{
    public static void main (String[] args)
    {
        System.out.println("Roll no. 22K-5161");
        System.out.println("Name: Hafsa Salman");
        System.out.println("Task no. 05");
        System.out.println("\n");

        BankAccount account = new BankAccount("22K-5161", "Hafsa Salman");

        Scanner s = new Scanner(System.in);

        double amount_d, amount_w;

        System.out.print("Enter the amount you want to deposit: ");
        amount_d = s.nextDouble();

        account.deposit(amount_d);

        System.out.println("\n");
        System.out.print("Enter the amount you want to withdraw: ");
        amount_w = s.nextDouble();

        account.withdraw(amount_w);

        System.out.println("\n");
        System.out.println("Printing Account Details: ");
        System.out.println("Account Number: " + account.getAccount_Number());
        System.out.println("Account Holder Name: " + account.getAccount_Holder_name());
        System.out.println("Balance: " + account.getBalance());
    }
}

class BankAccount
{
    private String Account_Number;
    private String Account_Holder_name;
    private double balance;

    public BankAccount (String Account_Number, String Account_Holder_name)
    {
        this.Account_Number = Account_Number;
        this.Account_Holder_name = Account_Holder_name;
        this.balance = 10000.00;
    }

    public String getAccount_Number()
    {
        return Account_Number;
    }

    public String getAccount_Holder_name()
    {
        return Account_Holder_name;
    }

    public double getBalance()
    {
        return balance;
    }

    public void deposit(double amount_d)
    {
        if (amount_d > 0)
        {
            balance = balance + amount_d;

            System.out.println("Deposited Money: " + amount_d);
        }

        else
        {
            System.out.println("Invalid amount!");
        }
    }

    public void withdraw (double amount_w)
    {
        if (amount_w > 0 && amount_w < balance)
        {
            balance = balance - amount_w;

            System.out.println("Withdrawn Money: " + amount_w);
        }

        else
        {
            System.out.println("Balance is insufficient!");
        }
    }
}