package validation;

public class NameValidator {
    public boolean isValidName(String name) {
        if (name.length() < 2 || name.length() > 20) {
            return false;
        }

        if (!name.matches("[a-zA-Z ]+")) {
            return false;
        }

        return true;
    }
}
