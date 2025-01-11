//Hafsa Salman
//22K-5161
//Task no. 05

import java.util.Scanner;

public class Task_05
{
    static void Sorting (int []container, int num)
    {
        int temp;

        for (int i=0; i<num; i++)
        {
            for (int j=0; j<(num-1-i); j++)
            {
                if (container[j] > container[j+1])
                {
                    temp = container[j];
                    container[j] = container[j+1];
                    container[j+1] = temp;
                }
            }
        }

        System.out.println("\n\nPrinting sorted containers: ");
        for (int i=0; i<num; i++)
        {
            System.out.print(container[i] + "\t");
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("Roll no. 22K-5161");
        System.out.println("Task no. 05");
        System.out.println();

        Scanner s = new Scanner(System.in);

        int num;

        System.out.print("Enter the number of containers: ");
        num = s.nextInt();

        int []container = new int[num];

        System.out.println("Enter the container shipment times: ");
        for (int i=0; i<num; i++)
        {
            System.out.print("Container " + (i+1) + ": ");
            container[i] = s.nextInt();
        }

        System.out.println("\nPrinting intial container shipment order: ");
        for (int i=0; i<num; i++)
        {
            System.out.print(container[i] + "\t");
        }

        Sorting(container, num);
    }
}