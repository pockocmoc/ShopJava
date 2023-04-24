package controller;

import controller.product.AddProductAdminCSV;
import controller.product.ProductCSVHandler;
import validation.EnterName;
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
                    System.out.println("Введите номер товара, для редактирования его карточки: ");
                    int id = InputNumberValidator.choiceInt();
                    AddProductAdminCSV.editProduct(FILE_NAME_PRODUCT, id);
                    break;
                case 4:
                    System.out.println("Выбирите номер товара для удаления: ");
                    int removeId = InputNumberValidator.choiceInt();
                    System.out.println("Выбирите количество удаляемого товара: ");
                    int quantity = InputNumberValidator.choiceInt();
                    AddProductAdminCSV.removeProduct(FILE_NAME_PRODUCT, removeId, quantity);
                    break;
                case 5:
                    break;

                default:
                    System.out.println("\n\tНекорректный ввод. Попробуйте еще раз.");
            }
        } while (numberOfMenu != 5);
    }
}
