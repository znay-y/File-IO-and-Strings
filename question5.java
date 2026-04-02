import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class question5 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                boolean valid = checkLine(line);
                if (valid == true) {
                    System.out.println(printLine(line));
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("The given file cannot be found");
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }

    static boolean checkLine(String input) {
    

        return true;
    }

    static String printLine(String input) {
return null;
    }

}
