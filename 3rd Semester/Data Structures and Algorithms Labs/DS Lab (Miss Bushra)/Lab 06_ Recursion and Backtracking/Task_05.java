//Hafsa Salman
//22K-5161
//Task no. 05

import java.util.Scanner;

public class Task_05
{
    public static void GeneratePermutation (char [] str, int index)
    {
        if (index == str.length)
        {
            System.out.println(new String(str));

            return;
        }

        for (int i=index; i<str.length; i++)
        {
            Swap(str, index, i);

            GeneratePermutation(str, index+1);

            Swap(str, index, i);
        }
    }

    public static void Swap (char [] str, int i, int j)
    {
        char temp;

        temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }

    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("Roll no. 22K-5161");
        System.out.println("Task no. 05");
        System.out.println();

        Scanner s = new Scanner(System.in);

        String input;

        System.out.print("Enter any string: ");
        input = s.next();

        char [] str = input.toCharArray();

        System.out.println("\nPrinting Permutations: ");
        GeneratePermutation(str, 0);
    }
}