package controller;

import controller.user.CsvBuyersWriter;
import controller.user.LogInCSVHandler;
import validation.InputNumberValidator;
import view.Menu;

import static controller.user.RegistrationCSVHandler.FILE_NAME_USERS;

public class RunAdminCustomerManagement {
    public static void runAdminCustomer() {
        int numberOfMenu;
        do {
            Menu.pageMenuCustomerManagement();
            numberOfMenu = InputNumberValidator.choiceInt();
            switch (numberOfMenu) {
                case 1:
                    System.out.println(LogInCSVHandler.readFromFileBuyers(FILE_NAME_USERS));
                    break;
                case 2:
                    System.out.println("Введите номер пользователя для назначения \n" +
                            "его администратором: ");
                    int admin = InputNumberValidator.choiceInt();
                    CsvBuyersWriter.appointAnAdministrator(FILE_NAME_USERS, admin);
                    break;
                case 3:
                    System.out.println("Введите номер пользователя для \n" +
                            "его удаления: ");
                    int user = InputNumberValidator.choiceInt();
                    CsvBuyersWriter.removeBuyer(FILE_NAME_USERS, user);
                    break;
                case 4:
                    break;

                default:
                    System.out.println("\n\tНекорректный ввод. Попробуйте еще раз.");
            }
        } while (numberOfMenu != 4);
    }
}
