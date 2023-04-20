package controller;

import java.util.ArrayList;
import java.util.List;

import users.Buyer;
import validation.*;


public class RegistrationCSVHandler {
    static final String FILE_NAME_USERS = "./src/db/users.csv";
    static final String CSV_SEPARATOR = ",";
    static List<Buyer> buyers = new ArrayList<>();

    //    public static void addNewBuyer() {
//
//        boolean isValid = false;
//        while (!isValid) {
//            System.out.println("Введите фамилию: ");
//            String surname = ConsoleInputLine.readStringFromConsole();
//            isValid = NameValidator.isValidName(surname);
//            if (!isValid) {
//                System.out.println("""
//                        Некорректная фамилия.
//                        Фамилия должна иметь длину от 2 до 20 символов,\s
//                        и содержать только буквы и пробелы.""");
//                continue;
//            }
//
//            System.out.println("Введите имя: ");
//            String name = ConsoleInputLine.readStringFromConsole();
//            isValid = NameValidator.isValidName(name);
//            if (!isValid) {
//                System.out.println("""
//                        Некорректное имя.
//                        Имя должно иметь длину от 2 до 20 символов,\s
//                        и содержать только буквы и пробелы.""");
//                continue;
//            }
//
//            System.out.println("Введите отчество: ");
//            String patronymic = ConsoleInputLine.readStringFromConsole();
//            isValid = NameValidator.isValidName(patronymic);
//            if (!isValid) {
//                System.out.println("""
//                        Некорректное отчество.
//                        Отчество должно иметь длину от 2 до 20 символов,\s
//                        и содержать только буквы и пробелы.""");
//                continue;
//            }
//
//            System.out.println("Введите номер телефона: ");
//            String phoneNumber = ConsoleInputLine.readStringFromConsole();
//            isValid = PhoneNumberValidator.isValidPhoneNumber(phoneNumber);
//            if (!isValid) {
//                System.out.println("Некорректный номер телефона. Пожалуйста, введите корректный номер телефона.");
//                continue;
//            }
//
//            System.out.println("Введите адрес электронной почты: ");
//            String email = ConsoleInputLine.readStringFromConsole();
//            isValid = EmailValidator.isValidEmail(email);
//            if (!isValid) {
//                System.out.println("Некорректный адрес электронной почты. Пожалуйста, введите корректный адрес.");
//                continue;
//            }
//
//            System.out.println("Введите логин: ");
//            String login = ConsoleInputLine.readStringFromConsole();
//            isValid = LoginValidator.isValidLogin(login);
//            if (!isValid) {
//                System.out.println("Некорректный логин. Пожалуйста, введите корректный логин.");
//                continue;
//            }
//
//            System.out.println("Введите пароль: ");
//            String password = ConsoleInputLine.readStringFromConsole();
//            isValid = PasswordValidator.isValidPassword(password);
//            if (!isValid) {
//                System.out.println("Некорректный пароль. Пожалуйста, введите корректный пароль.");
//                continue;
//            }
//
//            buyers.add(new Buyer(1, 0, surname, name, patronymic,
//                    phoneNumber, email, login, password, 10_000.00));
//            CsvWriter.writeToBuyersFile(FILE_NAME_USERS, buyers);
//        }
//
//    }
    public static void addNewBuyer() {

        boolean isSurnameValid = false;
        boolean isNameValid = false;
        boolean isPatronymicValid = false;
        boolean isPhoneNumberValid = false;
        boolean isEmailValid = false;
        boolean isLoginValid = false;
        boolean isPasswordValid = false;

        String surname = "";
        String name = "";
        String patronymic = "";
        String phoneNumber = "";
        String email = "";
        String login = "";
        String password = "";

        while (true) {
            if (!isSurnameValid) {
                System.out.println("Введите фамилию: ");
                surname = ConsoleInputLine.readStringFromConsole();
                isSurnameValid = NameValidator.isValidName(surname);
                if (!isSurnameValid) {
                    System.out.println("""
                            Некорректная фамилия.
                            Фамилия должна иметь длину от 2 до 20 символов,
                            и содержать только буквы и пробелы.""");
                    continue;
                }
            }

            if (!isNameValid) {
                System.out.println("Введите имя: ");
                name = ConsoleInputLine.readStringFromConsole();
                isNameValid = NameValidator.isValidName(name);
                if (!isNameValid) {
                    System.out.println("""
                            Некорректное имя.
                            Имя должно иметь длину от 2 до 20 символов,
                            и содержать только буквы и пробелы.""");
                    continue;
                }
            }

            if (!isPatronymicValid) {
                System.out.println("Введите отчество: ");
                patronymic = ConsoleInputLine.readStringFromConsole();
                isPatronymicValid = NameValidator.isValidName(patronymic);
                if (!isPatronymicValid) {
                    System.out.println("""
                            Некорректное отчество.
                            Отчество должно иметь длину от 2 до 20 символов,
                            и содержать только буквы и пробелы.""");
                    continue;
                }
            }

            if (!isPhoneNumberValid) {
                System.out.println("Введите номер телефона: ");
                phoneNumber = ConsoleInputLine.readStringFromConsole();
                isPhoneNumberValid = PhoneNumberValidator.isValidPhoneNumber(phoneNumber);
                if (!isPhoneNumberValid) {
                    System.out.println("Некорректный номер телефона. Пожалуйста, введите корректный номер телефона.");
                    continue;
                }
            }

            if (!isEmailValid) {
                System.out.println("Введите адрес электронной почты: ");
                email = ConsoleInputLine.readStringFromConsole();
                isEmailValid = EmailValidator.isValidEmail(email);
                if (!isEmailValid) {
                    System.out.println("Некорректный адрес электронной почты. Пожалуйста, введите корректный адрес.");
                    continue;
                }
            }

            if (!isLoginValid) {
                System.out.println("Введите логин: ");
                login = ConsoleInputLine.readStringFromConsole();
                isLoginValid = LoginValidator.isValidLogin(login);
                if (!isLoginValid) {
                    System.out.println("Некорректный логин. Пожалуйста, введите корректный логин.");
                    continue;
                }
            }

            if (!isPasswordValid) {
                System.out.println("Введите пароль: ");
                password = ConsoleInputLine.readStringFromConsole();
                isPasswordValid = PasswordValidator.isValidPassword(password);
                if (!isPasswordValid) {
                    System.out.println("Некорректный пароль. Пожалуйста, введите корректный пароль.");
                    continue;
                }
            }

            buyers.add(new Buyer(1, 0, surname, name, patronymic,
                    phoneNumber, email, login, password, 10_000.00));
            CsvWriter.writeToBuyersFile(FILE_NAME_USERS, buyers);
            break;
        }
    }
}
