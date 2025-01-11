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

        Scanner s = new Scanner(System.in);

        links sort = new links();

        int num;

        System.out.print("Enter the number of nodes you want to enter: ");
        num = s.nextInt();

        int data;

        System.out.println("\nEnter node: ");
        for (int i=0; i<num; i++)
        {
            System.out.print("Node " + (i+1) + ": ");
            data = s.nextInt();

            sort.Insert(data);
        }

        System.out.println("\nPrinting Linked List: ");
        sort.Print();

        sort.head = sort.MergeSort(sort.head);

        System.out.println("\nSorted Linked List: ");
        sort.Print();
    }
}

class links
{
    class Node
    {
        int data;
        Node next;

        public Node(int data)
        {
            this.data = data;
        }
    }

    Node head;
    Node tail;

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
            tail = n;
        }
    }

    Node MergeSort(Node head)
    {
        if (head == null || head.next == null)
        {
            return head;
        }

        Node middle = Middle(head);

        Node nextMiddle = middle.next;
        middle.next = null;

        Node left = MergeSort(head);
        Node right = MergeSort(nextMiddle);

        return merge(left, right);
    }

    private Node merge(Node left, Node right)
    {
        if (left == null)
        {
            return right;
        }

        if (right == null)
        {
            return left;
        }

        Node result;

        if (left.data <= right.data)
        {
            result = left;
            result.next = merge(left.next, right);
        }

        else
        {
            result = right;
            result.next = merge(left, right.next);
        }

        return result;
    }

    private Node Middle(Node head)
    {
        if (head == null)
        {
            return head;
        }

        Node H1 = head;
        Node H2 = head;

        while (H2.next != null && H2.next.next != null)
        {
            H1 = H1.next;
            H2 = H2.next.next;
        }

        return H1;
    }

    public void Print()
    {
        Node temp = head;

        while (temp != null)
        {
            System.out.print(temp.data + " -> ");

            temp = temp.next;
        }

        System.out.println("NULL");
    }
}