//Hafsa Salman
//22K-5161
//Task 04

import java.util.Scanner;

public class Task_04
{
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
        System.out.println("Task no. 04");
        System.out.println();

        Scanner s = new Scanner(System.in);

        int array[] = {5, 91, 36, 46, 8};

        int amount;

        System.out.print("Enter the amount you have: ");
        amount = s.nextInt();

        int size;

        size = array.length;

        QuickSort(array, 0, size-1);

        int count, sum;

        count = 0;
        sum = 0;

        for (int i=0; i<size; i++)
        {
            if (sum + array[i] <= amount)
            {
                sum = sum + array[i];
                count++;
            }

            else
            {
                break;
            }
        }

        System.out.println("Number of toys you can buy (Maximum): " + count);
    }
}