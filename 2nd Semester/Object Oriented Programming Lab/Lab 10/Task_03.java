//Hafsa Salman
//22K-5161
//Task no.03

import java.util.Scanner;

public class Task_03
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("Roll no. 22K-5161");
        System.out.println("Task no. 03");
        System.out.println();

        Scanner s = new Scanner(System.in);

        String n_1, n_2;

        System.out.print("Enter the first number: ");
        n_1 = s.nextLine();

        System.out.print("Enter the second number: ");
        n_2 = s.nextLine();

        try
        {
            if (n_1 == null || n_2 == null || n_1.isEmpty() || n_2.isEmpty())
            {
                throw new IllegalArgumentException("The number(s) is/are either null or empty.");
            }

            double num_1 = Double.parseDouble(n_1);
            double num_2 = Double.parseDouble(n_2);

            double ans;

            ans = num_1/num_2;

            if (num_2 == 0)
            {
                throw new ArithmeticException("Division by 0 is not possible.");
            }

            System.out.println("Answer after dividing: " + ans);
        }

        catch (NumberFormatException e)
        {
            System.out.println(e);
        }

        catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }

        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}