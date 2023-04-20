package users;



public record Buyer(int id, int isItAnAdministrator, String surname, String name, String patronymic,
                    String phoneNumber, String email, String login, String password, double wallet) {
    @Override
    public int id() {
        return id;
    }

    @Override
    public int isItAnAdministrator() {
        return isItAnAdministrator;
    }

    @Override
    public String surname() {
        return surname;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public String patronymic() {
        return patronymic;
    }

    @Override
    public String phoneNumber() {
        return phoneNumber;
    }

    @Override
    public String email() {
        return email;
    }

    @Override
    public String login() {
        return login;
    }

    @Override
    public String password() {
        return password;
    }

    @Override
    public double wallet() {
        return wallet;
    }
}