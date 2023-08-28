import java.lang.reflect.Array;

public class CustomArraylist {

    int array[]  = new int[20];


    private int lengthh = 0;
    private int index=0;
    private int helper_index=0;

    void add(int num){
        array[index]=num;
        this.index++;


    }

    void addAtIndex(int indeex,int number){
     int temp= array[indeex];
     for(int i = indeex;i<index;i++){
        temp=array[i+1];
        array[i+1]=array[i];

     }
     array[indeex]=number;
    }

    void addAll(int[] array){

    }

    void removeAtLast(){
        index--;
    }

    void removeAtIndex(int Index){
        for(int i = Index;i<index;i++){
            array[Index]=array[Index+1];
            Index++;
        }
        index--;
    }

    void removeAll(){
        index=0;
    }

    int length(){
        return this.index;
    }

}

class  testint{
    public static void main(String[] args) {
        CustomArraylist customArraylist = new CustomArraylist();
        System.out.println(customArraylist.length());
        customArraylist.add(3);
        customArraylist.add(6);
        customArraylist.add(7);
        System.out.println(customArraylist.length());

        customArraylist.removeAtLast();
        customArraylist.addAtIndex(1,19);

        System.out.println(customArraylist.length());
        for(int i:customArraylist.array ){
            System.out.println(i);
        }
    }
}