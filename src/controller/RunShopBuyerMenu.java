package controller;

import controller.product.ProductCSVHandler;
import controller.product.PurchaseOfGoods;
import controller.soldout.CSVListOfPurchasedGoodsHandler;
import validation.InputNumberValidator;
import view.Menu;

import java.util.Arrays;
import java.util.List;

import static controller.user.RegistrationCSVHandler.FILE_NAME_SOLD_OUT_GOODS;


public class RunShopBuyerMenu {
    public static final String FILE_NAME_PRODUCT = "./src/db/product.csv";

    public void runBuyerMenu() {
        int numberOfMenu;
        do {
            Menu.pageMenuShopBuyers();
            numberOfMenu = InputNumberValidator.choiceInt();
            switch (numberOfMenu) {
                case 1:
                    System.out.println(ProductCSVHandler.readFromFileProduct(FILE_NAME_PRODUCT));
                    break;
                case 2:
                    System.out.println("Введите номер товара: ");
                    int productId = InputNumberValidator.choiceInt();
                    System.out.println("Введите количество товара для покупки: ");
                    int amount = InputNumberValidator.choiceInt();
                    PurchaseOfGoods.buyProduct(FILE_NAME_PRODUCT, productId, amount);
                    break;
                case 3:
                    System.out.println(PurchaseOfGoods.balanceCheck());
                    break;
                case 4:
                    List<String[]> data = CSVListOfPurchasedGoodsHandler.readFromFile(FILE_NAME_SOLD_OUT_GOODS);
                    for (String[] values : data) {
                        System.out.println(Arrays.toString(values));
                    }
                    break;
                case 5:
                    break;
                default:
                    System.out.println("\n\tНекорректный ввод. Попробуйте еще раз.");
            }
        } while (numberOfMenu != 5);
    }

}



