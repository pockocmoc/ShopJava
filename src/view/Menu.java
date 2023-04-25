package view;

public class Menu {
    public static void delimiter() {
        System.out.println("*".repeat(50));
    }

    public static void pageHeadMenuView() {
        delimiter();
        System.out.println("\t\tМагазин \"Вымпел\".");
        delimiter();
        System.out.println("Выберите пункт меню:");
        System.out.println();
        System.out.println("1. Авторизоваться.");
        System.out.println("2. Зарегистрироваться.");
        System.out.println("3. Выход.");
    }


    public static void pageMenuShopBuyers() {
        delimiter();
        System.out.println("\t\tМеню магазин Вымпел.");
        delimiter();
        System.out.println("Выберите пункт меню: ");
        System.out.println();
        System.out.println("1. Каталог товаров.");
        System.out.println("2. Купить товар.");
        System.out.println("3. Баланс.");
        System.out.println("4. Список купленных товаров.");
        System.out.println("5. Выход в основное меню.");

    }
    public static void pageHeadMenuShopAdmin() {
        delimiter();
        System.out.println("\t\tМеню администратора магазина Вымпел.");
        delimiter();
        System.out.println("Выберите пункт меню: ");
        System.out.println();
        System.out.println("1. Управление товарами.");
        System.out.println("2. Управление пользователями");
        System.out.println("3. Выход в основное меню.");

    }


    public static void pageMenuGoodsManagement() {
        delimiter();
        System.out.println("\t\tМеню магазин Вымпел.");
        delimiter();
        System.out.println("Управление товарами.");
        System.out.println();
        System.out.println("1. Каталог товаров.");
        System.out.println("2. Добавить товар.");
        System.out.println("3. Изменить товар.");
        System.out.println("4. Удалить товар.");
        System.out.println("5. Назад.");

    }

    public static void pageMenuCustomerManagement() {
        delimiter();
        System.out.println("\t\tУправление пользователями.");
        delimiter();
        System.out.println("Выберите пункт меню:");
        System.out.println();
        System.out.println("1. Список пользователей.");
        System.out.println("2. Назначение администратора.");
        System.out.println("3. Удаление пользователя.");
        System.out.println("4. Назад.");

    }



}