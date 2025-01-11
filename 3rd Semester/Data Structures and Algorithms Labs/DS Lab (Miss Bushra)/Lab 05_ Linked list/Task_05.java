//Hafsa Salman
//22K-5161
//Task no. 05

import java.util.Scanner;

public class Task_05
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("Roll no. 22K-5161");
        System.out.println("Task no. 05");
        System.out.println();

        Singly_05 S = new Singly_05();

        S.insert(1);
        S.insert(2);
        S.insert(3);
        S.insert(4);
        S.insert(5);
        S.insert(6);
        S.insert(7);
        S.insert(8);
        S.insert(9);
        S.insert(10);

        S.print();
        S.DeleteLast();

        System.out.println("\nDeleting the last node...");
        System.out.println();

        S.print();

        Scanner s = new Scanner(System.in);

        int value;

        System.out.print("\nEnter the value (from linked list) you want to delete: ");
        value = s.nextInt();

        S.Delete_n(value);

        System.out.println("\nDeleting the entered value from linked list...");
        System.out.println();

        S.print();
    }
}

class Singly_05
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

    public Singly_05 ()
    {
        this.size = 0;
    }

    public void insert (int data)
    {
        Node n = new Node (data);

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

    public void DeleteLast()
    {
        Node temp = head;

        if (head == null)
        {
            System.out.println("There is no linked list.");

            return;
        }

        while (temp.next != tail)
        {
            temp = temp.next;
        }

        temp.next = null;
        tail = temp;

        size--;
    }

    public void Delete_n (int value)
    {
        Node temp = head;

        if (head == null)
        {
            System.out.println("There is no linked list.");

            return;
        }

        else if (value == tail.data)
        {
            DeleteLast();

            return;
        }

        else
        {
            while (temp.next.data != value)
            {
                temp = temp.next;
            }

            temp.next = temp.next.next;

            size--;
        }
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
        System.out.println("\nSize of the linked list: " + size);
    }
}