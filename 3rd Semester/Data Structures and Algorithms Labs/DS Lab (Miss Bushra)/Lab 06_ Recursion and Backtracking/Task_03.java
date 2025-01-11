//Hafsa Salman
//22K-5161
//Task no. 03

public class Task_03
{
    public static int Addition (int n, int sum)
    {
        sum = sum + n;

        if (n == 0)
        {
            return sum;
        }

        else
        {
            return Addition((n-1), sum);
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("Roll no. 22K-5161");
        System.out.println("Task no. 03");
        System.out.println();

        System.out.println("Printing the sum of first 30 natural numbers: ");

        int sum = 0;

        sum = Addition (30, sum);

        System.out.println("Sum: " + sum);
    }
}