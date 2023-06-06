import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Task1.divided(1,0);
        //Task1.getArrayElement(new int[]{1,2,3,4,5,6,}, 7);
        /*System.out.println("===========================================================");
        int[] result = Task2.createNewArray(new int[]{1,2,3,4,5,6}, new int[]{0,9,8,7,6,5});
        for(int i=0;i<result.length;i++){
            System.out.printf(result[i]+", ");
        }*/
        System.out.println("===========================================================");
        double[] results = Task3.createNewArray(new int[]{1,2,3,4,5,6}, new int[]{1,9,8,7,6,5});
        for(int i=0;i<results.length;i++){
            System.out.printf(results[i]+", ");
        }
    }
}