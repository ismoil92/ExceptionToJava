import java.util.Scanner;

public class Task1 {
    public static float getFloatNumber(){
        System.out.printf("Введите число:");
        Scanner scanner = new Scanner(System.in);
        boolean istrue;
        float number=0;
        do{
             istrue = scanner.hasNextFloat();
            if(istrue){
                 number = scanner.nextFloat();
            }
            else {
                System.out.printf("Повторите ввод:");
                scanner = new Scanner(System.in);
            }

        }while (!istrue);
        return number;
    }
}
