package controller;

import users.Buyer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LogInCSVHandler {
    private static final String DELIMITER = ",";

    public static List<Buyer> readFromFile(String fileName) {
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
}
