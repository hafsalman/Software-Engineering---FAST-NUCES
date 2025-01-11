//Hafsa Salman
//22K-5161
//Task no. 06

import java.util.Scanner;

public class Task_06
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("Roll no. 22K-5161");
        System.out.println("Task no. 06");
        System.out.println();

        Singly_06 S = new Singly_06();

        S.Insert(1);
        S.Insert(2);
        S.Insert(3);
        S.Insert(4);
        S.Insert(5);
        S.Insert(6);
        S.Insert(7);
        S.Insert(8);

        S.print();

        Scanner s = new Scanner(System.in);

        int value, replace;

        System.out.print("\nEnter the value that you want to replace: ");
        replace = s.nextInt();

        System.out.print("Enter the value: ");
        value = s.nextInt();

        S.Update(value, replace);

        System.out.println("\nUpdating value...");
        System.out.println();

        S.print();
    }
}

class Singly_06
{
    class Node
    {
        int data;
        Node next;

        public Node (int data)
        {
            this.data = data;
        }

        public Node (int data, Node next)
        {
            this.data = data;
            this.next = next;
        }
    }

    public Node head;
    public Node tail;

    int size;

    public Singly_06 ()
    {
        this.size = 0;
    }

    public void Insert (int data)
    {
        Node n = new Node(data);

        if (head == null)
        {
            head = n;
            tail = n;
        }

        else
        {
            tail.next = n;
            tail = n;
        }

        size++;
    }

    public void Update (int value, int replace)
    {
        Node n = new Node(value);

        Node temp = head;

        while (temp.next.data != replace)
        {
            temp = temp.next;
        }

        n.next = temp.next.next;
        temp.next = n;
    }

    public void print()
    {
        Node temp = head;

        System.out.println("Printing linked list: ");

        while (temp != null)
        {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("NULL");
        System.out.println("\nSize of linked list: " + size);
    }
}