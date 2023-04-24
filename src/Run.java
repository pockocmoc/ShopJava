import controller.user.LogInCSVHandler;
import controller.user.RegistrationCSVHandler;
import validation.InputNumberValidator;
import view.Menu;

public class Run {


    public void run() {
        int numberOfMenu;
        do {
            Menu.pageHeadMenuView();
            numberOfMenu = InputNumberValidator.choiceInt();
            switch (numberOfMenu) {
                case 1:
                    runLogin();
                    break;
                case 2:
                    runRegister();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("\n\tНекорректный ввод. Попробуйте еще раз.");
            }
        } while (numberOfMenu != 3);
    }

    public void runLogin() {
        LogInCSVHandler.LoginChecker.checkLogin();

    }

    public void runRegister() {

        RegistrationCSVHandler.addNewBuyer();
    }
}

