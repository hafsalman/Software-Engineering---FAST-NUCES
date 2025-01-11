//Hafsa Salman
//22K-5161
//Task no. 03

import java.util.Scanner;

public class Task_03
{
    public static void Display (int [] array, int size)
    {
        for (int i=0; i<size; i++)
        {
            System.out.print(array[i] + "\t");
        }
    }

    public static void Merge(int arr[], int l, int m, int r)
    {
        int n1, n2;

        n1 = m - l + 1;
        n2 = r - m;

        int [] L = new int[n1];
        int [] R = new int[n2];

        for (int i = 0; i < n1; ++i)
        {
            L[i] = arr[l + i];
        }

        for (int j = 0; j < n2; ++j)
        {
            R[j] = arr[m + 1 + j];
        }

        int i, j;

        i = 0;
        j = 0;

        int k;

        k = l;

        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }

            else
            {
                arr[k] = R[j];
                j++;
            }

            k++;
        }

        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void sort(int arr[], int l, int r)
    {
        if (l < r)
        {
            int m = (l + r) / 2;

            sort(arr, l, m);
            sort(arr, m + 1, r);

            Merge(arr, l, m, r);
        }
    }

    public static void main(String args[])
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("Roll no. 22K-5161");
        System.out.println("Task no. 03");
        System.out.println();

        Scanner s = new Scanner(System.in);

        int [] array = new int [10];

        System.out.println("Enter the elements of the array: ");
        for (int i=0; i<10; i++)
        {
            System.out.print("Element " + (i+1) + ": ");
            array[i] = s.nextInt();
        }

        System.out.println("\nPrinting Array: ");
        Display(array, 10);

        sort(array, 0, 9);

        System.out.println("\n\nPrinting Sorted Array: ");
        Display(array, 10);
    }
}