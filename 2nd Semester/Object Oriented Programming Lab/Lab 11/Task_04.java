//Hafsa Salman
//22K-5161
//Task no. 04

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Task_04
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("Roll no. 22K-5161");
        System.out.println("Task no. 04");
        System.out.println();

        File f = new File("student_details.txt");

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

        BufferedWriter bw = new BufferedWriter(new FileWriter(f));

        bw.write("Hafsa Salman");
        bw.write("\nMatriculation and Intermediate from APS and APDC (Federal Board)");
        bw.write("\n19");
        bw.write("\nReading");

        Scanner s = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter 5 elements: ");
        for (int i=0; i<5; i++)
        {
            System.out.print("ELement " + (i+1) + ": ");
            list.add(s.nextInt());

            bw.write(String.valueOf(list.get(i)));
        }

        bw.close();

        BufferedReader br = new BufferedReader(new FileReader(f));

        String str;

        while ((str = br.readLine()) != null)
        {
            System.out.println(str);
        }

        bw.close();
    }
}
