//Hafsa Salman
//22K-5161
//Task no. 07

public class Task_07
{
    static void ModifiedBubbleSort (int []array)
    {
        int temp;
        boolean swap;

        for (int i=0; i< array.length; i++)
        {
            swap = false;

            for (int j=0; j<(array.length-i-1); j++)
            {
                if (array[j] > array[j+1])
                {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;

                    swap = true;
                }
            }

            if (!swap)
            {
                break;
            }
        }

        System.out.println("\n\nPrinting the sorted array using Modified Bubble Sort: ");
        for (int i=0; i< array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
    }

    static void SelectionSort (int []array)
    {
        int temp;

        for (int i=0; i<(array.length-1); i++)
        {
            int min = i;

            for (int j=i+1; j< array.length; j++)
            {
                if (array[j] < array[min])
                {
                    min = j;
                }
            }

            temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }

        System.out.println("\n\nPrinting the sorted array using Selection Sort: ");
        for (int i=0; i< array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("Roll no. 22K-5161");
        System.out.println("Task no. 07");
        System.out.println();

        int []array = {3, 89, 9056, 76, 45, 86, 109, 203, 87, 43, 23, 67};

        System.out.println("\nPrinting the unsorted array: ");
        for (int i=0; i< array.length; i++)
        {
            System.out.print(array[i] + " ");
        }

        ModifiedBubbleSort(array);
        SelectionSort(array);

        System.out.println("\n\nSelection sort is more better and efficient than modified bubble sort. \nIn bubble sort, every element is compared and then the positions are \nswapped if needed, otherwise they move to the next pair. Where as in \nselection sort, the smallest number is found and inserted in the sorted \npart of the array.");
    }
}