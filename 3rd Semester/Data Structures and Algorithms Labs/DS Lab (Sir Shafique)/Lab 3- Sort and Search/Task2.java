import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int array[] = { 20, 12, 15, 2, 10, 1, 13, 9, 5};

        int n=array.length;
        for (int i=0;i<n;i++){
            for (int j=i;j>0;j--){
                if (array[j]<array[j-1]){
                    int temp=array[j];
                    array[j]=array[j-1];
                    array[j-1]=temp;
                }
                else{
                    break;
                }
            }
        }
        int max=array[n-1];
        int mid_index=(n-1)/2;
        for (int i=n-1;i>mid_index;i--){
            if (array[i]>array[i-1]){
                int temp=array[i];
                array[i]=array[i-1];
                array[i-1]=temp;

            }
        }
        System.out.println(Arrays.toString(array));

    }
}
