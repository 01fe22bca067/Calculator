import java.util.Scanner;

public class ExtendedCalculator extends Calculator {
    public static double calculateSquareRoot(double num) {
        return Math.sqrt(num);
    }

    public static double calculateCubeRoot(double num) {
        return Math.cbrt(num);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        double number = scanner.nextDouble();

        System.out.println("Square root of " + number + " is: " + calculateSquareRoot(number));
        System.out.println("Cube root of " + number + " is: " + calculateCubeRoot(number));

        scanner.close();
    }
}
