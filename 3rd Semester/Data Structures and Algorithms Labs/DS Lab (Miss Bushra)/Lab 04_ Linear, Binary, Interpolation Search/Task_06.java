//Hafsa Salman
//22K-5161
//Task no. 06

import java.util.Scanner;

public class Task_06
{
    static int LinearSearch(int []array, int size, int target)
    {
        for (int i=(size-1); i>0; i--)
        {
            if (array[i] == target)
            {
                return i;
            }
        }

        return -1;
    }

    static void Occurrences (int []array, int size, int target)
    {
        int occur;

        occur = 0;

        for (int i=0; i<size; i++)
        {
            if (array[i] == target)
            {
                occur++;
            }
        }

        System.out.println("Occurrences: " + occur);
    }

    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("Roll no. 22K-5161");
        System.out.println("Task no. 06");
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

        int target;

        System.out.print("\n\nEnter number you want to search: ");
        target = s.nextInt();

        int index;

        index = LinearSearch(array, size, target);

        if (index == -1)
        {
            System.out.println("\n" + target + " not found in the array.");
        }

        else
        {
            System.out.println("\n" + target + " is found on index " + index + ".");
        }

        Occurrences(array, size, target);
    }
}