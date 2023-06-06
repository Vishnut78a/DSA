import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.*;




public class Main {

    public static  void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,3};
        Missing_element(arr);

    }
   public static void Missing_element(int arr[]){
        int array[] = new int[arr[arr.length-1]+1];
        for(int i = 0;i<arr.length;i++){
            array[arr[i]]++;
        }
        System.out.print("The missing element are: ");
        for(int i = 0;i< array.length;i++){
            if(i!=0 && array[i]==0){
                System.out.print(i+" ");
            }
        }
        }
   }


