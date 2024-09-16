import java.util.Scanner;

public class Three {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int sumNum = 0, count = 0;
        while (true) {
            System.out.print("Enter integer number : ");
            try {
                int number = Integer.parseInt(sc.nextLine());
                System.out.println(number + " is " + ((number % 2 == 0) ? "even" : "odd"));
                sumNum += number;
                count++;
            } catch (NumberFormatException e) {
                break;
            }
        }
        System.out.println("Sum of all numbers is " + ((sumNum % 2 == 0) ? "even" : "odd"));
        System.out.println("Sum of all numbers : " + sumNum);
        double avgNum = Math.round(((double) sumNum / (double) count) * 100.0) / 100.0;
        System.out.println("Average of all numbers : " + avgNum);
        sc.close();
    }
}