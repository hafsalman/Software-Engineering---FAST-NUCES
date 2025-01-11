//Hafsa Salman
//22K-5161
//Question no. 04

import java.util.Scanner;

public class Question_04
{
    public static void main(String[] args)
    {
        System.out.println("Hafsa Salman");
        System.out.println("22K-5161");
        System.out.println("Question no. 04");
        System.out.println();

        Whatsapp W = new Whatsapp();

        Scanner s = new Scanner(System.in);

        String name;
        String m;

        System.out.print("Recipient Name: ");
        name = s.nextLine();

        System.out.print("Enter Message: ");
        m = s.nextLine();

        W.send(name, m);
        W.receive(m);
    }
}

interface MessageService
{
    abstract public void send (String recipient, String message);
    abstract public String receive(String message);
}

class Whatsapp implements MessageService
{
    @Override
    public void send(String recipient, String message)
    {
        System.out.println("\nTo: " + recipient);
        System.out.println("Message: " + message);

        System.out.println("\nMessage Sent!");
    }

    @Override
    public String receive(String message)
    {
        System.out.println();
        System.out.println("Message received!");
        return ("\nMessage: " + message);
    }
}