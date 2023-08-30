package DSA;

import java.util.HashMap;
import java.util.HashSet;

public class DSA {

    public static void main(String[] args) {
        int[] arr = {2,2,1};
        DSA dsa = new DSA();
        System.out.println(dsa.frequencyChecker(arr));
    }
    public int  frequencyChecker(int[] arr){
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i = 0;i<arr.length;i++){

            if(hashMap.containsKey(arr[i])){
                hashMap.replace(arr[i],hashMap.get(arr[i])+1);
            }else{
                hashMap.put(arr[i], 1);
            }

        }
        System.out.println(hashMap);
        int AppearsOnce=0;


        for(int i=0;i< arr.length;i++){
            if(hashMap.get(arr[i])==1){
                AppearsOnce = arr[i];

                break;

            }

        }

        return AppearsOnce;
    }
}
