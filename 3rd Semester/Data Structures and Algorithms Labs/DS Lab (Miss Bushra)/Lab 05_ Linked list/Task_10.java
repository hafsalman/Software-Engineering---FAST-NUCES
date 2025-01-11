//Hafsa Salman
//22K-5161
//Task no. 10

import java.util.Scanner;

public class Task_10
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("Roll no. 22K-5161");
        System.out.println("Task no. 10");
        System.out.println();

        Scanner S = new Scanner(System.in);

        Doubly_01 D = new Doubly_01();

        D.Insert(2);
        D.Insert(3);
        D.Insert(4);
        D.Insert(6);
        D.Insert(7);
        D.Insert(8);

        D.Print();

        int end;

        System.out.print("\nEnter a number you want to add in the end of the linked list: ");
        end = S.nextInt();

        D.Insert(end);
        System.out.println("\nAdding number at the end of the list... ");
        D.Print();

        int start;

        System.out.print("\nEnter a number you want to add in the start of the linked list: ");
        start = S.nextInt();

        D.FirstInsert(start);
        System.out.println("\nAdding number at the start of the list... ");
        D.Print();

        int after, node;

        System.out.print("\nEnter the node you want to insert the value after: ");
        after = S.nextInt();

        System.out.print("Enter the value you want to enter: ");
        node = S.nextInt();

        D.Inserting_n(after, node);
        System.out.println("\nInserting the number after nth node... ");
        D.Print();

        int del;

        System.out.print("\nEnter the node you want to delete: ");
        del = S.nextInt();

        D.delete(del);
        System.out.println("\nDeleting node... ");
        D.Print();
    }
}

class Doubly_01
{
    class Node
    {
        int data;
        Node next;
        Node prev;

        public Node (int data)
        {
            this.data = data;
        }

        public Node (int data, Node next, Node prev)
        {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }

    public Node head;
    public Node tail;

    public void Insert (int data)
    {
        Node n = new Node(data);

        if (head == null)
        {
            n.prev = null;
            head = n;
            tail = n;
            n.next = null;
        }

        else
        {
            tail.next = n;
            n.prev = tail;
            tail = n;
        }
    }

    public void Print()
    {
        Node temp = head;

        System.out.println("\nPrinting linked list: ");
        System.out.print("NULL <=> ");

        while (temp != null)
        {
            System.out.print(temp.data + " <=> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }

    public void FirstInsert (int data)
    {
        Node n = new Node(data);

        if (head == null)
        {
            n.prev = null;
            head = n;
            tail = n;
            n.next = null;
        }

        else
        {
            head.prev = n;
            n.prev = null;
            n.next = head;
            head = n;
        }
    }

    public Node find (int data)
    {
        Node temp = head;

        while (temp.next != null)
        {
            if (temp.data == data)
            {
                return temp;
            }

            temp = temp.next;
        }

        return null;
    }

    public void Inserting_n (int after, int data)
    {
        Node p = find(after);

        if (p == null)
        {
            System.out.println("There is no linked list.");
        }

        Node n = new Node(data);

        n.next = p.next;
        p.next = n;
        n.prev = p;

        if (n.next != null)
        {
            n.next.prev = n;
        }
    }

    public void delete (int data)
    {
        Node temp = head;

        if (head == null)
        {
            System.out.println("No linked list.");
        }

        else
        {
            while (temp.next.data != data)
            {
                temp = temp.next;
            }

            temp.next = temp.next.next;
            temp.next.prev = temp;
        }
    }
}