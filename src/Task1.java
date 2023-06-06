import java.io.File;
import java.io.FileNotFoundException;

public class Task1 {
    public static void divided(int a, int b){
        if(b!=0)
            System.out.println(a/b);
        else
            throw new ArithmeticException("Divided not zero!");
    }

    public static void getArrayElement(int[] array, int index)
    {
        if(array.length>index)
            System.out.println("Element:"+array[index]);
        else
            throw new IndexOutOfBoundsException("Index out if bound exception");
    }
}
