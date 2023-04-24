package controller.product;

import model.Product;
import validation.EnterName;
import validation.InputNumberValidator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static controller.RunShopBuyerMenu.FILE_NAME_PRODUCT;

public class AddProductAdminCSV {
    static List<Product> products = new ArrayList<>();

    public static void addNewProduct() {

        System.out.println("Введите имя товара: ");
        String name = EnterName.enterName();
        System.out.println("Введите цену товара: ");
        double price = InputNumberValidator.choiceDouble();
        System.out.println("Введите количество товара: ");
        int amount = InputNumberValidator.choiceInt();
        products.add(new Product(getNewToyId(), name, price, amount));
        CSVProductWriter.writeToProductFile(FILE_NAME_PRODUCT, products);
    }

    private static int getNewToyId() {
        return startId(FILE_NAME_PRODUCT);
    }

    static int startId(String fileNameProduct) {
        int maxId = 0;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileNameProduct));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(",");
                int id = Integer.parseInt(values[0].replaceAll("\"", ""));
                if (id > maxId) {
                    maxId = id;
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return maxId + 1;
    }
}
