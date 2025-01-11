//Hafsa Salman
//22K-5161
//Task 02

import java.util.Scanner;

public class Task_02
{
    static void SelectionSort(int []marks)
    {
        int temp;

        for (int i=0; i<(10-1); i++)
        {
            int min = i;

            for (int j=i+1; j<10; j++)
            {
                if (marks[j] < marks[min])
                {
                    min = j;
                }
            }

            temp = marks[min];
            marks[min] = marks[i];
            marks[i] = temp;
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("Roll no. 22K-5161");
        System.out.println("Task no. 02");
        System.out.println();

        Scanner s = new Scanner(System.in);

        int marks[] = new int [10];

        System.out.println("Enter the marks of 10 students: ");
        for (int i=0; i<10; i++)
        {
            System.out.print("Element " + (i+1) + ": ");
            marks[i] = s.nextInt();
        }

        System.out.println("\nPrinting Marks: ");
        for (int i=0; i<10; i++)
        {
            System.out.print(marks[i] + "\t");
        }

        SelectionSort(marks);

        System.out.println("\n\nPrinting the sorted marks: ");
        for (int i=0; i<10; i++)
        {
            System.out.print(marks[i] + "\t");
        }
    }
}