//Hafsa Salman
//22K-5161
//Task no. 04

public class Task_04
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("Roll no. 22K-5161");
        System.out.println("Task no. 04");
        System.out.println();

        SavingAccount S = new SavingAccount(2500.0, 5);

        System.out.println("Balance: " + S.getBalance());
        System.out.println("Time Span: " + S.timeSpan + " months");

        S.credit(5000);

        System.out.println("Balance after crediting: " + S.getBalance());

        S.debit(1500);

        System.out.println("Balance after withdrawal: " + S.getBalance());
    }
}

class Accounts
{
        double balance;

    public double getBalance()
    {
        return balance;
    }

    public Accounts(double balance)
    {
        this.balance = balance;
    }

    public void debit(double amount)
    {
        balance = balance - amount;
    }

    public void credit (double amount)
    {
        balance = balance + amount;
    }
}

class SavingAccount extends Accounts
{
    int timeSpan;

    public SavingAccount(double balance, int timeSpan)
    {
        super(balance);
        this.timeSpan = timeSpan;
    }

    public void CalculateInterest(double InterestRate)
    {
        double interest;

        interest = balance * InterestRate * timeSpan;
    }

    public void credit (double amount)
    {
        balance = balance + amount;
    }
}

class CheckingAmount extends Accounts
{
    public CheckingAmount(double balance)
    {
        super(balance);
    }
}