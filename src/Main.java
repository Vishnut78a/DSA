import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.*;




public class Main {

    public static  void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};
         Move_zeros_to_the_end(arr);

    }
   public static void  move_zeros_to_the_end(int array[]){
        System.out.print("Array before shifting: ");
        for(int i:array){System.out.print(i+" ");}
        System.out.println();
        int var =array.length;
        int zeros;
        if(array[var-1]==0){
            zeros=1;
            int temp;
            for(int i =var-1;i>=0;i--){
                if(array[i]==0){
                    for(int j=i;j<var-zeros-1;j++){
                        temp=array[j];
                        array[j]=array[j+1];
                        array[j+1]=temp;
                    }
                }
                zeros++;
            }
        }else
        {
            zeros=0;
            int temp;
            for(int i=var-1;i>=0;i--){
                if(array[i]==0){
                    for(int j=i;j<var-zeros-1;j++){
                        temp=array[j];
                        array[j]=array[j+1];
                        array[j+1]=temp;
                    }
                }
                zeros++;
            }
        }
        System.out.print("Array after shifting: ");
        for(int i : array){
            System.out.print(i+" ");
        }
   }

   public static void Move_zeros_to_the_end(int arr[]){

         System.out.print("Array before shifting: ");
         for(int i=0;i< arr.length;i++){
             System.out.print(arr[i]+" ");
         };
        int array[] = new int[arr.length];
       int index = 0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]!=0){

             array[index]=arr[i];
             index++;

            }
        }
        System.out.println();
        System.out.print("Array after shifting: ");
        for(int i=0;i< array.length;i++){
            System.out.print(array[i]+" ");
        }
   }
}

