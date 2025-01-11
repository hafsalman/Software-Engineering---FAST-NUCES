//Hafsa Salman
//22K-5161
//Task no. 02

import java.util.Scanner;

public class Task_02
{
    public static int Add (int sum, int n)
    {
        int temp;

        temp = n % 10;
        n = n/10;

        sum = sum + temp;

        if (n <= 9 && n >= 0)
        {
            sum = sum + n;
            return sum;
        }

        else
        {
            return Add(sum, n);
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("Roll no. 22K-5161");
        System.out.println("Task no. 02");
        System.out.println();

        Scanner s = new Scanner(System.in);

        int n;

        System.out.print("Enter number: ");
        n = s.nextInt();

        int sum = 0;

        sum = Add (sum, n);

        System.out.println("\nSum: " + sum);
    }
}