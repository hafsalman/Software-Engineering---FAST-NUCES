//Hafsa Salman
//22K-5161
//Task no. 07

import java.util.Scanner;

public class Task_07
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

    static boolean Multiple(int []array)
    {
        int largest;

        largest = array[array.length-1];

        for (int i=0; i<(array.length-1); i++)
        {
            if (largest % array[i] != 0)
            {
                return false;
            }
        }

        return true;
    }

    static int InterpolationSearch (int []array)
    {
        int start, end;
        int pos;

        start = 0;
        end = array.length - 1;

        while (start <= end && array[start] <= array[end])
        {
            if (start == end)
            {
                if (array[start] ==  array[end] && Multiple(array))
                {
                    return array[end];
                }

                else
                {
                    return -1;
                }
            }

            pos = start + (((end - start) / (array[end] - array[start])) * (array[end] - array[end]));

            if (Multiple(array))
            {
                return pos;
            }

            if (array[pos] < array[end])
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
        System.out.println("Task no. 07");
        System.out.println();

        Scanner s = new Scanner(System.in);

        int [] array = {24, 36, 2, 8, 14, 86};

        System.out.println("\nPrinting array: ");
        for (int i=0; i<array.length; i++)
        {
            System.out.print(array[i] + "\t");
        }

        Sort(array);

        int i_index;

        i_index = InterpolationSearch(array);

        if (i_index == -1)
        {
            System.out.println("\n\nMultiple not found in the array.");
        }

        else
        {
            System.out.println("\n" + i_index + " is found on index " + i_index + ".");
        }
    }
}