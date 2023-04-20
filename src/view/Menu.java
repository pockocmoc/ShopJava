package view;

import controller.LogInCSVHandler;
import users.Buyer;
import validation.ConsoleInputLine;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    static final String FILE_NAME_USERS = "./src/db/users.csv";
    public static void delimiter() {
        System.out.println("*".repeat(50));
    }

    public static void pageHeadMenuView() {
        delimiter();
        System.out.println("\t\tМагазин \"Вымпел\".");
        delimiter();
        System.out.println("Выберите пункт меню:");
        System.out.println("1. Авторизоваться.");
        System.out.println("2. Зарегистрироваться.");
        System.out.println("3. Выход.");
    }

    public static void pageMenuLoginView() {
        delimiter();
        System.out.println("\t\tАвторизация.");
        System.out.println("Введите логин: ");
        String loginName = ConsoleInputLine.readStringFromConsole();
        System.out.println("Введите пароль: ");
        String password = ConsoleInputLine.readStringFromConsole();
        List<Buyer> buyers = new ArrayList<>();
        buyers = LogInCSVHandler.readFromFile(FILE_NAME_USERS);




    }

    public static void pageMenuRegisterView() {
        delimiter();
        System.out.println("\t\tРегистрация пользователя.");
        System.out.println("Введите фамилию: ");
        System.out.println("Введите имя: ");
        System.out.println("Введите отчество: ");
        System.out.println("Введите номер телефона: ");
        System.out.println("Введите адрес электронной почты: ");
        System.out.println("Введите  логин: ");
        System.out.println("Введите пароль: ");


    }

}