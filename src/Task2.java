public class Task2 {
    public static int[] createNewArray(int[] a, int[] b){
        int[] array;
        if(a.length != b.length)
            throw new RuntimeException("length is not");
        else {
             array = new int[a.length];
            for(int i=0;i<array.length;i++){
                array[i] = a[i]-b[i];
            }
        }
        return array;
    }
}
