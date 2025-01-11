//Hafsa Salman
//22K-5161
//Task no. 04

import java.util.Scanner;

public class Task_04
{
    public static boolean Sort (int num, int []Array)
    {
        if (num <= 1)
        {
            return true;
        }

        if (Array[num - 1] >= Array[num - 2])
        {
            return (Sort((num - 1), Array));
        }

        return false;
    }

    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("Roll no. 22K-5161");
        System.out.println("Task no. 04");
        System.out.println();

        Scanner s = new Scanner(System.in);

        int num;

        System.out.print("Enter number of elements of the array: ");
        num = s.nextInt();

        int []Array = new int[num];

        System.out.println("\nEnter elements: ");
        for (int i=0; i<num; i++)
        {
            System.out.print("Element " + (i+1) + ": ");
            Array[i] = s.nextInt();
        }

        System.out.println("\nPrinting array: ");
        for (int i=0; i<num; i++)
        {
            System.out.print(Array[i] + "\t");
        }

        System.out.println();

        boolean ans;

        ans = Sort (num, Array);

        if (!ans)
        {
            System.out.println("\nThe array is not sorted.");
        }

        else
        {
            System.out.println("\nThe array is sorted.");
        }
    }
}