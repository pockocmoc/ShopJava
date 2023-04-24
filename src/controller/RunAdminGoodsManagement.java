package controller;

import controller.product.AddProductAdminCSV;
import controller.product.ProductCSVHandler;
import validation.InputNumberValidator;
import view.Menu;

import static controller.RunShopBuyerMenu.FILE_NAME_PRODUCT;

public class RunAdminGoodsManagement {
    public static void runAdminGoodsManagement() {
        int numberOfMenu;
        do {
            Menu.pageMenuGoodsManagement();
            numberOfMenu = InputNumberValidator.choiceInt();
            switch (numberOfMenu) {
                case 1:
                    System.out.println(ProductCSVHandler.readFromFileProduct(FILE_NAME_PRODUCT));
                    break;
                case 2:
                    AddProductAdminCSV.addNewProduct();
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
