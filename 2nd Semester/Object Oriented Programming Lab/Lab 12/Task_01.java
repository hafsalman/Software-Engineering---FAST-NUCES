//Hafsa Salman
//22K-5161
//Task no. 01

import java.util.ArrayList;
import java.util.Collections;

public class Task_01<T>
{
    private ArrayList<T> list;

    public Task_01()
    {
        this.list = new ArrayList<>();
    }

    public boolean isEmpty()
    {
        return list.isEmpty();
    }

    public void enqueue(T element)
    {
        list.add(element);
    }

    public T dequeue()
    {
        if (isEmpty())
        {
            return null;
        }

        return list.remove(0);
    }

    public T front()
    {
        if (isEmpty())
        {
            return null;
        }

        return list.get(0);
    }

    public int size()
    {
        return list.size();
    }

    public void Print()
    {
        for (T element : list)
        {
            System.out.println(element);
        }
    }

    public void MaxElements()
    {
        if (size() < 2)
        {
            System.out.println("Not enough elements to find 2 maximum numbers.");
        }

        ArrayList<Integer> integerData = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();

        for (T element : list)
        {
            if (element instanceof Integer)
            {
                integerData.add((Integer) element);
            }
        }

        for (Integer num : integerData)
        {
            temp.add(num);
        }

        Collections.sort(temp, Collections.reverseOrder());

        System.out.println("Two maximum elements from the queue:");
        System.out.println(temp.get(0));
        System.out.println(temp.get(1));
    }

    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("Roll no. 22K-5161");
        System.out.println("Task no. 01");
        System.out.println();

        Task_01<Object> Queue = new Task_01<>();

        Queue.enqueue(19);
        Queue.enqueue(56);
        Queue.enqueue(5);

        System.out.println("Printing Queue:");
        Queue.Print();

        Queue.enqueue("Hafsa");
        Queue.enqueue("Salman");

        System.out.println("\nPrinitng Queue: ");
        Queue.Print();

        Queue.MaxElements();

        System.out.println("\nSize of queue: " + Queue.size());
    }
}