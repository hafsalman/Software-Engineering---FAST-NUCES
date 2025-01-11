//Hafsa Salman
//22K-5161
//Task no. 01

public class Task_01
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("Roll no. 22K-5161");
        System.out.println("Task no. 01");
        System.out.println();

        Singly s = new Singly();

        s.insert(1);
        s.insert(2);
        s.insert(3);
        s.insert(4);
        s.insert(5);

        s.print();
    }
}

class Singly
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

    public Singly()
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

    public void print()
    {
        System.out.println("Printing Linked list: ");

        Node temp = head;

        while (temp != null)
        {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("NULL");
        System.out.println("\nSize of linked list: " + size);
    }
}