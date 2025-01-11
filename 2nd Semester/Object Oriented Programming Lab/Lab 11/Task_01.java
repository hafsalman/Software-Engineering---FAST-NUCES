//Hafsa Salman
//22K-5161
//Task no. 01

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Task_01
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("Roll no. 22K-5161");
        System.out.println("Task no. 01");
        System.out.println();

        Scanner s = new Scanner(System.in);

        File f = new File ("C:\\Users\\Salman\\Desktop\\userList.txt");

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

        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Enter 5 elements: \n");

        BufferedWriter bw = new BufferedWriter(new FileWriter(f));

        for (int i=0; i<5; i++)
        {
            System.out.print("ELement " + (i+1) + ": ");
            list.add(s.nextInt());

            bw.write(String.valueOf(list.get(i)));
        }

        bw.close();

        BufferedReader br = new BufferedReader(new FileReader(f));

        System.out.println(br.readLine());

        br.close();
        f.delete();
    }
}