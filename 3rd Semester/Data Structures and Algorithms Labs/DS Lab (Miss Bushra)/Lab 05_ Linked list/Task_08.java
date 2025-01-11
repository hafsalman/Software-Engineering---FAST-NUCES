//Hafsa Salman
//22K-5161
//Task no. 08

public class Task_08
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("Roll no. 22K-5161");
        System.out.println("Task no. 08");
        System.out.println();

        Singly_08 S = new Singly_08();

        System.out.println("Linked list 01: ");

        S.Insert(2);
        S.Insert(4);
        S.Insert(1);
        S.Insert(1);
        S.Insert(4);
        S.Insert(2);

        S.Print();
        S.result(S.head);
    }
}

class Singly_08
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

    public Singly_08 ()
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

    public void Print ()
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

    public Node findMiddle (Node head)
    {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public Node reverseList(Node head)
    {
        Node prev = null;
        Node temp = head;

        while (temp != null)
        {
            Node next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }

        return prev;
    }

    public boolean palindrome (Node head)
    {
        if (head == null || head.next == null)
        {
            return true;
        }

        Node middle = findMiddle(head);

        Node secondHalf = reverseList(middle.next);

        Node first = head;

        while (secondHalf != null)
        {
            if (first.data != secondHalf.data)
            {
                return false;
            }

            first = first.next;
            secondHalf = secondHalf.next;
        }

        return true;
    }

    public void result (Node head)
    {
        if (palindrome(head))
        {
            System.out.println("It is a palindrome.");
        }

        else
        {
            System.out.println("It is not a palindrome.");
        }
    }
}