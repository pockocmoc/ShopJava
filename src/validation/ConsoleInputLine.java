package validation;

import java.util.Scanner;

public class ConsoleInputLine {
        public static String readStringFromConsole() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите строку: ");
            return scanner.nextLine();
        }

    }
