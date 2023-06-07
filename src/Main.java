import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws Exception {
        /*
        1-Задание.
        Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
        и возвращает введенное значение. Ввод текста вместо числа не должно приводить
        к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
        */
        //float number = Task1.getFloatNumber();
        //System.out.println("Результат:"+number);

        System.out.println("==========================================================");

        /*

        2-Задание.

        public static void main(String[] args) {
        try {
            int d = 0;
            int[] intArray = new int[]{1,2,3,4,5,6,7,8,9};// здесь я создал массив из 9 элементов
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

    }
        */

        System.out.println("=============================================");
        /*
        3-Задание
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
        это catch лишные после throwable, потому что throwable, это корневой узел для exception и error
        catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        }

    }

    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
        System.out.println(a + b);
    }
    */


        System.out.println("===============================================");

        Task4.EnterToString();
    }
}