//Hafsa Salman
//22K-5161
//Task no. 11

import java.util.Scanner;

public class Task_11
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("Roll no. 22K-5161");
        System.out.println("Task no. 11");
        System.out.println();

        Scanner S = new Scanner(System.in);

        Circly C = new Circly();

        C.Insert(20);
        C.Insert(40);
        C.Insert(60);
        C.Insert(70);
        C.Insert(80);

        C.Print();

        int end;

        System.out.print("\n\nEnter the number you want to add at the end of the linked list: ");
        end = S.nextInt();

        C.Insert(end);
        System.out.println("\nInserting number at the end of the linked list... ");
        C.Print();

        int start;

        System.out.print("\n\nEnter the number you want to add at the start of the linked list: ");
        start = S.nextInt();

        C.FirstInsert(start);
        System.out.println("\nInserting number at the start of the linked list... ");
        C.Print();

        int after, node;

        System.out.print("\n\nEnter the number you want to add the value after: ");
        after = S.nextInt();
        System.out.print("Enter the number you want to enter: ");
        node = S.nextInt();

        C.Inserting_n(after, node);
        System.out.println("\nInserting number after the nth node of the linked list... ");
        C.Print();

        int del;

        System.out.print("\n\nEnter the number you want to delete: ");
        del = S.nextInt();

        C.Delete(del);
        System.out.println("\nDeleting node in the linked list... ");
        C.Print();
    }
}

class Circly
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

    public void Insert(int data)
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
            n.next = head;
            tail = n;
        }
    }

    public void Print ()
    {
        Node temp = head;

        System.out.println("\nPrinting linked list: ");

        do
        {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        while (temp != head);

        System.out.print("HEAD");
    }

    public void FirstInsert (int data)
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
            n.next = head;
            head = n;
        }
    }

    public Node find (int after)
    {
        Node n = head;

        do
        {
            if (n.data == after)
            {
                return n;
            }

            n = n.next;
        }
        while (n != head);

        return null;
    }

    public void Inserting_n (int after, int data)
    {
        Node p = find(after);
        Node n = new Node(data);

        if (p == null)
        {
            System.out.println("Linked list does not exist.");
        }

        else
        {
            n.next = p.next;
            p.next = n;
        }
    }

    public void Delete (int data)
    {
        Node temp = head;

        if (temp == null)
        {
            return;
        }

        if (temp.data == data)
        {
            head = head.next;
            tail.next = head;

            return;
        }

        do
        {
            Node n = temp.next;

            if (n.data == data)
            {
                temp.next = n.next;

                break;
            }

            temp = temp.next;
        }
        while (temp.next != head);
    }
}