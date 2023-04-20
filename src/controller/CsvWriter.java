package controller;

import users.Buyer;
import view.Menu;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CsvWriter {
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
            writer.append(String.valueOf(buyer.id()));
            writer.append(RegistrationCSVHandler.CSV_SEPARATOR);
            writer.append(String.valueOf(buyer.isItAnAdministrator()));
            writer.append(RegistrationCSVHandler.CSV_SEPARATOR);
            writer.append(buyer.surname());
            writer.append(RegistrationCSVHandler.CSV_SEPARATOR);
            writer.append(buyer.name());
            writer.append(RegistrationCSVHandler.CSV_SEPARATOR);
            writer.append(buyer.patronymic());
            writer.append(RegistrationCSVHandler.CSV_SEPARATOR);
            writer.append(buyer.phoneNumber());
            writer.append(RegistrationCSVHandler.CSV_SEPARATOR);
            writer.append(buyer.email());
            writer.append(RegistrationCSVHandler.CSV_SEPARATOR);
            writer.append(buyer.login());
            writer.append(RegistrationCSVHandler.CSV_SEPARATOR);
            writer.append(buyer.password());
            writer.append(RegistrationCSVHandler.CSV_SEPARATOR);
            writer.append(String.valueOf(buyer.wallet()));
            writer.append("\n");
        }
    }
}