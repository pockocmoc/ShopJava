package controller.product;

import model.Product;
import validation.EnterName;
import validation.InputNumberValidator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static controller.RunShopBuyerMenu.FILE_NAME_PRODUCT;
import static controller.product.CSVProductWriter.appendLineProduct;

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
    public static void removeProduct(String fileName, int id, int quantity) {
        List<Product> products1 = ProductCSVHandler.readFromFileProduct(fileName);
        boolean isProductFound = false;
        for (Product product : products1) {
            if (product.getId() == id) {
                if (product.getQuantity() < quantity) {
                    System.out.println("Недостаточное количество товара для удаления!");
                    return;
                } else if (product.getQuantity() == quantity) {
                    products1.remove(product);
                    System.out.println("Товар удален!");
                } else {
                    product.setQuantity(product.getQuantity() - quantity);
                    System.out.println("Товар удален! Количество: " + quantity);
                }
                isProductFound = true;
                break;
            }
        }
        if (!isProductFound) {
            System.out.println("Нет товара с таким номером!");
        }

        overwriteFile(fileName, products1);
    }
    public static void overwriteFile(String fileName, List<Product> products) {
        try (FileWriter writer = new FileWriter(fileName)) {

            appendLineProduct(products, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void editProduct(String fileName, int id) {
        List<Product> products1 = ProductCSVHandler.readFromFileProduct(fileName);
        boolean isProductFound = false;
        for (Product product : products1) {
            if (product.getId() == id) {
                System.out.println("Введите новое имя товара или нажмите Enter, чтобы оставить без изменения: ");
                String newName = EnterName.enterName();
                if (!newName.isEmpty()) {
                    product.setName(newName);
                }

                System.out.println("Введите новую цену товара или нажмите Enter, чтобы оставить без изменения: ");
                String newPrice = EnterName.enterName();
                if (!newPrice.isEmpty()) {
                    product.setPrice(Double.parseDouble(newPrice));
                }

                System.out.println("Введите новое количество товара или нажмите Enter, чтобы оставить без изменения: ");
                String newQuantity = EnterName.enterName();
                if (!newQuantity.isEmpty()) {
                    product.setQuantity(Integer.parseInt(newQuantity));
                }

                isProductFound = true;
                System.out.println("Данные товара успешно изменены!");
                break;
            }
        }
        if (!isProductFound) {
            System.out.println("Нет товара с таким номером!");
        }

        overwriteFile(fileName, products1);
    }
}
