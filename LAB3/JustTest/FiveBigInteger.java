import java.util.Scanner;
import java.math.BigInteger;
public class FiveBigInteger {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter an index of the Fibonacci number : ");
        final long index = Long.parseLong(sc.nextLine());
        BigInteger result =fibonacciCalaulator(index);
        System.out.println("Fibonacci number of index " + index + " is " + result);
        sc.close();
    }
    private static BigInteger fibonacciCalaulator(long index) {
        long count = 0;
        BigInteger first = new BigInteger("0");
        BigInteger second = new BigInteger("1");
        BigInteger next = first.add(second);
        if (index == 0) return new BigInteger("0");
        if (index == 1) return new BigInteger("1");
        // if (index > 92)throw new ArithmeticException("Fibonacci number too large to calculate.");
        if (index < 0) throw new IllegalArgumentException("Invalid input.Index of Fibonacci number is not defined for negative numbers.");
        while (count < index - 2) {
            first = second;
            second = next;
            next = first.add(second);
            count++;
        }
        return next;
    }
}
