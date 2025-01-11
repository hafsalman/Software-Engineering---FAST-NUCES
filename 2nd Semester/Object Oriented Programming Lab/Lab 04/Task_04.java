//Hafsa Salman
//22K-5161
//Task 04

public class Task_04
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("Roll no. 22K-5161");
        System.out.println("Task no. 04");
        System.out.print("\n");

        holi holi_1 = new holi("Independence Day", 14, "August");
        holi holi_2 = new holi("Iqbal Day", 9, "November");
        holi holi_3 = new holi(holi_1);
        holi holi_4 = new holi();

        System.out.println("Are they the same month? " + holi_4.InSameMonth(holi_2, holi_3));
    }
}

class holi
{
    String name;
    int Day;
    String month;

    public holi(String name, int Day, String month)
    {
        this.name = name;
        this.Day = Day;
        this.month = month;
    }

    public holi (holi holi_1)
    {
        holi_1.name = name;
        holi_1.Day = Day;
        holi_1.month = month;
    }

    public holi()
    {

    }

    public boolean InSameMonth (holi holi_2, holi holi_3)
    {
        if (holi_2.month.equals(holi_3.month))
        {
            return true;
        }

        else
        {
            return false;
        }
    }
}