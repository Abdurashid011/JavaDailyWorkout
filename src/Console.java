import java.util.Scanner;

public class Console {

    private static Scanner scanner = new Scanner(System.in);

    public static double readNumber(String label) {
        return scanner.nextDouble();
    }

    public static double readNumber(String label, double min, double max) {
        double value;

        while (true) {
            System.out.print(label);
            value = scanner.nextDouble();
            if (value >= min && value <= max) break;
            System.out.println("Xato kiritdingiz. Iltimos, " + min + " va " + max + " oralig'ida qiymat kiriting.");
        }
        return value;
    }
}
