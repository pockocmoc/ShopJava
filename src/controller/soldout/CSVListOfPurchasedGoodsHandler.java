package controller.soldout;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVListOfPurchasedGoodsHandler {
    public static void writePurchaseToFile(String fileName, String itemName, String buyerName, String timestamp,
                                           int count) {
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write(itemName + "," + count + "," + buyerName + "," + timestamp + "\n");
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл " + fileName + ": " + e.getMessage());
        }
    }

    public static List<String[]> readFromFile(String fileName) {
        List<String[]> data = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(",");
                data.add(values);
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения из файла " + fileName + ": " + e.getMessage());
        }
        return data;
    }

}
