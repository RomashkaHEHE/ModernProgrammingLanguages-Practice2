public class Task1 {
    public static void main(String[] args) {
        for (int x = 0; x <= 90; x += 5) {
            double y = Math.cos(Math.toRadians(x));
            System.out.printf("cos(%d°) = %.4f%n", x, y);
        }
    }
}
