package DSA;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.HashSet;

public class DSA {

    public static void main(String[] args) {
        int[] arr = {1,2,4,7,7,5};
        int i=Integer.MAX_VALUE;

        DSA dsa = new DSA();
        dsa.SecondSmallestAndLargest(arr);

    }

   public void SecondSmallestAndLargest(int[] arr){
        if(arr.length<4){
            System.out.println(-1);
        }
        else{
            int LARGEST=arr[0];
            int SMALLEST=arr[0];

            for(int i = 0;i<arr.length;i++){
                if(arr[i]>LARGEST){
                    LARGEST=arr[i];
                }
                else if(arr[i]<SMALLEST){
                    SMALLEST=arr[i];
                }
            }
            int SECOND_LARGEST=SMALLEST;
            int SECOND_SMALLEST=LARGEST;

            for(int i=0;i<arr.length;i++){
                if(arr[i]<LARGEST && arr[i]>SECOND_LARGEST){
                    SECOND_LARGEST=arr[i];
                }
                if(arr[i]>SMALLEST && arr[i]<SECOND_SMALLEST){
                    SECOND_SMALLEST=arr[i];
                }
            }
            HashMap<String,Integer> SecondLargestAndSmallest=new HashMap<>();
            SecondLargestAndSmallest.put("SecondLargest : ",SECOND_LARGEST);
            SecondLargestAndSmallest.put("SecondSmallest :",SECOND_SMALLEST);
            System.out.println(SecondLargestAndSmallest);

        }

   }

}
