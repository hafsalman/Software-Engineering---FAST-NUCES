//Hafsa Salman
//22K-5161
//Task no.04

import java.util.Scanner;

public class Task_04
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("Roll no. 22K-5161");
        System.out.println("Task no. 04");
        System.out.println();

        Scanner s = new Scanner (System.in);

        String str;

        try
        {
            System.out.print("Enter a sentence: ");
            str = s.nextLine();

            int space = 0;

            if (str.isEmpty())
            {
                System.out.println("Null Pointer Exception!");

                System.exit(1);
            }

            for (int i=0; i<str.length(); i++)
            {
                if (str.charAt(i) == ' ')
                {
                    space++;
                }
            }

            if (space < 1)
            {
                int c = space/0;
            }

            System.out.println("Strings operation: ");
            System.out.println("Original String: " + str);
            System.out.println("String in Upper Case: " + str.toUpperCase());
            System.out.println("String in Lower Case: " + str.toLowerCase());
            System.out.println("Word Count: " + (space + 1));
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