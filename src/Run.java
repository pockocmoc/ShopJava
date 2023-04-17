import validation.InputNumberValidator;
import view.Menu;

public class Run {
    final String FILE_NAME_USERS = "./src/db/users.csv";
    final String FILE_NAME_PRODUCT = "./src/db/product.csv";
    final String FILE_NAME_SOLD_OUT_GOODS = "./src/db/sold_out.csv";

    public void run() {
        int numberOfMenu;
        do {
            Menu.pageHeadMenuView();
            numberOfMenu = InputNumberValidator.choice();
            switch (numberOfMenu) {
                case 1:
                    runToys();
                    break;
                case 2:
                    runBuyers();
                    break;
                case 3:
                    runDrawingToys();
                    break;
                default:
                    System.out.println("\n\tНекорректный ввод. Попробуйте еще раз.");
            }
        } while (numberOfMenu != 3);
    }
    public void runLogin() {

    }
}

