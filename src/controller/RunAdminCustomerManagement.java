package controller;

import validation.InputNumberValidator;
import view.Menu;

public class RunAdminCustomerManagement {
    public static void runAdminCustomer() {
        int numberOfMenu;
        do {
            Menu.pageMenuCustomerManagement();
            numberOfMenu = InputNumberValidator.choice();
            switch (numberOfMenu) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;

                default:
                    System.out.println("\n\tНекорректный ввод. Попробуйте еще раз.");
            }
        } while (numberOfMenu != 4);
    }
}
