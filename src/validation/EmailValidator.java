package validation;

public class EmailValidator {
    public boolean isValidEmail(String email) {
        if (!email.contains("@")) {
            return false;
        }

        if (!email.substring(email.indexOf("@")).contains(".")) {
            return false;
        }

        if (email.length() < 6 || email.length() > 50) {
            return false;
        }

        return true;
    }
}
