//Hafsa Salman
//22K-5161
//Question no. 08

import java.util.Scanner;

public class Task_08 {
    static void Sort(int[] array) {
        int temp;

        for (int i = 0; i < (array.length - 1); i++) {
            for (int j = 0; j < (array.length - i - 1); j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.println("\n\nPrinting sorted array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }

    static int BinarySearch(int[] array, int target) {
        int left, right, mid;

        left = 0;
        right = array.length - 1;

        while (left <= right) {
            mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    static int InterpolationSearch(int[] array, int target) {
        int start, end;
        int pos;

        start = 0;
        end = array.length - 1;

        while (start <= end && target >= array[start] && target <= array[end]) {
            pos = start + ((target - array[start]) * (end - start)) / (array[end] - array[start]);

            if (array[pos] == target) {
                return pos;
            }

            if (array[pos] < target) {
                start = pos + 1;
            } else {
                end = pos - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println("Name: Hafsa Salman");
        System.out.println("Roll no. 22K-5161");
        System.out.println("Task no. 06");
        System.out.println();

        Scanner s = new Scanner(System.in);

        int []array = {98, 11, 30, 15, 17, 63, 99, 38, 44, 6,
                97, 74, 86, 26, 22, 89, 78, 51, 70, 72,
                12, 69, 29, 20, 33, 58, 60, 59, 62, 14,
                1, 88, 43, 87, 25, 75, 13, 54, 39, 9,
                77, 67, 40, 8, 93, 71, 2, 36, 16, 84,
                68, 53, 34, 91, 82, 3, 65, 46, 5, 92,
                61, 95, 50, 19, 81, 32, 76, 56, 45, 100,
                28, 73, 23, 96, 52, 31, 83, 85, 4, 18,
                41, 64, 21, 37, 42, 94, 80, 10, 49, 24,
                27, 79, 57, 35, 66, 7, 48, 55, 90, 47};

        System.out.println("\nPrinting array: ");
        for (int i=0; i<array.length; i++)
        {
            System.out.print(array[i] + "\t");
        }

        Sort(array);

        int target;

        System.out.print("\n\nEnter number you want to search: ");
        target = s.nextInt();

        //Binary Search
        int b_index;

        b_index = BinarySearch(array, target);

        System.out.println("\n\nUsing Binary Search: ");
        if (b_index == -1)
        {
            System.out.println(target + " not found in the array.");
        }

        else
        {
            System.out.println(target + " is found on index " + b_index + ".");
        }

        //Interpolation Search
        int i_index;

        i_index = InterpolationSearch(array, target);

        System.out.println("\n\nUsing Interpolation Search: ");
        if (i_index == -1)
        {
            System.out.println(target + " not found in the array.");
        }

        else
        {
            System.out.println(target + " is found on index " + i_index + ".");
        }
    }
}