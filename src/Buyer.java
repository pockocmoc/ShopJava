import java.math.BigDecimal;

public class Buyer extends Human {
    protected BigDecimal wallet;

    public Buyer(int id, int isItAnAdministrator, String surname, String name, String patronymic,
                 String phoneNumber, String email, String login, String password, BigDecimal wallet) {
        super(id, isItAnAdministrator, surname, name, patronymic, phoneNumber, email, login, password);
        this.wallet = wallet;
    }
}
