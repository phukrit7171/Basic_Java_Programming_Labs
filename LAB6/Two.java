import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = Double.parseDouble(input.nextLine());
        }

        System.out.print("Enter a number to verify: ");
        double verify = Double.parseDouble(input.nextLine());
        System.out.println("Your verify number is " + ((checkNumInArray(numbers, verify)) ? "in" : "not in") + " your array" + ".");
        input.close();

    }
    private static boolean checkNumInArray(double[] numbers, double verify) {
        for (double i : numbers) {
            if (i == verify) {
                return true;
            }
        }
        return false;
    }
}
