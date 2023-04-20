package validation;

public class PhoneNumberValidator {
    public static boolean isValidPhoneNumber(String phoneNumber) {
        if (!phoneNumber.matches("[0-9+\\-()]+")) {
            return false;
        }

        return phoneNumber.length() >= 10 && phoneNumber.length() <= 15;
    }
}
