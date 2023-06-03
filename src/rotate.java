import java.lang.reflect.Array;
import java.util.Scanner;


public class rotate{

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = {n};
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        for(int i =0;i<n;i++){
         System.out.println(array[i]);
        }
        int s = 0;
        int e = array.length - 1;
        int temp=0;
        while (s < e) {
            temp= array[s];
            array[s]=array[e];
            array[e]=temp;
            s++;
            e--;
        }
        for(int i =0;i<n;i++){
            System.out.println(array);
        }
    }}
