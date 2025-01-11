//Hafsa Salman
//22K-5161
//Task no. 01

import java.util.Scanner;

public class Task_01
{
    public static void Print (int n)
    {
        for (int i=(n-1); i>=0; i--)
        {
            System.out.print(Fibonacci(i) + "\t");
        }
    }

    public static int Fibonacci (int i)
    {
        if (i <= 1)
        {
            return i;
        }

        else
        {
            return (Fibonacci(i-1) + Fibonacci(i-2));
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("Roll no. 22K-5161");
        System.out.println("Task no. 01");
        System.out.println();

        Scanner s = new Scanner(System.in);

        int n;

        System.out.print("Enter number: ");
        n = s.nextInt();

        System.out.println("\nPrinting Fibonacci's series in reverse: ");
        Print(n);
    }
}