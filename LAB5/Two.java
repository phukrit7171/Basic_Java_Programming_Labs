import java.util.Scanner;

public class Two {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int max = 0;
        String prime = "", even = "";
        System.out.print("How many numbers will you receive? : ");
        int r = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= r; i++) {
            System.out.print("Enter number " + i + " : ");
            int n = Integer.parseInt(sc.nextLine());
            max = (n > max) ? n : max;
            prime += (isPrime(n)) ? n + " " : "";
            even += (isEven(n)) ? n + " " : "";
        }
        System.out.println("Even number is " + even);
        System.out.println("Prime number is " + prime);
        System.out.println("Max number is " + max);

    }

    private static boolean isPrime(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    private static boolean isEven(int n) {
        return n % 2 == 0;
    }
}
