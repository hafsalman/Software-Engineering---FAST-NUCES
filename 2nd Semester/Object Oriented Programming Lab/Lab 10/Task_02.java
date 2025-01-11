//Hafsa Salman
//22K-5161
//Task no.02

import java.util.Scanner;

public class Task_02
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("Roll no. 22K-5161");
        System.out.println("Task no. 02");
        System.out.println();

        Scanner s = new Scanner(System.in);

        String str;

        System.out.print("Enter a string: ");
        str = s.nextLine();

        int num, fact;

        try
        {
            num = Integer.parseInt(str);

            if (num > 0)
            {
                fact = 1;

                for (int i=1; i<= num; i++)
                {
                    fact = fact * i;
                }

                System.out.println("Factorial of " + num + ": " + fact);
            }

            else
            {
                System.out.println("Number is either 0 or negative!");
            }
        }

        catch (NullPointerException e)
        {
            System.out.println(e);
        }

        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}