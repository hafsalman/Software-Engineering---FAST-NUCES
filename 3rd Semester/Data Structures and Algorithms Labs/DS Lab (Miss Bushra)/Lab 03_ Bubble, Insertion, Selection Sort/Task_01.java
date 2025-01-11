//Hafsa Salman
//22K-5161
//Task 01

import java.util.Scanner;

public class Task_01
{
    static void BubbleSort(int []arr, int size)
    {
        int temp;

        for (int i=0; i<size; i++)
        {
            for (int j=0; j<(size-1-i); j++)
            {
                if (arr[j] > arr[j+1])
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("Roll no. 22K-5161");
        System.out.println("Task no. 01");
        System.out.println();

        Scanner s = new Scanner(System.in);

        int size;

        System.out.print("Enter size of the array: ");
        size = s.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the elements of the array: ");
        for (int i=0; i<size; i++)
        {
            System.out.print("Element " + (i+1) + ": ");
            arr[i] = s.nextInt();
        }

        System.out.println("\nPrinting Array: ");
        for (int i=0; i<size; i++)
        {
            System.out.print(arr[i] + "\t");
        }

        BubbleSort(arr, size);

        System.out.println("\n\nPrinting the sorted array: ");
        for (int i=0; i<size; i++)
        {
            System.out.print(arr[i] + "\t");
        }
    }
}