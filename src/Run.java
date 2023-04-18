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
                    runLogin();
                    break;
                case 2:
                    runRegister();
                    break;

                default:
                    System.out.println("\n\tНекорректный ввод. Попробуйте еще раз.");
            }
        } while (numberOfMenu != 3);
    }

    public void runLogin() {
        int numberOfMenu;
        do {
            Menu.pageMenuLoginView();
            numberOfMenu = InputNumberValidator.choice();
            switch (numberOfMenu) {
                case 1:
//                    System.out.println(ToyCSVHandler.readFromFile(FILE_NAME_TOYS));
                    break;
                case 2:
//                    ToyCSVHandler.addNewToy();
                    break;
                case 3:
//                    System.out.println(ToyCSVHandler.readFromFile(FILE_NAME_TOYS));
                    System.out.println("\n\tВведите № игрушки для изменения веса игрушки: ");
                    int idToy = InputNumberValidator.choice();
//                    ToyCSVHandler.updateToyDropFrequencyById(FILE_NAME_TOYS, idToy);
                    break;
                case 4:
//                    System.out.println(ToyCSVHandler.readFromFile(FILE_NAME_TOYS));
                    System.out.println("\n\tВведите № игрушки для удаления: ");
//                    ToyCSVHandler.removeToy(FILE_NAME_TOYS, InputNumberValidator.choice());
                    break;
                case 5:
                    break;
                default:
                    System.out.println("\n\tНекорректный ввод. Попробуйте еще раз.");
            }
        } while (numberOfMenu != 5);
    }

    public void runRegister() {

    }
}

