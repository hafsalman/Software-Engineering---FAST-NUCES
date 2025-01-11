//Hafsa Salman
//22K-5161
//Task 05

public class Task_05
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("Roll no. 22K-5161");
        System.out.println("Task no. 05");
        System.out.print("\n");

        Tank tank_1 = new Tank();

        tank_1.capacity = 2;

        tank_1.fill();

        tank_1.empty();
        tank_1.empty();

        tank_1.finalize();

        Tank tank_2 = new Tank();

        tank_2 = null;

        System.gc();
    }
}

class Tank
{
    int capacity;

    void fill()
    {
        capacity++;
    }

    void empty()
    {
        capacity--;
    }

    protected void finalize()
    {
        if (capacity == 0)
        {
            System.out.println("Object Terminated!");
        }

        else
        {
            System.out.println("Current Capacity: " + capacity);
        }
    }
}