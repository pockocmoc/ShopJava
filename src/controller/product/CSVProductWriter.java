package controller.product;

import controller.user.RegistrationCSVHandler;
import model.Product;
import view.Menu;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CSVProductWriter {
    public static void writeToProductFile(String fileName, List<Product> products) {
        try (FileWriter writer = new FileWriter(fileName, true)) {
            appendLineProduct(products, writer);
            Menu.delimiter();
            System.out.println("Товар успешно добавлен.");
        } catch (IOException e) {
            System.err.println("Ошибка записи файла: " + e.getMessage());
        }
    }

    private static void appendLineProduct(List<Product> products, FileWriter writer) throws IOException {
        for (Product product : products) {
            writer.append(String.valueOf(product.getId()));
            writer.append(RegistrationCSVHandler.CSV_SEPARATOR);
            writer.append(String.valueOf(product.getName()));
            writer.append(RegistrationCSVHandler.CSV_SEPARATOR);
            writer.append(String.valueOf(product.getPrice()));
            writer.append(RegistrationCSVHandler.CSV_SEPARATOR);
            writer.append(String.valueOf(product.getQuantity()));
            writer.append("\n");
        }
    }
}

