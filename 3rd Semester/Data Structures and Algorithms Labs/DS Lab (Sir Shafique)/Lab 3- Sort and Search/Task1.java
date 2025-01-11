import java.util.Scanner;
import java.util.spi.AbstractResourceBundleProvider;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 10 elements: ");
        int[] array=new int[10];
        for (int i=0;i<10;i++){
            System.out.print("Element-"+i+": ");
            array[i]=sc.nextInt();

        }
        for (int i = 0; i < 10 - 1; i++) {
            int min = i;
            for (int j = i + 1; j < 10; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }

                int temp = array[min];
                array[min] = array[i];
                array[i] = temp;
            }
        }
        System.out.println("Four minimum Elements are: ");
        for (int i=0;i<4;i++){
            System.out.println(array[i]);
        }

    }
}
