//Hafsa Salman
//22K-5161
//Task no. 03

import java.util.Scanner;

public class Task_03
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("Roll no. 22K-5161");
        System.out.println("Task no. 03");
        System.out.println();

        Scanner s = new Scanner(System.in);

        Stacks S = new Stacks();

        S.Push(10);
        S.Push(20);
        S.Push(30);
        S.Push(40);

        S.Display();

        System.out.println("\n");

        int data;

        System.out.print("Enter the element you want to insert at the bottom: ");
        data = s.nextInt();

        System.out.println();

        S.InsertBottom(data);
        S.Display();
    }
}

class Stacks
{
    class Node
    {
        int data;
        Node next;

        public Node (int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public Node top;

    public void Push (int data)
    {
        Node temp = new Node(data);

        if (temp == null)
        {
            System.out.println("Stack overflowed!");
            System.out.println("System terminated!");

            System.exit(1);
        }

        else
        {
            temp.data = data;
            temp.next = top;
            top = temp;
        }
    }

    public void Display()
    {
        Node temp = top;

        System.out.println("Printing Stack: ");
        while (temp != null)
        {
            System.out.print(temp.data + "\t");

            temp = temp.next;
        }
    }

    public void InsertBottom (int data)
    {
        Node temp = top;

        if (top == null)
        {
            Push(data);
        }

        else
        {
            while (temp.next != null)
            {
                temp = temp.next;
            }

            temp.next = new Node(data);
        }
    }
}