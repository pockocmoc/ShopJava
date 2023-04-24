package validation;

import java.util.Scanner;

public class InputNumberValidator {
    public static int choiceInt() {
        Scanner scanner = new Scanner(System.in);
        int num;
        while (true) {
            try {
                num = Integer.parseInt(scanner.nextLine());
                if (num < 1) {
                    System.out.println("\n\tОшибка: число должно быть больше 0.");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("\n\tОшибка: введите число.");
            }
        }
        return num;
    }
    public static double choiceDouble() {
        Scanner scanner = new Scanner(System.in);
        double num;
        while (true) {
            try {
                num = Double.parseDouble(scanner.nextLine());
                if (num < 1) {
                    System.out.println("\n\tОшибка: число должно быть больше 0.");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("\n\tОшибка: введите число.");
            }
        }
        return num;
    }
}