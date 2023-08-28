package DSA;

import java.util.HashSet;

public class DSA {

    public static void main(String[] args) {
        int array[] = {1,0,1,1,1,0,1,1,1,1,0,0,0,0,1,1,1,1,1,1,0,0,1,1,1};
        int result = maxConsicutiveOne(array);
        System.out.print(result);


    }
    static int maxConsicutiveOne(int array[]){
        int iterator=0;
        int consicutivechecker=0;

        for(int i=0;i<array.length;i++){
            if(array[i]==1){
                iterator++;


            }
            else{
                    if(iterator>consicutivechecker) {
                         consicutivechecker=iterator;
                         iterator=0;
                       }
                }

            if(i==array.length-1){
                if(iterator>consicutivechecker){
                    consicutivechecker=iterator;

                }            }
        }


        return consicutivechecker;
    }
}
