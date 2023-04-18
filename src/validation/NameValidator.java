package validation;

public class NameValidator {
    public static boolean isValidName(String name) {
        if (name.length() < 2 || name.length() > 20) {
            return true;
        }

        return !name.matches("[a-zA-Z ]+");
    }
}
