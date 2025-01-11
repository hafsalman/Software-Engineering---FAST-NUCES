//Hafsa Salman
//22K-5161
//Task 04

import java.util.Scanner;

public class Task_04
{
    static void Sort(int[] array, int size)
    {
        int temp;

        for (int i=0; i<size; i++)
        {
            for (int j=i; j>0; j--)
            {
                if (array[j] < array[j-1])
                {
                    temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }

                else
                {
                    break;
                }
            }
        }

        int max = array[size-1];
        int mid = (size-1)/2;

        for (int i=size-1; i>mid; i--)
        {
            if (array[i] > array[i-1])
            {
                temp = array[i];
                array[i] = array[i-1];
                array[i-1] = temp;
            }
        }
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

        Sort(array, size);

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