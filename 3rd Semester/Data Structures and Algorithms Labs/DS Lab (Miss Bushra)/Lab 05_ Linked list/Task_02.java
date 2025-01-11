//Hafsa Salman
//22K-5161
//Task_02

import java.util.Scanner;

public class Task_02
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("Roll no. 22K-5161");
        System.out.println("Task no. 02");
        System.out.println();

        Scanner sc = new Scanner(System.in);

        Singly_02 s = new Singly_02();

        s.insert(1);
        s.insert(2);
        s.insert(3);
        s.insert(4);
        s.insert(5);

        s.print();

        int num;

        System.out.print("\n\nEnter the number you want to add at the end of the linked list: ");
        num = sc.nextInt();

        s.InsertLast(num);

        System.out.println("\nAdding number at the last of the linked list...");
        System.out.println();

        s.print();
    }
}

class Singly_02
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

    public Singly_02()
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