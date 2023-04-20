package validation;

public class NameValidator {
    public static boolean isValidName(String name) {
        if (name.length() < 2 || name.length() > 20) {
            return false;
        }

        return name.matches("[a-zA-Zа-яА-Я]+(\\s+[a-zA-Zа-яА-Я]+)*");
    }
}
