package controller.user;

import model.Buyer;
import view.Menu;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import static controller.user.RegistrationCSVHandler.FILE_NAME_USERS;

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

    public static void appointAnAdministrator(String fileName, int id) {
        List<Buyer> buyers = LogInCSVHandler.readFromFileBuyers(FILE_NAME_USERS);
        boolean isProductFound = false;
        for (Buyer buyer : buyers) {
            if (buyer.getId() == id) {
                int newAdmin = 1;
                buyer.setIsItAnAdministrator(newAdmin);

                isProductFound = true;
                System.out.println("Данные успешно изменены!");
                break;
            }
        }
        if (!isProductFound) {
            System.out.println("Нет пользователя с таким номером!");
        }

        overwriteFileBuyers(fileName, buyers);
    }

    public static void overwriteFileBuyers(String fileName, List<Buyer> buyers) {
        try (FileWriter writer = new FileWriter(fileName)) {

            appendLineBuyers(buyers, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void removeBuyer(String fileName, int id) {
        List<Buyer> buyerList = LogInCSVHandler.readFromFileBuyers(fileName);
        boolean isBuyerFound = false;

        for (Buyer buyer : buyerList) {
            if (buyer.getId() == id) {
                buyerList.remove(buyer);
                System.out.println("Пользователь удален!");
                isBuyerFound = true;
                break;
            }
        }

        if (!isBuyerFound) {
            System.out.println("Нет пользователя с таким номером!");
        }

        overwriteFileBuyers(fileName, buyerList);
    }
}