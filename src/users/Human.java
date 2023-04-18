package users;

public  class Human {
    private int id;
    private int isItAnAdministrator;
    private String surname;
    private String name;
    private String patronymic;
    private String phoneNumber;
    private String email;
    private String login;
    private String password;

    public Human(int id, int isItAnAdministrator, String surname, String name,
                 String patronymic, String phoneNumber, String email,
                 String login, String password) {
        this.id = id;
        this.isItAnAdministrator = isItAnAdministrator;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.login = login;
        this.password = password;
    }

}
