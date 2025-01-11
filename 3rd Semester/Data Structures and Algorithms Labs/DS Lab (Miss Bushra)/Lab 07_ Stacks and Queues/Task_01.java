//Hafsa Salman
//22K-5161
//Task no. 01

import java.util.Scanner;

public class Task_01
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("Roll no. 22K-5161");

        //Arrays
        System.out.println("Task no. 01: A (Arrays)");
        System.out.println();

        Scanner s = new Scanner(System.in);

        int size;
        String data;

        size = 10;

        A S = new A(size);

        System.out.println("Insert 10 strings: ");
        for (int i=0; i<size; i++)
        {
            System.out.print("Element " + (i+1) + ": ");
            data = s.nextLine();

            S.Push(data);
        }

        S.Display();

        System.out.println("\n\nDeleting 04 Strings...");

        System.out.println();
        System.out.println("Deleted " + S.Pop());
        System.out.println("Deleted " + S.Pop());
        System.out.println("Deleted " + S.Pop());
        System.out.println("Deleted " + S.Pop());

        System.out.println();
        S.Display();

        S.Swap();

        //Linked List
        System.out.println("\n\nTask no. 01: B (Linked list)");

        B L = new B();

        int item;

        System.out.println("\nInsert 5 integers: ");
        for (int i=0; i<5; i++)
        {
            System.out.print("Element " + (i+1) + ": ");
            item = s.nextInt();

            L.Push(item);
        }

        System.out.println();
        L.Display();

        System.out.println("\n\nDeleting the top element... ");
        L.Pop();

        System.out.println();
        L.Display();
    }
}

//With Arrays
class A
{
    String [] Array;
    int size;
    int top;


    public A (int size)
    {
        this.size = size;
        this.Array = new String [size];
        this.top = -1;
    }

    public void Push (String data)
    {
        if (isFull())
        {
            System.out.println("Stack Overflowed!");
            System.out.println("System terminated!");

            System.exit(1);
        }

        else
        {
            System.out.println("Inserting \"" + data + "\"");
            System.out.println();

            top++;
            Array[top] = data;
        }
    }

    public String Pop()
    {
        if (isEmpty())
        {
            System.out.println("Stack Underflow!");
            System.out.println("System terminated!");

            System.exit(1);
        }

        return Array[top--];
    }

    public void Swap()
    {
        System.out.println("\n\nSwapping first and the last element: ");

        String temp;

        temp = Array[0];
        Array[0] = Array[top];
        Array[top] = temp;

        System.out.println("\nAfter Swapping...");

        Display();
    }

    public boolean isFull()
    {
        return (top == size - 1);
    }

    public boolean isEmpty()
    {
        return (top == -1);
    }

    public void Display()
    {
        System.out.println("Printing Stack: ");
        for (int i=0; i<=top; i++)
        {
            System.out.print(Array[i] + "\t");
        }
    }
}

//With linked list
class B
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

    public void Pop ()
    {
        if (top == null)
        {
            System.out.println("Stack underflow!");
            System.out.println("System terminated!");

            System.exit(1);
        }

        else
        {
            Node temp = top;
            top = top.next;
            temp.next = null;
        }
    }

    public int Peek()
    {
        if (!isEmpty())
        {
            return top.data;
        }

        else
        {
            return -1;
        }
    }

    public boolean isEmpty()
    {
        return (top == null);
    }

    public void Display()
    {
        Node temp = top;

        System.out.println("Printing stack: ");
        while (temp != null)
        {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.print("NULL");
    }
}