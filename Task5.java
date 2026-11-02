import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            printMenu();
            if (!scanner.hasNextLine()) {
                break;
            }
            String command = scanner.nextLine().trim();

            if (command.equals("1")) {
                if (!calculate(scanner)) {
                    break;
                }
            } else if (command.equals("2")) {
                System.out.println("Расчёт гипотенузы прямоугольного треугольника по двум катетам.");
            } else if (command.equals("3")) {
                System.out.println("Кузнеченко Роман Евгеньевич, РИ-250911.");
            } else if (command.equals("0") || command.equalsIgnoreCase("exit")) {
                break;
            } else {
                System.out.println("Неизвестная команда. Повторите ввод.");
            }
        }
    }

    static void printMenu() {
        System.out.println("1. Выполнить расчёт");
        System.out.println("2. Информация о программе");
        System.out.println("3. Информация о разработчике");
        System.out.println("0. exit");
        System.out.print("Выберите пункт: ");
    }

    static boolean calculate(Scanner scanner) {
        double a = readLeg(scanner, "a");
        if (a == -1) {
            return false;
        }

        double b = readLeg(scanner, "b");
        if (b == -1) {
            return false;
        }

        double c = Math.hypot(a, b);
        System.out.println("Гипотенуза: " + c);
        return true;
    }

    static double readLeg(Scanner scanner, String name) {
        while (true) {
            System.out.print("Введите катет " + name + " или 'exit': ");
            if (!scanner.hasNextLine()) {
                return -1;
            }
            String input = scanner.nextLine().trim();
            if (input.equalsIgnoreCase("exit")) {
                return -1;
            }

            try {
                double value = Double.parseDouble(input.replace(',', '.'));
                if (Double.isFinite(value) && value > 0) {
                    return value;
                }
            } catch (NumberFormatException e) {
            }

            System.out.println("Нужно положительное число. Повторите ввод.");
        }
    }
}
