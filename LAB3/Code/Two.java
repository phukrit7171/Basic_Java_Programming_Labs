import java.util.Scanner;
public class Two {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome to GPA calculator");
        double temp = 0, totalCredits = 0;
        while (true) {
            System.out.print("Enter your grade (0-4, or 'Z' to quit) : ");
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("Z"))
                break;
            else if (input.matches("[0-4]")) {
            double grade = Double.parseDouble(input);
                System.out.print("Enter your credit : ");
                double credit = sc.nextDouble();
                sc.nextLine(); // เคลียร์ buffer
                temp += grade * credit;
                totalCredits += credit;
            } else {
                System.out.println("Invalid grade");
            }
        }
        double gpa = Math.round((temp / totalCredits)*100.0)/100.0;
        System.out.println("Your GPA is : " + gpa);
    }
}