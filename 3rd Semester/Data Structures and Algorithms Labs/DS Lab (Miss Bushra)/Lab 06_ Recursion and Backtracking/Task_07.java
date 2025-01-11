//Hafsa Salman
//22K-5161
//Task no. 07

import java.util.Scanner;

public class Task_07
{
    public static void Display(int [][] Grid, int size)
    {
        for (int i=0; i<size; i++)
        {
            for (int j=0; j<size; j++)
            {
                System.out.print(Grid[i][j] + "\t");
            }

            System.out.println();
        }
    }

    public static boolean Solve (int [][] Grid, int size)
    {
        boolean isSafe;

        for (int i=0; i<size; i++)
        {
            for (int j=0; j<size; j++)
            {
                if (Grid[i][j] == 0)
                {
                    for (int num=1; num<=9; num++)
                    {
                        isSafe = true;

                        for (int exist=0; exist<9; exist++)
                        {
                            if (Grid[i][exist] == num || Grid[exist][j] == num)
                            {
                                isSafe = false;

                                break;
                            }
                        }

                        if (isSafe)
                        {
                            Grid[i][j] = num;

                            if (Solve(Grid, size))
                            {
                                return true;
                            }

                            Grid[i][j] = 0;
                        }
                    }

                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("Roll no. 22K-5161");
        System.out.println("Task no. 07");
        System.out.println();

        Scanner s = new Scanner(System.in);

        int size;

        size = 9;

        int [][] Grid = new int [size][size];

        System.out.println("Enter the elements (in case of blank space, enter 0): ");
        for (int i=0; i<size; i++)
        {
            for (int j=0; j<size; j++)
            {
                System.out.print("Grid place " + (i+1) + " x " + (j+1) +": ");
                Grid[i][j] = s.nextInt();
            }

            s.nextLine();
        }

        System.out.println("\n\nPrinting the entered grid: ");
        Display(Grid, size);

        if (Solve(Grid, size))
        {
            System.out.println("\n\nPrinting the solved sudoku: ");
            Display(Grid, size);
        }

        else
        {
            System.out.println("\n\nNo solution exists!");
        }
    }
}