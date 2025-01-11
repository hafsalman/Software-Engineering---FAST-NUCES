//Hafsa Salman
//22K-5161
//Task no. 06

import java.util.Arrays;

public class Task_06
{
    static int[] merge(int[][] arrays)
    {
        int total;

        total = 0;

        for (int i=0; i<arrays.length; i++)
        {
            int[] array = arrays[i];
            total = total + array.length;
        }

        int[] result = new int[total];
        int pos;

        pos = 0;

        for (int i=0; i<arrays.length; i++)
        {
            int[] array = arrays[i];
            for (int j = 0; j < array.length; j++)
            {
                result[pos++] = array[j];
            }
        }

        return result;
    }

    static void quickSort(int[] arr, int low, int high)
    {
        if (low >= high)
        {
            return;
        }

        int start, end, mid, pivot;

        start = low;
        end = high;
        mid = start + (end - start) / 2;
        pivot = arr[mid];

        while (start <= end)
        {
            while (arr[start] < pivot)
            {
                start++;
            }

            while (arr[end] > pivot)
            {
                end--;
            }

            if (start <= end)
            {
                int temp;

                temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;

                start++;
                end--;
            }
        }

        quickSort(arr, low, end);
        quickSort(arr, start, high);
    }

    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("Roll no. 22K-5161");
        System.out.println("Task no. 06\n");

        int[][] arr = {{3, 13}, {8, 10, 11}, {9, 15}};

        int[] array = merge(arr);

        quickSort(array, 0, array.length - 1);

        System.out.println("Merged and Sorted Array: " + Arrays.toString(array));
    }
}
