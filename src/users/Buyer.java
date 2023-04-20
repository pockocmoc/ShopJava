package users;



public record Buyer(int id, int isItAnAdministrator, String surname, String name, String patronymic,
                    String phoneNumber, String email, String login, String password, double wallet) {

}