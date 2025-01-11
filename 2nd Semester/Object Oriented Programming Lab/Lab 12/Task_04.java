//Hafsa Salman
//22K-5161
//Task no. 04

public class Task_04
{
    public static <T extends Comparable <T>> T findMaximum(T[] array)
    {
        T maximum = array[0];

        for (int i=0; i< array.length; i++)
        {
            if (array[i].compareTo(maximum) > 0)
            {
                maximum = array[i];
            }
        }

        System.out.println("Maximum number: " + maximum);

        return maximum;
    }

    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("Roll no. 22K-5161");
        System.out.println("Task no. 04");
        System.out.println();

        Integer[] array = {59, 32, 68, 10, 5};

        findMaximum(array);
    }
}