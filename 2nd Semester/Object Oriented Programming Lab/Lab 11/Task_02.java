//Hafsa Salman
//22K-5161
//TAsk no. 02

import java.io.*;

public class Task_02
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("Roll no. 22K-5161");
        System.out.println("Task no. 02");
        System.out.println();

        File f = new File ("HafsaSalman.txt");

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

        BufferedWriter bw = new BufferedWriter(new FileWriter(f, true));

        bw.write("Hafsa Salman");
        bw.write("\nSoftware Engineering Student");
        bw.close();

        BufferedReader br = new BufferedReader(new FileReader(f));

        String str;

        while ((str = br.readLine()) != null)
        {
            System.out.println(str);
        }

        br.close();
        f.delete();
    }
}