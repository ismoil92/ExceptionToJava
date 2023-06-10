import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Введите 1-Имя, 2-Фамилия, 3-Отчество, 4-Номер телефона");
        String[] arrays = null;
        do{
            arrays = WriteFileClass.CheckedToInputText();
            if(arrays == null)
                System.out.println("Вы ввели неверный, повторите попытку");
        }while (arrays== null);
        String result = WriteFileClass.ParserData(arrays);
        WriteFileClass.WriteTextToFile(result, arrays);
        System.out.println("It's OK");
    }
}