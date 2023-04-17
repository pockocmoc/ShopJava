package validation;

public class PasswordValidator {
    public boolean isValidPassword(String password) {
        // Проверка длины пароля
        if (password.length() < 8 || password.length() > 20) {
            return false;
        }

        // Проверка наличия хотя бы одной буквы в верхнем регистре
        if (!password.matches(".*[A-Z].*")) {
            return false;
        }

        // Проверка наличия хотя бы одной буквы в нижнем регистре
        if (!password.matches(".*[a-z].*")) {
            return false;
        }

        // Проверка наличия хотя бы одной цифры
        if (!password.matches(".*[0-9].*")) {
            return false;
        }

        return true;
    }
}
