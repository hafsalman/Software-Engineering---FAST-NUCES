//Hafsa Salman
//22K-5161
//Task no. 02

import java.util.Scanner;

public class Task_02
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("Roll no. 22K-5161");
        System.out.println("Task no. 02");
        System.out.println();

        Scanner s = new Scanner(System.in);

        int size;

        System.out.print("Enter size of the queue: ");
        size = s.nextInt();

        Queue q = new Queue(size);

        int data;

        System.out.println("\nEnqueue: ");
        for (int i=0; i<size;i++)
        {
            System.out.print("Element " + (i+1) + ": ");
            data = s.nextInt();

            q.Enqueue(data);

            System.out.println();
        }

        q.Display();

        System.out.println("\n\nDequeue-ing one element... ");
        q.Dequeue();

        q.Display();

        System.out.println("\n\nRetrieving front of the queue");

        q.Front();
    }
}

class Queue
{
    int front, rear, size;
    int [] queue;

    public Queue (int size)
    {
        this.front = -1;
        this.rear = -1;
        this.size = size;
        this.queue = new int [size];
    }

    public boolean isFull()
    {
        return (front == 0 && rear == size - 1);
    }

    public boolean isEmpty()
    {
        return front == -1;
    }

    public void Enqueue (int data)
    {
        if (isFull())
        {
            System.out.println("Queue is full!");
        }

        if (isEmpty())
        {
            front = 0;
        }

        rear++;
        queue[rear] = data;

        System.out.println("Inserted " + data);
    }

    public void Dequeue ()
    {
        if (isEmpty())
        {
            System.out.println("Queue is empty!");

            return;
        }

        else
        {
            System.out.println("Removed " + queue[front]);

            for (int i=0; i<rear; i++)
            {
                queue[i] = queue[i+1];
            }

            rear--;
        }
    }

    public void Display()
    {
        if (isEmpty())
        {
            System.out.println("Queue is empty!");
        }

        else
        {
            System.out.println("Printing Queue: ");
            for (int i=front; i<=rear; i++)
            {
                System.out.print(queue[i] + " <-- ");
            }

            System.out.println("END");
        }
    }

    public void Front()
    {
        System.out.println("Front element: " + queue[front]);
    }
}