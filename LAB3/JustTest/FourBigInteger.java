import java.util.Scanner;
import java.math.BigInteger;

public class FourBigInteger {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //Fact calculator with while loop
        BigInteger result = new BigInteger("1");
        System.out.print("Enter a non-negative integer to find its factorial : ");
        final int input = Integer.parseInt(sc.nextLine());
        int i = input;
        while (i > 1) {
            result = result.parallelMultiply(BigInteger.valueOf(i));
            // System.out.print(result+" ");
            i--;
        }
        System.out.println();
        System.out.println("The factorial of " + input + " is " + result);  
    }

}