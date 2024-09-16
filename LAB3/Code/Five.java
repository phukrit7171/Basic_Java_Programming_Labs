import java.util.Scanner;

public class Five {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            System.out.print("Enter an index of the Fibonacci number : ");
            final long index = Long.parseLong(sc.nextLine());
            long result = fibonacciCalaulator(index);
            System.out.println("Fibonacci number of index " + index + " is " + result);
            sc.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private static long fibonacciCalaulator(long index) {
        long count = 0;
        long first = 0, second = 1;
        long next = first + second;
        if (index == 0)
            return 0;
        if (index == 1)
            return 1;
        if (index > 92)
            throw new ArithmeticException("Fibonacci number too large to calculate.");
        if (index < 0)
            throw new IllegalArgumentException(
                    "Invalid input.Index of Fibonacci number is not defined for negative numbers.");
        while (count < index - 2) {
            first = second;
            second = next;
            next = first + second;
            count++;
        }
        return next;
    }
}
