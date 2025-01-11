import java.util.Scanner;
import java.util.spi.AbstractResourceBundleProvider;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n= sc.nextInt();
        String[] array=new String[n];
        for (int i=0;i<n;i++){
            System.out.print("Element-"+i+": ");
            array[i]=sc.next();

        }
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j].compareToIgnoreCase(array[min])>1) {
                    min = j;
                }

                String temp = array[min];
                array[min] = array[i];
                array[i] = temp;
            }
        }
        System.out.println("Four minimum Elements are: ");
        for (int i=0;i<n;i++){
            System.out.println(array[i]);
        }

    }
}
