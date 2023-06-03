import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.*;




public class Main {

    public static  void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {7 ,8 ,8 ,1 ,4 ,3};
        second_largest_element(arr);





}
public static void second_largest_element(int arr[]){
        int largest=arr[0];
        int second_largest=arr[1];
        int smallest= arr[0];
        int second_smallest = arr[1];
        if(largest<second_largest){
            int temp=largest;
            largest=second_largest;
            second_largest=temp;

        }
        if(smallest>second_smallest){
            int temp = smallest;
            smallest=second_smallest;
            second_largest=temp;
        }
        int temps;
        for(int i =0;i<arr.length;i++){
            if(arr[i]>largest){
                temps=largest;
                largest=arr[i];
                second_largest=temps;

            }else if (largest>arr[i] && arr[i]>second_largest) {
                second_largest=arr[i];


            }
            if(arr[i]<smallest){
                temps=smallest;
                smallest=arr[i];
                second_smallest=smallest;
            }else if(arr[i]>smallest && arr[i]<second_smallest){
                second_smallest=arr[i];
            }
            System.out.println(i+": largest ="+largest+"\n"+i+": secondlargest = "+second_largest+"\n"+smallest+"\n"+second_smallest);
        }
        System.out.print("The largest element in the given array is :"+largest+"\n"+
                "The second largest element in the given array is: "+second_largest+"\n"+
                "The smallest element in the given array is :"+smallest+"\n"+
                "The second smallest element in the given array is :"+second_smallest);


    }

public static void insertion_sort(int arr[]){
        int temp=0;
        for(int i =0;i< arr.length-1;i++){
            for(int j=i;i>=0;i--){
                if(arr[j]>arr[j+1]){

                }
            }
        }
}
public static void bubble_sort(int arr[]){
    for (int i: arr) {
        System.out.print(i+" ");}

        int temp=0;
        for(int i = 0 ;i < arr.length-1;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                   temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
                }
            }

        }
    for (int i: arr) {
        System.out.print(i+" ");
    }
}
 public static void selection_sort(int arr[]){
     for (int i:arr) {
         System.out.print(i+" ");
     }
        int min_index;
        int temp=0;
        for(int i=0;i<arr.length-1;i++){
            min_index=i;
            for(int j =i;j<arr.length;j++){
                if(arr[j]<arr[min_index]){

                    min_index=j;

                }
            }
            temp=arr[i];
            arr[i]=arr[min_index];
            arr[min_index]=temp;


        }
     for (int i : arr) {
         System.out.print(i+" ");
     }
 }

}

