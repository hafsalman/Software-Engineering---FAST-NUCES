//Hafsa Salman
//22K-5161
//Task no. 04

import java.util.Scanner;

public class Task_04
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("Roll no. 22K-5161");
        System.out.println("Task no. 04");
        System.out.println();

        Scanner s = new Scanner(System.in);

        Order O = new Order(5);

        int data;

        System.out.println("Enter 5 orders: ");
        for (int i=0; i<5; i++)
        {
            System.out.print("Order " + (i+1) + ": ");
            data = s.nextInt();

            O.AddOrder(data);

            System.out.println();
        }

        O.Display();

        System.out.println();
        O.Skip();

        System.out.println();
        O.front();
    }
}

class Order
{
    int front, rear, size;
    int [] queue;

    public Order (int size)
    {
        this.front = -1;
        this.rear = -1;
        this.size = size;
        this.queue = new int [size];
    }

    public boolean isFull()
    {
        return (front == 0 && rear == (size - 1));
    }

    public boolean isEmpty()
    {
        return (front == -1);
    }

    public void AddOrder (int data)
    {
        if (isFull())
        {
            System.out.println("Queue is full!");

            return;
        }

        if (isEmpty())
        {
            front = 0;
        }

        rear++;
        queue[rear] = data;

        System.out.println("New Order Added!");
    }

    public void Skip ()
    {
        if (isEmpty())
        {
            System.out.println("Queue is empty!");

            return;
        }

        else
        {
            System.out.println("Skipping cancelled order: " + queue[front]);

            for (int i=0; i<rear; i++)
            {
                queue[i] = queue[i+1];
            }

            rear--;
        }
    }

    public void Display()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty!");

            return;
        }

        else
        {
            System.out.println("\nDisplaying Orders: ");
            for (int i=front; i<=rear; i++)
            {
                System.out.print(queue[i] + " <-- ");
            }

            System.out.println("END");
        }
    }

    public void front()
    {
        System.out.println("Now serving: " + queue[front]);
    }
}