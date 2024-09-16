import java.util.Scanner;

public class One {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int number, even = 0, odd = 0;
        String input;
        System.out.println("Hello! This is calculator for summation of the even numbers and the summation of the odd numbers");
        do {

            System.out.print("Enter number : ");
            input = sc.nextLine();
            try {
                number = Integer.parseInt(input);
                if (number % 2 == 0) {
                    even += number;
                } else {
                    odd += number;
                }
            }catch (Exception e) {
                if(!input.equalsIgnoreCase("z"))System.out.println("Invalid input " + e.getMessage());
            }
        } while (!input.equalsIgnoreCase("z"));
        System.out.printf("Summation of the even numbers is %d \n", even);
        System.out.printf("Summation of the odd numbers is %d \n", odd);
    }
}
