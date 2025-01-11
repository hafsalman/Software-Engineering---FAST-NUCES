//Hafsa Salman
//22K-5161
//Task no. 07

import java.util.Scanner;

public class Task_07
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("Roll no. 22K-5161");
        System.out.println("Task no. 07");
        System.out.println();

        Scanner s = new Scanner(System.in);

        Customer C = new Customer(5);

        String data;

        System.out.println("Enter 5 orders: ");
        for (int i=0; i<5; i++)
        {
            System.out.print("Order " + (i+1) + ": ");
            data = s.nextLine();

            C.Enqueue(data);

            System.out.println();
        }

        C.Display();

        System.out.println();
        C.Dequeue();

        System.out.println();
        C.Display();

        System.out.println();
        C.front();
    }
}

class Customer {
    int front, rear, size;
    String[] queue;

    public Customer(int size) {
        this.front = -1;
        this.rear = -1;
        this.size = size;
        this.queue = new String[size];
    }

    public boolean isFull() {
        return (front == 0 && rear == (size - 1));
    }

    public boolean isEmpty() {
        return (front == -1);
    }

    public void Enqueue(String data) {
        if (isFull()) {
            System.out.println("Queue is full!");

            return;
        }

        if (isEmpty()) {
            front = 0;
        }

        rear++;
        queue[rear] = data;

        System.out.println("New Customer Added!");
    }

    public void Dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");

            return;
        } else {
            System.out.println("Customer Served: " + queue[front]);

            for (int i = 0; i < rear; i++) {
                queue[i] = queue[i + 1];
            }

            rear--;
        }
    }

    public void Display() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");

            return;
        } else {
            System.out.println("\nDisplaying Orders: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " <-- ");
            }

            System.out.println("END");
        }
    }

    public void front() {
        System.out.println("Now serving: " + queue[front]);
    }
}