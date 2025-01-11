//Hafsa Salman
//22K-5161
//Task no. 05

public class Task_05
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("Roll no. 22K-5161");
        System.out.println("Task no. 05");
        System.out.println();

        int[] array = {3, 6, 8, 98, 56, 23};

        Sorting s = new Sorting();

        int[] a = s.sort(array, 6);

        System.out.println("Ascending Order: ");
        s.display(a, 6);
        System.out.println();

        String[] arr = {"a", "2", "r"};

        String[] b = s.sort(arr, 3);

        System.out.println("Ascending Order: ");
        s.display(b, 3);
        System.out.println();

        int[] abc = {1, 6, 7, 4, 9};

        System.out.println("Sorting the array depending on boolean parameter: ");

        System.out.println("Ascending Order: ");
        int[] ab = s.sort(array, 5, true);
        s.display(ab, 5);
        System.out.println();

        System.out.println("Descending Order: ");
        int[] abcd = s.sort(array, 5, false);
        s.display(abcd, 5);
        System.out.println();

        String[] xyz = {"abc", "123", "wheee"};

        System.out.println("Sorting the array depending on boolean parameter: ");

        System.out.println("Ascending Order: ");
        String[] g = s.sort(xyz, 3, true);
        s.display(g, 3);
        System.out.println();

        System.out.println("Descending Order: ");
        String[] h = s.sort(xyz, 3, false);
        s.display(h, 3);
        System.out.println();
    }
}

class Sorting
{
    public int[] sort(int[] array, int n)
    {
        int a;

        for (int i=0; i<n; i++)
        {
            for (int j=i+1; j<n; j++)
            {
                if (array[i] > array[j])
                {
                    a = array[i];
                    array[i] = array[j];
                    array[j] = a;
                }
            }
        }

        return array;
    }

    public void display(int array[], int n)
    {
        System.out.println();

        for (int i=0; i<n; i++)
        {
            System.out.println(array[i] + ", ");
        }
    }

    public String[] sort(String[] array, int n)
    {
        String a;

        for (int i=0; i<n; i++)
        {
            for (int j=i+1; j<n; j++)
            {
                if (array[i].compareTo(array[j]) > 0)
                {
                    a = array[i];
                    array[i] = array[j];
                    array[j] = a;
                }
            }
        }

        return array;
    }

    public void display (String array[], int n)
    {
        System.out.println();

        for (int i=0; i<n; i++)
        {
            System.out.println(array[i] + ", ");
        }
    }

    public int[] sort(int[] array, int n, boolean b)
    {
        if (b)
        {
            int a;

            for (int i=0; i<n; i++)
            {
                for (int j=i+1; j<n; j++)
                {
                    if (array[i] > array[j])
                    {
                        a = array[i];
                        array[i] = array[j];
                        array[j] = a;
                    }
                }

                return array;
            }
        }

        else
        {
            int a;

            for (int i=0; i<n; i++)
            {
                for (int j=i+1; j<n; j++)
                {
                    if (array[i] < array[j])
                    {
                        a = array[i];
                        array[i] = array[j];
                        array[j] = a;
                    }
                }
            }
        }

        return array;
    }

    public String[] sort(String[] array, int n, boolean c)
    {
        if (c)
        {
            String a;

            for (int i=0; i<n; i++)
            {
                for (int j=i+1; j<n; j++)
                {
                    if (array[i].compareTo(array[j])<0)
                    {
                        a = array[i];
                        array[i] = array[j];
                        array[j] = a;
                    }
                }
            }

            return array;
        }

        else
        {
            String a;

            for (int i=0; i<n; i++)
            {
                for (int j=i+1; j<n; j++)
                {
                    if (array[i].compareTo(array[j])<0)
                    {
                        a = array[i];
                        array[i] = array[j];
                        array[j] = a;
                    }
                }
            }
        }

        return array;
    }
}