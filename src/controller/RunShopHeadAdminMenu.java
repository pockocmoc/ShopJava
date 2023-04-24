package controller;

import validation.InputNumberValidator;
import view.Menu;

public class RunShopHeadAdminMenu {
    static final String FILE_NAME_PRODUCT = "./src/db/product.csv";

    public void runAdminMenu() {
        int numberOfMenu;
        do {
            Menu.pageHeadMenuShopAdmin();
            numberOfMenu = InputNumberValidator.choiceInt();
            switch (numberOfMenu) {
                case 1:
                    RunAdminGoodsManagement.runAdminGoodsManagement();
                    break;
                case 2:
                    RunAdminCustomerManagement.runAdminCustomer();
                    break;
                case 3:
                    break;

                default:
                    System.out.println("\n\tНекорректный ввод. Попробуйте еще раз.");
            }
        } while (numberOfMenu != 3);
    }
}
