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

        Singly_03 S = new Singly_03();

        S.insert(2);
        S.insert(3);
        S.insert(4);
        S.insert(5);

        S.print();

        Scanner s = new Scanner(System.in);

        int num;

        System.out.print("\nEnter number you want to insert at the start of linked list: ");
        num = s.nextInt();

        S.InsertFirst(num);

        System.out.println("\nInserting number at the start of linked list...");
        System.out.println();

        S.print();
    }
}

class Singly_03
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

    public Singly_03 ()
    {
        this.size = 0;
    }

    public void insert(int data)
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

    public void InsertFirst(int data)
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