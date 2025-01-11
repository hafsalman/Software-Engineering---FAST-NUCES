//Hafsa Salman
//22K-5161
//Task no. 09

public class Task_09
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("Roll no. 22K-5161");
        System.out.println("Task no. 09");
        System.out.println();

        doubly D = new doubly();

        D.Insert(20);
        D.Insert(10);
        D.Insert(40);
        D.Insert(35);
        D.Insert(30);

        D.Print();

        System.out.println("\nSorting linked list in the ascending order... ");

        D.Order();
        D.Print();
    }
}

class doubly
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

        System.out.println("\nPrinting linked list: ");
        System.out.print("NULL <=> ");

        while (temp != null)
        {
            System.out.print(temp.data + " <=> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }

    public void Order()
    {
        Node temp = head;

        int tempp;

        do
        {
            while (temp.next != null)
            {
                if (temp.data > temp.next.data)
                {
                    tempp = temp.data;
                    temp.data = temp.next.data;
                    temp.next.data = tempp;
                }

                temp = temp.next;
            }
        }
        while (temp.next != null);
    }

}