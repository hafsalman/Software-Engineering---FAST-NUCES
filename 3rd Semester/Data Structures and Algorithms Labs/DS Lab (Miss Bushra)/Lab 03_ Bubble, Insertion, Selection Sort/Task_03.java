//Hafsa Salman
//22K-5161
//Task 03

import java.util.Scanner;

public class Task_03
{
    static void InsertionSort(int []array, int n)
    {
        int temp;

        for (int i=0; i<n; i++)
        {
            for (int j=i; j>0; j--)
            {
                if (array[j] < array[j-1])
                {
                    temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }

                else
                {
                    break;
                }
            }
        }

        int max = array[n-1];
        int mid = (n-1)/2;

        for (int i=n-1; i>mid; i--)
        {
            if (array[i] > array[i-1])
            {
                temp = array[i];
                array[i] = array[i-1];
                array[i-1] = temp;
            }
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("Roll no. 22K-5161");
        System.out.println("Task no. 03");
        System.out.println();

        Scanner s = new Scanner(System.in);

        int n;

        System.out.print("Enter size of the array: ");
        n = s.nextInt();

        int array[] = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i=0; i<n; i++)
        {
            System.out.print("Element " + (i+1) + ": ");
            array[i] = s.nextInt();
        }

        System.out.println("\nPrinting Array: ");
        for (int i=0; i<n; i++)
        {
            System.out.print(array[i] + "\t");
        }

        InsertionSort(array, n);

        System.out.println("\n\nPrinting the sorted array: ");
        for (int i=0; i<n; i++)
        {
            System.out.print(array[i] + "\t");
        }
    }
}
