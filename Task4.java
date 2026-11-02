import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        double x = Double.parseDouble(scanner.nextLine().replace(',', '.'));
        printParts(x);
    }

    static double printParts(double x) {
        double whole;
        if (x >= 0) {
            whole = Math.floor(x);
        } else {
            whole = Math.ceil(x);
        }
        double fraction = x - whole;

        System.out.println("Число: " + x);
        System.out.println("Целая часть: " + whole);
        System.out.println("Дробная часть: " + fraction);
        return fraction;
    }
}
