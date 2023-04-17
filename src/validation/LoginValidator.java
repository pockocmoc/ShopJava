package validation;

public class LoginValidator {
    public boolean isValidLogin(String login) {
        // Проверка длины логина
        if (login.length() < 6 || login.length() > 20) {
            return false;
        }

        // Проверка наличия только букв и цифр в логине
        if (!login.matches("^[a-zA-Z0-9]+$")) {
            return false;
        }

        // Другие проверки (например, наличие запрещенных символов)

        return true;
    }
}
