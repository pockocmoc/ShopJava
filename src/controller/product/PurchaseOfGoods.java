package controller.product;

import model.Buyer;
import model.Product;

import java.util.List;

public class PurchaseOfGoods {
    public static void buyProduct(String fileName, int id, int quantity) {
        List<Product> products = ProductCSVHandler.readFromFileProduct(fileName);
        boolean isProductFound = false;
        for (Product product : products) {
            if (product.getId() == id) {
                if (product.getQuantity() < quantity) {
                    System.out.println("Недостаточное количество товара для покупки!");
                    return;
                } else {
                    double totalPrice = quantity * product.getPrice();
                    if (loginBuyerInfo().getWallet() < totalPrice) {
                        System.out.println("Недостаточно средств на балансе!");
                        return;
                    } else {
                        loginBuyerInfo().setWallet(loginBuyerInfo().getWallet() - totalPrice);
                        if (product.getQuantity() == quantity) {
                            products.remove(product);
                            System.out.println("Товар куплен!");
                        } else {
                            product.setQuantity(product.getQuantity() - quantity);
                            System.out.println("Товар куплен! Количество: " + quantity);
                        }
                        isProductFound = true;
                        break;
                    }
                }
            }
        }
        if (!isProductFound) {
            System.out.println("Нет товара с таким номером!");
        }

        AddProductAdminCSV.overwriteFile(fileName, products);
    }

    public static Buyer loginBuyerInfo() {
        return Buyer.getLoggedInBuyer();
    }
    public static String balanceCheck() {
        return "Баланс счета: " + Buyer.getLoggedInBuyer().getWallet();
    }
}
