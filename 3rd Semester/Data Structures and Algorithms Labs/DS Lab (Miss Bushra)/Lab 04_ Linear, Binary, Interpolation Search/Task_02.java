//Hafsa Salman
//22K-5161
//Task no. 02

import java.util.Scanner;

public class Task_02
{
    static void Sort (int [] array, int size)
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

        System.out.println("\n\nPrinting sorted array: ");
        for (int i=0; i<size; i++)
        {
            System.out.print(array[i] + "\t");
        }
    }

    static int BinarySearch (int []array, int size, int target)
    {
        int left, right, mid;

        left = 0;
        right = size-1;

        while (left <= right)
        {
            mid = left + (right - left)/2;

            if (array[mid] == target)
            {
                return mid;
            }

            else if (array[mid] < target)
            {
                left = mid + 1;
            }

            else
            {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("Roll no. 22K-5161");
        System.out.println("Task no. 02");
        System.out.println();

        Scanner s = new Scanner(System.in);

        int size;

        System.out.print("Enter the size of the array: ");
        size = s.nextInt();

        int []array = new int[size];

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

        Sort(array, size);

        int target;

        System.out.print("\n\nEnter number you want to search: ");
        target = s.nextInt();

        int index;

        index = BinarySearch(array, size, target);

        if (index == -1)
        {
            System.out.println("\n" + target + " not found in the array.");
        }

        else
        {
            System.out.println("\n" + target + " is found on index " + index + ".");
        }
    }
}