//Hafsa Salman
//22K-5161
//Task no. 07

public class Task_07
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("Roll no. 22K-5161");
        System.out.println("Task no. 07");
        System.out.println();

        Singly_07 S = new Singly_07();

        S.Insert(1);
        S.Insert(2);
        S.Insert(3);
        S.Insert(4);
        S.Insert(5);
        S.Insert(10);
        S.Insert(9);
        S.Insert(8);
        S.Insert(7);
        S.Insert(6);

        S.print(S.head);

        S.Modify(S.head);
    }
}

class Singly_07
{
    class Node
    {
        int data;
        Node next;

        public Node(int data)
        {
            this.data = data;
        }

        public Node(int data, Node next)
        {
            this.data = data;
            this.next = next;
        }
    }

    public Node head;
    public Node tail;

    int size;

    public Singly_07()
    {
        this.size = 0;
    }

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

        size++;
    }

    public void Modify (Node head)
    {
        System.out.println("\nModifying linked list... ");

        Node e_head = null;
        Node e_tail = null;
        Node o_head = null;
        Node o_tail = null;

        Node temp = head;

        if (head == null || head.next == null)
        {
            System.out.println("There is no linked list.");
        }

        else
        {
            while (temp != null)
            {
                if (temp.data % 2 == 0)
                {
                    if (e_head == null)
                    {
                        e_head = temp;
                        e_tail = temp;
                    }

                    else
                    {
                        e_tail.next = temp;
                        e_tail = temp;
                    }
                }

                else
                {
                    if (o_head == null)
                    {
                        o_head = temp;
                        o_tail = temp;
                    }

                    else
                    {
                        o_tail.next = temp;
                        o_tail = temp;
                    }
                }

                temp = temp.next;
            }
        }

        if (e_tail != null)
        {
            e_tail.next = null;
        }

        if(o_tail != null)
        {
            o_tail.next = null;
        }

        e_tail.next = o_head;

        System.out.println();
        print(e_head);
    }

    public void print(Node head)
    {
        Node temp = head;

        System.out.println("Printing linked list: ");

        while (temp != null)
        {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.print("NULL");
        System.out.println("\n\nSize of linked list: " + size);
    }
}