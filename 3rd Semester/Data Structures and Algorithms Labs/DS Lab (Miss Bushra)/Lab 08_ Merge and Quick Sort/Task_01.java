//Hafsa Salman
//22K-5161
//Task no. 01

import java.util.Scanner;

public class Task_01
{
    public static void Display (int [] array, int size)
    {
        for (int i=0; i<size; i++)
        {
            System.out.print(array[i] + "\t");
        }
    }

    public static void QuickSort (int []array, int left, int right)
    {
        if (left >= right)
        {
            return;
        }

        int start, end, mid;

        start = left;
        end = right;

        mid = start + (end - start)/2;

        int pivot;

        pivot = array[mid];

        while (start <= end)
        {
            while (array[start] < pivot)
            {
                start++;
            }

            while (array[end] > pivot)
            {
                end--;
            }

            if (start <= end)
            {
                int temp;

                temp = array[start];
                array[start]  = array[end];
                array[end] = temp;

                start++;
                end--;
            }
        }

        QuickSort(array, left, end);
        QuickSort(array, start, right);
    }

    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("Roll no. 22K-5161");
        System.out.println("Task no. 01");
        System.out.println();

        Scanner s = new Scanner(System.in);

        int size;

        System.out.print("Enter the size of the array: ");
        size = s.nextInt();

        int [] array = new int [size];

        System.out.println("\nEnter the elements of the array: ");
        for (int i=0; i<size; i++)
        {
            System.out.print("Element " + (i+1) + ": ");
            array[i] = s.nextInt();
        }

        System.out.println("\nPrinting Array: ");
        Display(array, size);

        QuickSort(array, 0, size-1);

        System.out.println("\n\nPrinting Sorted Array: ");
        Display(array, size);
    }
}