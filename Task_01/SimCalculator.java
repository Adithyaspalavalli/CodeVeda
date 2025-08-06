import java.util.Scanner;

public class SimCalculator {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1, num2, result = 0;
        char operator;

        System.out.println("---- Simple Java Calculator ----");

        // Input numbers
        System.out.print("Enter first number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        operator = scanner.next().charAt(0);

        System.out.print("Enter second number: ");
        num2 = scanner.nextDouble();

        // Perform operation
        try {
            switch (operator) {
                case '+' -> result = add(num1, num2);
                case '-' -> result = subtract(num1, num2);
                case '*' -> result = multiply(num1, num2);
                case '/' -> result = divide(num1, num2);
                default -> {
                    System.out.println("Invalid operator!");
                    return;
                }
            }

            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }

    // Method definitions
    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0)
            throw new ArithmeticException("Cannot divide by zero");
        return a / b;
    }
}
