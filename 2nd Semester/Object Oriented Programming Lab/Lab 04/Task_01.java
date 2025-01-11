//Hafsa Salman
//22K-5161
//Task no. 01

import java.util.Scanner;

public class Task_01
{
    public static void main (String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("Roll no. 22K-5161");
        System.out.println("Task no. 01");
        System.out.print("\n");

        System.out.println("Task n. 01: Part a");
        System.out.print("\n");

        Box box_1 = new Box(5, 6);

        box_1.print();

        System.out.println("\n");

        System.out.println("Task n. 01: Part b");
        System.out.print("\n");

        Box box_2 = new Box(5);

        box_2.print();

        System.out.println("\n");

        System.out.println("Task n. 01: Part c");
        System.out.print("\n");

        Box box_3 = new Box();

        box_3.print();
    }
}

class Box
{
    Scanner s = new Scanner(System.in);
    int width, height;

    //Task no. 01: Part a
    public Box (int width, int height)
    {
        if (width >= 0 && height >= 0)
        {
            this.width = width;
            this.height = height;
        }

        else
        {
            System.out.println("Width or height or both are non-positive values.");
        }
    }

    //Task no. 01: Part b
    public Box (int height)
    {
        System.out.print("Enter width: ");
        width = s.nextInt();

        if (width >= 0 && height >= 0)
        {
            this.width = width;
            this.height = height;
        }

        else
        {
            System.out.println("Width or height or both are non-positive values.");
        }
    }

    //Task no. 02: Part c
    public Box ()
    {
        System.out.print("Enter width: ");
        width = s.nextInt();

        System.out.print("Enter height: ");
        height = s.nextInt();

        if (width >= 0 && height >= 0)
        {
            this.width = width;
            this.height = height;
        }

        else
        {
            System.out.println("Width or height or both are non-positive values.");
        }
    }

    //Printing
    void print ()
    {
        System.out.println("Width of the box: " + width);
        System.out.println("Height of the box: " + height);
    }
}