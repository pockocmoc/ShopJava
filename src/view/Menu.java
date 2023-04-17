package view;

import validation.EnterName;
import validation.NameValidator;

public class Menu {
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
    public static void pageAuthorizationView() {
        delimiter();
        System.out.println("Введите вашу фамилию: ");
        String surname = EnterName.enterName();
        if (!new NameValidator().isValidName(surname)) {
            System.out.println("Ошибка!!! Имя должно иметь длину от 2 до 20 символов, и состоять из букв.");
        }
    }
}