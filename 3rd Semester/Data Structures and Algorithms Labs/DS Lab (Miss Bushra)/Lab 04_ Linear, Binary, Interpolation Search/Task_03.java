//Hafsa Salman
//22K-5161
//Task no. 03

import java.util.Scanner;

public class Task_03
{
    static void Sort (int [] array)
    {
        int temp;

        for (int i=0; i<(array.length-1); i++)
        {
            for (int j=0; j<(array.length-i-1); j++)
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
        for (int i=0; i<array.length; i++)
        {
            System.out.print(array[i] + "\t");
        }
    }

    static int BinarySearch (int []array, int target)
    {
        int left, right, mid;

        left = 0;
        right = array.length-1;

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

    static int InterpolationSearch (int []array, int target)
    {
        int start, end;
        int pos;

        start = 0;
        end = array.length - 1;

        while (start <= end && target >= array[start] && target <= array[end])
        {
            pos = start + ((target - array[start]) * (end - start))/(array[end] - array[start]);

            if (array[pos] == target)
            {
                return pos;
            }

            if (array[pos] < target)
            {
                start = pos + 1;
            }

            else
            {
                end = pos - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("Roll no. 22K-5161");
        System.out.println("Task no. 03");
        System.out.println();

        Scanner s = new Scanner(System.in);

        int [] array = {5, 9, 6, 1, 7, 3};

        System.out.println("\nPrinting array: ");
        for (int i=0; i<array.length; i++)
        {
            System.out.print(array[i] + "\t");
        }

        int target;

        System.out.print("\n\nEnter number you want to search: ");
        target = s.nextInt();

        Sort(array);

        //Binary Search
        int b_index;

        b_index = BinarySearch(array, target);

        System.out.println("\n\nUsing Binary Search: ");
        if (b_index == -1)
        {
            System.out.println(target + " not found in the array.");
        }

        else
        {
            System.out.println(target + " is found on index " + b_index + ".");
        }

        //Interpolation Search
        int i_index;

        i_index = InterpolationSearch(array, target);

        System.out.println("\n\nUsing Interpolation Search: ");
        if (i_index == -1)
        {
            System.out.println(target + " not found in the array.");
        }

        else
        {
            System.out.println(target + " is found on index " + i_index + ".");
        }

        System.out.println("\nInterpolation search is convenient than binary search \ndue to the time complexity difference. Interpolation \ncan work better on sorted and evenly distributed array \nrather than binary search.");
    }
}