import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите N > 0: ");
        int n = scanner.nextInt();
        while (n <= 0) {
            System.out.print("Введите положительное N: ");
            n = scanner.nextInt();
        }

        boolean found = false;
        while (n > 0) {
            int digit = n % 10;
            if (digit % 2 != 0) {
                found = true;
                break;
            }
            n /= 10;
        }

        System.out.println(found ? "True" : "False");
    }
}
