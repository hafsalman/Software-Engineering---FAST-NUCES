import java.util.Arrays;

public class Task4{
    public static void main(String[] args) {
        String[] array={"Ahmed", "Ali", "Basit","Karim","Rizwan", "Sarwar","Tariq","Taufiq","Yasin", "Zulfiqar"};
        Arrays.sort(array);

        System.out.println("USING LINEAR SEARCH: ");
        String Name1="Aftab";
        String Name2="Rizwan";
        String Name3="Tariq";
        System.out.println("\nName: "+Name1);
        Linear(array, Name1);
        System.out.println("\nName: "+Name2);
        Linear(array, Name2);
        System.out.println("\nName: "+Name3);
        Linear(array, Name3);
        System.out.println("----------------------------------------");
        System.out.println("USING BINARY SEARCH: ");
        System.out.println("\nName: "+Name1);
        Binary(array, Name1);
        System.out.println("\nName: "+Name2);
        Binary(array, Name2);
        System.out.println("\nName: "+Name3);
        Binary(array, Name3);
    }
    static int Linear(String[] array, String x){
        int steps =0;
        for (int i=0;i<array.length;i++){
            steps++;
            if (array[i].equals(x)){
                System.out.println("Name FOUND!\nFound at index: "+i+"\nTotal steps taken: "+steps);
                return i;
            }
        }
        System.out.println("Not Found");
        return -1;
    }
    static int Binary(String[] array, String x){
        int steps=0;
        int start=0, end=array.length-1;
        while (start<=end){
            steps++;
            int mid = start+(end-start)/2;
            if (array[mid].equals(x)){
                System.out.println("Name FOUND!\nFound at index: "+mid+"\nTotal steps taken: "+steps);
                return mid;
            }
            if (x.compareTo(array[mid])>0){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        System.out.println("Not Found");
        return -1;
    }
}