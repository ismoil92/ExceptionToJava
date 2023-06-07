import java.util.Scanner;

public class Task4 {
    public static void EnterToString() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter to string:");
        String text = scanner.nextLine();
        if(text.isEmpty()){
            throw new Exception("String is empty");
        }
        else
            System.out.println(text);
    }
}
