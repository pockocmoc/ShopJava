package controller;

import validation.InputNumberValidator;
import view.Menu;


public class RunShopBuyerMenu {
    static final String FILE_NAME_PRODUCT = "./src/db/product.csv";
    public void runBuyerMenu() {
        int numberOfMenu;
        do {
            Menu.pageMenuShopBuyers();
            numberOfMenu = InputNumberValidator.choice();
            switch (numberOfMenu) {
                case 1:
                    System.out.println(LogInCSVHandler.readFromFileBuyers(FILE_NAME_PRODUCT));
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    System.out.println("\n\tНекорректный ввод. Попробуйте еще раз.");
            }
        } while (numberOfMenu != 5);
    }
}



