//Hafsa Salman
//22K-5161
//Task no. 01

import java.util.ArrayList;
import java.util.List;

public class Task_01
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("Roll no. 22K-5161");
        System.out.println("Task no. 01");
        System.out.println();

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        double average;

        average = calculateAverage(list);

        System.out.println("Average: " + average);
    }

    public static double calculateAverage(List<Integer> list)
    {
        try
        {
            if (list == null || list.isEmpty())
            {
                throw new IllegalArgumentException("List is null or empty");
            }

            int sum, count;

            sum = 0;
            count = 0;

            for (Integer num : list)
            {
                try
                {
                    int valid;

                    valid = Integer.parseInt(num.toString());

                    sum = sum + valid;

                    count++;
                }

                catch (NumberFormatException e)
                {
                    System.out.println("Invalid integer: " + num);
                }
            }

            if (count == 0)
            {
                throw new IllegalArgumentException("List contains only invalid integers");
            }

            return (double) sum/count;
        }

        catch (IllegalArgumentException e)
        {
            System.out.println("Error: " + e.getMessage());

            return 0.0;
        }
    }
}