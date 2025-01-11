//Hafsa Salman
//22K-5161
//Task no. 05

import java.util.Scanner;

public class Task_05
{
    static void LinearSearch(int []array, int size)
    {
        int max;

        max = 0;

        for (int i=0; i<size; i++)
        {
            if (array[i] > max)
            {
                max = array[i];
            }
        }

        System.out.println("\n\nMaximum element (Using linear search): " + max);
    }

    static void Sort_BinarySearch (int [] array, int size)
    {
        int temp;

        for (int i=0; i<(size-1); i++)
        {
            for (int j=0; j<(size-i-1); j++)
            {
                if (array[j] > array[j+1])
                {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        int min;

        min = array[0];

        System.out.println("Minimum element (Using binary search): " + min);
    }

    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("Roll no. 22K-5161");
        System.out.println("Task no. 05");
        System.out.println();

        Scanner s = new Scanner(System.in);

        int size;

        System.out.print("Enter the size of array: ");
        size = s.nextInt();

        int [] array = new int [size];

        System.out.println("\nEnter array: ");
        for (int i=0; i<size; i++)
        {
            System.out.print("Element " + (i+1) + ": ");
            array[i] = s.nextInt();
        }

        System.out.println("\nPrinting array: ");
        for (int i=0; i<size; i++)
        {
            System.out.print(array[i] + "\t");
        }

        LinearSearch(array, size);
        Sort_BinarySearch(array, size);
    }
}