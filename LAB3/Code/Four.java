import java.util.Scanner;

public class Four {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a non-negative integer to find its factorial : ");
        String input = sc.nextLine();
        long fact = 1;
        try {
            long n = Long.parseLong(input);
            if (n < 0) {
                throw new IllegalArgumentException("Invalid input. Factorial is not defined for negative numbers.");
            }
            if (n > 20) {
                throw new ArithmeticException("Number too large. Factorial will overflow long data type.");
            }
            while (n > 1) {
                fact *= n;
                n--;
            }
            System.out.println("Result is " + fact);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        } catch (IllegalArgumentException | ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}