//Hafsa Salman
//22K-5161
//Task no. 08

public class Task_08
{
    public static void Sorting (int [] arr)
    {
        int temp;
        int com;

        com = 0;

        for (int i=0; i<(arr.length-1); i++)
        {
            int min = i;

            for (int j=i+1; j< arr.length; j++)
            {
                com++;

                if (arr[j] < arr[min])
                {
                    min = j;
                }
            }

            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

        System.out.println("\n\nNumber of comparisons: " + com);
    }

    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("Roll no. 22K-5161");
        System.out.println("Task no. 08");
        System.out.println();

        int []arr_01 = {67, 37, 30, 41, 12, 58, 32, 28, 87, 57, 1, 84, 6, 36, 76, 25, 8, 76, 55, 35, 10, 25, 4, 3, 57, 41, 91, 3, 45, 34, 59, 65, 71, 72, 32, 61, 41, 23, 89, 56, 84, 34, 91, 76, 73, 14, 38, 78, 11, 60};

        System.out.println("Printing an unsorted array with 50 elements: ");
        for (int i=0; i< arr_01.length; i++)
        {
            System.out.print(arr_01[i] + " ");
        }

        Sorting(arr_01);

        System.out.println("\nPrinting the sorted array with 50 elements: ");
        for (int i=0; i< arr_01.length; i++)
        {
            System.out.print(arr_01[i] + " ");
        }

        int []arr_02 = {20, 53, 28, 73, 62, 84, 45, 96, 43, 31, 37, 21, 59, 51, 48, 18, 84, 11, 99, 48, 63, 21, 42, 32, 57, 23, 95, 31, 74, 69, 58, 14, 19, 61, 83, 32, 44, 62, 53, 66, 65, 83, 22, 99, 89, 49, 45, 4, 9, 28, 39, 77, 30, 57, 88, 47, 27, 15, 92, 62, 99, 20, 31, 24, 79, 7, 74, 16, 84, 68, 65, 16, 83, 26, 13, 40, 98, 97, 44, 3, 56, 59, 56, 56, 69, 7, 96, 94, 28, 14, 46, 76, 38, 96, 26, 50, 99, 83, 86, 4};

        System.out.println("\n\nPrinting an unsorted array with 100 elements: ");
        for (int i=0; i< arr_02.length; i++)
        {
            System.out.print(arr_02[i] + " ");
        }

        Sorting(arr_02);

        System.out.println("\nPrinting the sorted array with 100 elements: ");
        for (int i=0; i< arr_02.length; i++)
        {
            System.out.print(arr_02[i] + " ");
        }
    }
}