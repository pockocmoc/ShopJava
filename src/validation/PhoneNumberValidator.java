package validation;

public class PhoneNumberValidator {
    public boolean isValidPhoneNumber(String phoneNumber) {
        if (!phoneNumber.matches("[0-9+\\-()]+")) {
            return false;
        }

        if (phoneNumber.length() < 10 || phoneNumber.length() > 15) {
            return false;
        }

        return true;
    }
}
