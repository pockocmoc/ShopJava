package controller.user;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import model.Buyer;
import validation.*;


public class RegistrationCSVHandler {
    static final String FILE_NAME_USERS = "./src/db/users.csv";
    static final String FILE_NAME_SOLD_OUT_GOODS = "./src/db/sold_out.csv";
    public static final String CSV_SEPARATOR = ",";
    static List<Buyer> buyers = new ArrayList<>();

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

            buyers.add(new Buyer(startId(FILE_NAME_USERS), 0, surname, name, patronymic,
                    phoneNumber, email, login, password, 10_000.00));
            CsvBuyersWriter.writeToBuyersFile(FILE_NAME_USERS, buyers);
            break;
        }
    }
    static int startId(String fileNameBuyers) {
        int maxId = 0;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileNameBuyers));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(",");
                int id = Integer.parseInt(values[0].replaceAll("\"", ""));
                if (id > maxId) {
                    maxId = id;
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return maxId + 1;
    }
}
