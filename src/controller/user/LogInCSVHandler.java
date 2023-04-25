package controller.user;

import controller.RunAdminGoodsManagement;
import controller.RunShopBuyerMenu;
import controller.RunShopHeadAdminMenu;
import model.Buyer;
import validation.EnterName;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static controller.user.RegistrationCSVHandler.FILE_NAME_USERS;

public class LogInCSVHandler {
    public static final String DELIMITER = ",";

    public static List<Buyer> readFromFileBuyers(String fileName) {
        List<Buyer> buyers = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split(DELIMITER);
                int id = Integer.parseInt(fields[0]);
                int isItAdmin = Integer.parseInt(fields[1]);
                String surname = fields[2];
                String name = fields[3];
                String patronymic = fields[4];
                String phoneNumber = fields[5];
                String email = fields[6];
                String login = fields[7];
                String password = fields[8];
                double wallet = Double.parseDouble(fields[9]);

                buyers.add(new Buyer(id, isItAdmin, surname, name,
                        patronymic, phoneNumber, email, login, password, wallet));
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения из файла: " + e.getMessage());
        }
        return buyers;
    }

    public static class LoginChecker {
        public static void checkLogin() {
            System.out.print("Введите логин: ");
            String login = EnterName.enterName();
            System.out.print("Введите пароль: ");
            String password = EnterName.enterName();
            List<Buyer> buyers = new ArrayList<>(readFromFileBuyers(FILE_NAME_USERS));
            for (Buyer buyer : buyers) {
                if (buyer.getLogin().equals(login) && buyer.getPassword().equals(password)) {
                    buyer.setLoggedInBuyer(buyer); // ????
                    if (buyer.getIsItAnAdministrator() == 1) {
                        System.out.println(login + ", вы вошли в систему как администратор");
                        RunShopHeadAdminMenu runShopHeadAdminMenu = new RunShopHeadAdminMenu();
                        runShopHeadAdminMenu.runAdminMenu();
                    } else {
                        System.out.println(login + ": вход выполнен.");
                        RunShopBuyerMenu runShopBuyerMenu = new RunShopBuyerMenu();
                        runShopBuyerMenu.runBuyerMenu();
                    }
                    return;
                }
            }

            System.out.println("Пользователь не найден");
        }

    }

}
