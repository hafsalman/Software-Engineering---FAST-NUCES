//Hafsa Salman
//22K-5161
//Task no. 04

import java.util.Scanner;

public class Task_04
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("Roll no. 22K-5161");
        System.out.println("Task no. 04");
        System.out.println();

        Singly_04 S = new Singly_04();

        S.insert(1);
        S.insert(2);
        S.insert(3);
        S.insert(5);
        S.insert(6);

        S.print();

        Scanner s = new Scanner(System.in);

        int value, num;

        System.out.print("\n\nEnter the number you want to enter in linked list: ");
        num = s.nextInt();

        System.out.print("\nEnter the number (from linked list) you want to insert the number: ");
        value = s.nextInt();

        System.out.println();

        S.Insert_n(num, value);

        S.print();
    }
}

class Singly_04
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

    public Singly_04 ()
    {
        this.size = 0;
    }

    public void insert (int data)
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

    public void InsertFirst (int data)
    {
        Node n = new Node(data);

        if (head == null)
        {
            head = n;
            tail = n;
        }

        else
        {
            n.next = head;
            head = n;
        }

        size++;
    }

    public void InsertLast (int data)
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

    public void Insert_n (int data, int value)
    {
        Node n = new Node(data);
        Node temp = head;

        if (size == 0)
        {
            InsertFirst(data);

            return;
        }

        else if (value == tail.data)
        {
            InsertLast(data);

            return;
        }

        else
        {
            while (temp.data != value)
            {
                temp = temp.next;

                if (temp.next == null)
                {
                    System.out.println("Entered value does not exist in linked list.");

                    return;
                }
            }

            n.next = temp.next;
            temp.next = n;

        }

        size++;
    }

    public void print ()
    {
        Node temp = head;

        System.out.println("Printing linked list: ");

        while (temp != null)
        {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("NULL");

        System.out.print("\nSize of linked list: " + size);
    }
}