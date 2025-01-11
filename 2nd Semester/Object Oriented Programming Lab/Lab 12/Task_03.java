//Hafsa Salman
//22K-5161
//Task no. 03

import java.util.ArrayList;
import java.util.Collections;

public class Task_03 <T>
{
    private ArrayList<T> list;

    public Task_03()
    {
        this.list = new ArrayList<>();
    }

    public boolean isEmpty()
    {
        return list.isEmpty();
    }

    public void Push(T element)
    {
        list.add(element);
    }

    public T Pop()
    {
        if (isEmpty())
        {
            return null;
        }

        return list.remove(list.size() - 1);
    }

    public T Peek()
    {
        if (isEmpty())
        {
            return null;
        }

        return list.get(list.size() - 1);
    }

    public ArrayList<Integer> AddAndSort()
    {
        ArrayList<Integer> integerData = new ArrayList<>();
        ArrayList<Integer> sortedIntegerArray = new ArrayList<>();

        for (int i = list.size() - 1; i >= 0; i--)
        {
            Object element = list.get(i);

            if (element instanceof Integer)
            {
                integerData.add((Integer) element);
            }
        }

        Collections.sort(integerData, Collections.reverseOrder());

        for (Integer num : integerData)
        {
            sortedIntegerArray.add(num);
        }

        return sortedIntegerArray;
    }

    public void display()
    {
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("Roll no. 22K-5161");
        System.out.println("Task no. 03");
        System.out.println();

        Task_03<Object> Stack = new Task_03<>();

        Stack.Push(5);
        Stack.Push(15);
        Stack.Push(10);

        System.out.println("Printing Stack: ");
        Stack.display();

        ArrayList<Integer> sortedIntegerArray = Stack.AddAndSort();
        System.out.println("Sorted Array: " + sortedIntegerArray);

        Stack.Push("Hafsa");
        Stack.Push("Salman");

        Stack.display();
    }
}