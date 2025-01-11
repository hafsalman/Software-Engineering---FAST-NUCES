//Hafsa Salman
//22K-5161
//Task no. 06

public class Task_06
{
    public static <T> T search (T[] array, T element)
    {
        for (int i=0; i<array.length; i++)
        {
            if (array[i] == element)
            {
                System.out.println("Element found: " + array[i]);

                return array[i];
            }
        }

        System.out.println("Element not found!");

        return null;
    }
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("Roll no. 22K-5161");
        System.out.println("Task no 06");
        System.out.println();

        String [] str = {"Apples", "Bananas", "Mangoes", "Grapes"};
        String [] num = {"5", "10", "15", "20", "25"};

        String fruit = "Grapes";
        System.out.println("Element: " + fruit);

        search(str, fruit);

        System.out.println();

        String number= "63";
        System.out.println("Element: " + number);

        search(num, number);
    }
}