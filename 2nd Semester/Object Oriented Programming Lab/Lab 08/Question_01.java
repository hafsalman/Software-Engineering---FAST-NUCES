//Hafsa Salman
//22K-5161
//Question no. 01

public class Question_01
{
    public static void main(String[] args)
    {
        System.out.println("Hafsa Salman");
        System.out.println("22K-5161");
        System.out.println("Question no. 01");
        System.out.println();

        A a = new A();

        System.out.println("Balance in A: " + a.getBalance());

        B b = new B();

        System.out.println("Balance in B: " + b.getBalance());

        C c = new C();

        System.out.println("Balance in C: " + c.getBalance());
    }
}

abstract class Bank
{
    abstract double getBalance();
}

class A extends Bank
{
    @Override
    double getBalance()
    {
        return 1000;
    }
}

class B extends Bank
{
    @Override
    double getBalance()
    {
        return 1505;
    }
}

class C extends Bank
{
    @Override
    double getBalance()
    {
        return 2500;
    }
}