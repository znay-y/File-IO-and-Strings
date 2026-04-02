import java.util.ArrayList;

public class question4 {
    public static void main(String[] args) {
        System.out.println(extractNumbers("12345")); // true
        System.out.println(extractNumbers("rhfe342urfhe")); // false
        System.out.println(extractNumbers("fur234fhre435")); // false
        System.out.println(extractNumbers("e3few989")); // false
        System.out.println(extractNumbers("54321")); // true

    }

    static ArrayList<String> extractNumbers(String text) {
        ArrayList<String> Aaray = new ArrayList<String>();
        String regex = "^[0-9]";
        String[] letters = text.split("");

        for (int i = 0; i < letters.length; i++) {
            if (letters[i].matches(regex)) {
                Aaray.add(letters[i]);
            }
        }
        return Aaray;
    }
}
