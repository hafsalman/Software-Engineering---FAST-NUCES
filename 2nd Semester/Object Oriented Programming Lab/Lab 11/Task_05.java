//Hafsa Salman
//22K-5161
//Task no. 05

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Task_05
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("Roll no. 22K-5161");
        System.out.println("Task no. 05");
        System.out.println();

        File f = new File("Confidential.txt");

        try
        {
            if (f.createNewFile())
            {
                System.out.println("File created!");
            }
        }

        catch (Exception e)
        {
            System.out.println("File not created!");
        }

        Scanner s = new Scanner(System.in);

        String des;

        System.out.print("Enter your designation: ");
        des = s.nextLine();

        if (des.equals("Faculty"))
        {
            f.setExecutable(true);
            f.setReadable(true);
            f.setWritable(true);

            System.out.println(f.canExecute());
            System.out.println(f.canRead());
            System.out.println(f.canWrite());
        }

        else if (des.equals("Student"))
        {
            f.setExecutable(false);
            f.setReadable(true);
            f.setWritable(false);

            System.out.println(f.canExecute());
            System.out.println(f.canRead());
            System.out.println(f.canWrite());
        }

        else
        {
            System.out.println("Invalid Input!");
        }
    }
}