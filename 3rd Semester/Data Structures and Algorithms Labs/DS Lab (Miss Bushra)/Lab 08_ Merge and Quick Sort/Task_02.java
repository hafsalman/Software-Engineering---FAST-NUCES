//Hafsa Salman
//22K-5161
//Task no. 02

public class Task_02
{
    public static void Display (int [] array, int size)
    {
        for (int i=0; i<size; i++)
        {
            System.out.print(array[i] + "\t");
        }
    }

    public static void QuickSort (int []array, int left, int right)
    {
        if (left >= right)
        {
            return;
        }

        int start, end, mid;

        start = left;
        end = right;

        mid = start + (end - start)/2;

        int pivot;

        pivot = array[mid];

        while (start <= end)
        {
            while (array[start] > pivot)
            {
                start++;
            }

            while (array[end] < pivot)
            {
                end--;
            }

            if (start <= end)
            {
                int temp;

                temp = array[start];
                array[start]  = array[end];
                array[end] = temp;

                start++;
                end--;
            }
        }

        QuickSort(array, left, end);
        QuickSort(array, start, right);
    }

    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("Roll no. 22K-5161");
        System.out.println("Task no. 02");
        System.out.println();

       int [] array = {7, 2, 1, 6, 8, 5, 3, 4};

        System.out.println("Printing Array: ");
        Display(array, array.length);

        QuickSort(array, 0, array.length-1);

        System.out.println("\n\nPrinting Sorted Array: ");
        Display(array, array.length);
    }
}