import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите X в радианах: ");
        double x = Double.parseDouble(scanner.nextLine().replace(',', '.'));

        System.out.print("Введите N > 0: ");
        int n = Integer.parseInt(scanner.nextLine());
        while (n <= 0) {
            System.out.print("Введите положительное N: ");
            n = Integer.parseInt(scanner.nextLine());
        }

        double sum = 1;
        double term = 1;
        for (int i = 1; i <= n; i++) {
            term = -term * x * x / (2.0 * i * (2.0 * i - 1));
            sum += term;
        }

        System.out.println("Результат: " + sum);
    }
}
