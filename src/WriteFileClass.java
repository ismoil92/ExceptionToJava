import java.io.FileWriter;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.util.Scanner;

public class WriteFileClass {
        public static String[] CheckedToInputText() throws ParseException {

            Scanner scanner = new Scanner(System.in);
            System.out.printf("Enter to text:");
            String input = scanner.nextLine();
            String[] result =input.split(" ");
            Integer numb;
            try {
                numb = Integer.parseInt(result[3]);
            }
            catch (Exception e){
                throw new ParseException("Not parser", -1);
            }
            if((result.length==4) && (numb instanceof Integer))
            {
                return result;
            }
            else
                return null;
        }

        public static String ParserData(String[] input) throws Exception {
            String text="";
            try {
                text = "<" + input[0] + "> ";
                text += "<" + input[1] + "> ";
                text += "<" + input[2] + "> ";
                text += "<" + Integer.parseInt(input[3]) + ">\n";
            }
            catch (Exception e){
                throw new Exception("Incorrect parser data");
            }
            return text;
        }

        public static void WriteTextToFile(String input, String[] array){
            try(FileWriter fileWriter = new FileWriter(array[1]+".txt", true)){
                fileWriter.write(input);
                fileWriter.flush();
            }
            catch (Exception ex){

            }
        }


    }
