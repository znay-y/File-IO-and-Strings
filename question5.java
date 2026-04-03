import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

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
        String[] parts = input.split(",");

        if (parts.length == 3) {
            //System.out.println("Name found: " + parts[0]);
            //System.out.println("E-mail found: " + parts[1]);
            //System.out.println("Age found: " + parts[2]);

            boolean isEmailValid = emailCheck(parts[1]);
            boolean isAgeValid = AgeCheck(parts[2]);

            if (isAgeValid==true&&isEmailValid==true){
                return true;
            }
        } else {
            //System.out.println("Input does NOT fit the format");
        }
        return false;

    }

    static boolean emailCheck(String email) {
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        if (email.matches(regex)) {
            return true;
        } else {
            return false;
        }
    }

    static boolean AgeCheck(String text) {
        boolean valid = false;
        String regex = "^[0-9]";
        String[] letters = text.split("");

        for (int i = 0; i < letters.length; i++) {
            if (letters[i].matches(regex)) {

            } else {
                return false;
            }

        }
        return true;
    }

    static String printLine(String input) {
        String[] parts = input.split(",");

        String name = parts[0];
        String email = parts[1];
        String age = parts[2];


        return (name + " ("+age+") - "+email);
    }

}
