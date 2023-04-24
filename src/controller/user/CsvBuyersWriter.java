package controller.user;

import model.Buyer;
import view.Menu;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CsvBuyersWriter {
    public static void writeToBuyersFile(String fileName, List<Buyer> buyers) {
        try (FileWriter writer = new FileWriter(fileName, true)) {
            appendLineBuyers(buyers, writer);
            Menu.delimiter();
            System.out.println("Пользователь успешно добавлен.");
        } catch (IOException e) {
            System.err.println("Ошибка записи файла: " + e.getMessage());
        }
    }

    private static void appendLineBuyers(List<Buyer> buyers, FileWriter writer) throws IOException {
        for (Buyer buyer : buyers) {
            writer.append(String.valueOf(buyer.getId()));
            writer.append(RegistrationCSVHandler.CSV_SEPARATOR);
            writer.append(String.valueOf(buyer.getIsItAnAdministrator()));
            writer.append(RegistrationCSVHandler.CSV_SEPARATOR);
            writer.append(buyer.getSurname());
            writer.append(RegistrationCSVHandler.CSV_SEPARATOR);
            writer.append(buyer.getName());
            writer.append(RegistrationCSVHandler.CSV_SEPARATOR);
            writer.append(buyer.getPatronymic());
            writer.append(RegistrationCSVHandler.CSV_SEPARATOR);
            writer.append(buyer.getPhoneNumber());
            writer.append(RegistrationCSVHandler.CSV_SEPARATOR);
            writer.append(buyer.getEmail());
            writer.append(RegistrationCSVHandler.CSV_SEPARATOR);
            writer.append(buyer.getLogin());
            writer.append(RegistrationCSVHandler.CSV_SEPARATOR);
            writer.append(buyer.getPassword());
            writer.append(RegistrationCSVHandler.CSV_SEPARATOR);
            writer.append(String.valueOf(buyer.getWallet()));
            writer.append("\n");
        }
    }
}