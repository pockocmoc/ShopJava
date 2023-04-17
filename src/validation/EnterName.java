package validation;

import java.util.Scanner;

public class EnterName {
    public static String enterName() {
        Scanner scanner = new Scanner(System.in);
       // System.out.print("Введите ваше имя: ");
        return scanner.nextLine();
    }
}
