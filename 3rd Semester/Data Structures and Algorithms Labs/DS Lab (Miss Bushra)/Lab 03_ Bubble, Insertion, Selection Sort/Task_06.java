//Hafsa Salman
//22K-5161
//Task 06

public class Task_06
{
    static void D_BubbleSort(int []scores, int size)
    {
        int temp;

        for (int i=0; i<size; i++)
        {
            for (int j=0; j<(size-1-i); j++)
            {
                if (scores[j] < scores[j+1])
                {
                    temp = scores[j];
                    scores[j] = scores[j+1];
                    scores[j+1] = temp;
                }
            }
        }

        System.out.println("Printing sorted array using bubble sort: ");
        for (int i=0; i<size; i++)
        {
            System.out.print(scores[i] + "\t");
        }
    }

    static void D_SelectionSort (int []scores, int size)
    {
        int temp;

        for (int i=0; i<(size-1); i++)
        {
            int max = i;

            for (int j=i+1; j<size; j++)
            {
                if (scores[j] > scores[max])
                {
                    max = j;
                }
            }

            temp = scores[max];
            scores[max] = scores[i];
            scores[i] = temp;
        }

        System.out.println("\n\nPrinting sorted array using selection sort: ");
        for (int i=0; i<size; i++)
        {
            System.out.print(scores[i] + "\t");
        }
    }

    static void D_InsertionSort(int []scores, int size)
    {
        int temp;

        for (int i=0; i<size; i++)
        {
            for (int j=i; j>0; j--)
            {
                if (scores[j] > scores[j-1])
                {
                    temp = scores[j];
                    scores[j] = scores[j-1];
                    scores[j-1] = temp;
                }

                else
                {
                    break;
                }
            }
        }

        int max = scores[size-1];
        int mid = (size-1)/2;

        for (int i=size-1; i>mid; i--)
        {
            if (scores[i] > scores[i-1])
            {
                temp = scores[i];
                scores[i] = scores[i-1];
                scores[i-1] = temp;
            }
        }

        System.out.println("\n\nPrinting sorted array using insertion sort: ");
        for (int i=0; i<size; i++)
        {
            System.out.print(scores[i] + "\t");
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("Roll no. 22K-5161");
        System.out.println("Task no. 06");
        System.out.println();

        int []scores = {197, 98, 101, 189, 90, 202};

        int size;

        size = scores.length;

        D_BubbleSort(scores, size);
        D_SelectionSort(scores, size);
        D_InsertionSort(scores, size);
    }
}
