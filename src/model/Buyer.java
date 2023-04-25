package model;

public class Buyer {
    private int id;
    private int isItAnAdministrator;
    private String surname;
    private String name;
    private String patronymic;
    private String phoneNumber;
    private String email;
    private String login;
    private String password;
    private double wallet;
    private static Buyer loggedInBuyer;

    public Buyer(int id, int isItAnAdministrator, String surname, String name,
                 String patronymic, String phoneNumber, String email,
                 String login, String password, double wallet) {
        this.id = id;
        this.isItAnAdministrator = isItAnAdministrator;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.login = login;
        this.password = password;
        this.wallet = wallet;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIsItAnAdministrator() {
        return isItAnAdministrator;
    }

    public void setIsItAnAdministrator(int isItAnAdministrator) {
        this.isItAnAdministrator = isItAnAdministrator;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

    public static Buyer getLoggedInBuyer() {
        return loggedInBuyer;
    }

    public void setLoggedInBuyer(Buyer buyer) {
        loggedInBuyer = buyer;
    }

    @Override
    public String toString() {
        if (isItAnAdministrator == 0) {
            return "\nid " + id +
                    ", " + surname +
                    " " + name +
                    " " + patronymic +
                    ", номер телефона: " + phoneNumber +
                    ", адрес электронной почты: " + email;
        } else {
            return "\nАдминистратор: id " + id +
                    ", " + surname +
                    " " + name +
                    " " + patronymic +
                    ", номер телефона: " + phoneNumber +
                    ", адрес электронной почты: " + email;
        }
    }
}