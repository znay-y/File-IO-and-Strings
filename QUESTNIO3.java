public class QUESTNIO3 {
    public static void main(String[] args) {
        String[] testEmails = {
                "alice.smith@gmail.com", // valid
                "bob@yahoo.com", // valid
                "charlie123@outlook.com", // valid
                "david.jones@icloud.com", // valid

                "noatsymbol.com", // invalid
                "missingdomain@", // invalid
                "@nousername.com", // invalid
                "wrong@domain", // invalid (no .com etc)
                "bad@.com", // invalid
                "bad@gmail.", // invalid
                "two@@gmail.com", // invalid

                "almost.valid@mail.co", // valid
                "name+tag@gmail.com", // valid (if your regex supports +)
                "name_surname@mail.net", // valid
                "name surname@gmail.com" // invalid (space)
        };

        for (String email : testEmails) {
            System.out.println(email + " -> " + isValidEmail(email));
        }
    }

    static boolean isValidEmail(String email) {
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        if (email.matches(regex)) {
            return true;
        } else {
            return false;
        }
    }
}
