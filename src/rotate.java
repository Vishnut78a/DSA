import java.lang.reflect.Array;
import java.util.Scanner;


public class rotate implements  Electric,Engine,Media{
   int left ;
   int right ;
   int invert;
   rotate(){}
   rotate(int left,int right,int invert){
       this.left=left;
       this.right=right;
       this.invert=invert;
   }
    public void main(String args[]) {
        Scanner sc = new Scanner(System.in);

    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void brake() {

    }

    @Override
    public void acc() {

    }
}
