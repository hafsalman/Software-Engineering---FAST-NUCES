//Hafsa Salman
//22K-5161
//Task no. 06

public class Task_06
{
    public static void TowerOfHanoi(int n, char A, char B, char C)
    {
        if (n == 1)
        {
            System.out.println("Move disk from " + A + " to " + C);
        }

        else
        {
            TowerOfHanoi(n-1, A, C, B);

            System.out.println("Move disk from " + A + " to " + C);

            TowerOfHanoi(n-1, B, A, C);
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("Roll no. 22K-5161");
        System.out.println("Task no. 06");
        System.out.println();

        int n;

        n = 3;

        char A, B, C;

         A = 'A';
         B = 'B';
         C = 'C';

        System.out.println("Let 3 disks be A, B and C.");
        System.out.println();

        TowerOfHanoi(n, A, B, C);
    }
}