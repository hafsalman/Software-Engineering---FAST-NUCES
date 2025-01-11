//Hafsa Salman
//22K-5161
//Task 03

public class Task_03
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("Roll no. 22K-5161");
        System.out.println("Task no. 03");
        System.out.print("\n");

        Holiday obj_1 = new Holiday("Independence Day", 14, "August");
        Holiday obj_2 = new Holiday("Iqbal Day", 9, "November");
        Holiday obj_3 = new Holiday();

        System.out.println("Are they the same month? " + obj_3.InSameMonth(obj_1, obj_2));
    }
}

class Holiday
{
    String name;
    int Day;
    String month;

    public Holiday (String name, int day, String month)
    {
        this.name = name;
        Day = day;
        this.month = month;
    }

    public Holiday()
    {

    }

    public boolean InSameMonth (Holiday obj_1, Holiday obj_2)
    {
        if (obj_1.month.equals(obj_2.month))
        {
            return true;
        }

        else
        {
            return false;
        }
    }
}