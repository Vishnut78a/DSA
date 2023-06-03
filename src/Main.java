import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.*;




public class Main {

    public static  void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1, 2, 3, 4, 5};
        int k=3;
        left_rotation_by_K(arr,k);
    }
    public static  void left_rotation_by_K(int arr[],int k){
        System.out.println("Array before rotating: ");
        for(int i : arr){
            System.out.print(i+" ");
        }
    int temp;
        for(int i =0;i<k;i++){
        for(int j=0;j< arr.length-1;j++){
            temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
        }
    }
        System.out.println();
        System.out.print("Array after rotating "+k+" times: ");
        for(int i:arr){
            System.out.print(i+" ");
        };
    }
}

