//Hafsa Salman
//22K-5161
//Task no. 13

public class Task_13
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("Roll no. 22K-5161");
        System.out.println("Task no. 13");
        System.out.println();

        Concatenate L = new Concatenate();

        L.Insert(1);
        L.Insert(2);
        L.Insert(3);
        L.Insert(4);

        System.out.println("\nPrinting L linked list: ");
        L.Print();

        Concatenate M = new Concatenate();

        M.Insert(5);
        M.Insert(6);
        M.Insert(7);
        M.Insert(8);
        M.Insert(9);

        System.out.println("\nPrinting M linked list: ");
        M.Print();

        Concatenate LM = new Concatenate();

        if (L.head == null)
        {
            LM.head = M.head;
            LM.tail = M.tail;
        }

        else if (M.head == null)
        {
            LM.head = L.head;
            LM.tail = L.tail;
        }

        else
        {
            LM.head = L.head;
            L.tail.next = M.head;
            M.head.prev = L.tail;
            LM.tail = M.tail;
        }

        System.out.println("\nPrinting LM concatenated linked list: ");
        LM.Print();
    }
}

class Concatenate
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
            head = n;
            tail = n;
        }

        else
        {
            n.prev = tail;
            tail.next = n;
            tail = n;
        }
    }

    public void Print ()
    {
        Node temp = head;

        System.out.print("NULL <=> ");

        while (temp != null)
        {
            System.out.print(temp.data + " <=> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }
}