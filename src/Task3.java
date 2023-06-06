public class Task3 {
    public static double[] createNewArray(int[] a, int[] b){
        double[] array;
        if(a.length != b.length)
            throw new RuntimeException("length is not");
        else {
            array = new double[a.length];
            for(int i=0;i<array.length;i++){
                if(b[i]!=0){
                    array[i] = (double)a[i]/(double)b[i];
                }
                else
                    throw new ArithmeticException("divided is not zero");
            }
        }
        return array;
    }
}
