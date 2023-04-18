package controller;

import java.util.ArrayList;
import java.util.List;

import users.Buyer;
import validation.ConsoleInputLine;
import validation.NameValidator;


public class RegistrationCSVHandler {
    final String FILE_NAME_USERS = "./src/db/users.csv";
    static final String CSV_SEPARATOR = ",";
    static List<Buyer> buyers = new ArrayList<>();

    public static void addNewBuyer() {
        System.out.println("Введите фамилию: ");
        String surnameBuyer = ConsoleInputLine.readStringFromConsole();
        if (NameValidator.isValidName(surnameBuyer)) {
            System.out.println("Неверный формат фамилии.");
            return;
        }
        System.out.println("Введите имя: ");
        String nameBuyer = ConsoleInputLine.readStringFromConsole();
        System.out.println("Введите отчество: ");
        String patronymicBuyer = ConsoleInputLine.readStringFromConsole();
        System.out.println("Введите номера телефона: ");
        String  phoneNumber = ConsoleInputLine.readStringFromConsole();
        System.out.println("Введите адрес электронной почты: ");
        String  email = ConsoleInputLine.readStringFromConsole();
        System.out.println("Введите логин: ");
        String  login = ConsoleInputLine.readStringFromConsole();
        System.out.println("Введите пароль: ");
        String  password = ConsoleInputLine.readStringFromConsole();
//        buyers.add(new Buyer(getBuyerId(), nameBuyer, surnameBuyer, check, phoneNumber));
//        RegistrationCSVHandler.writeToBuyersFile(FILE_NAME_USERS, buyers);
    }

}
