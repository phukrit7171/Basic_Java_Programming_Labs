import java.util.Scanner;

public class Main {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String choice;
        do {
            System.out.println("Please select the desired program to run from 1 to 4.");
            System.out.print("Choose: ");
            choice = scan.nextLine();
            System.out.println();
            
            switch (choice) {
                case "1" -> one();
                case "2" -> two();
                case "3" -> three();
                case "4" -> four();
                default -> {
                    System.out.println("Invalid choice");
                    System.out.println("Exit all programs");
                    return;
                }
            }
            System.out.println();
        } while (choice.matches("[1-4]"));
    }

    static void one() {
        System.out.println("What is your age?");
        System.out.print("Answer: ");
        int age;
        try {
            age = Integer.parseInt(scan.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a number.");
            return;
        }
        
        if (age < 18) {
            System.out.println("You are not allowed to apply for a driving license");
        } else {
            System.out.println("You are an adult. What is your name?");
            System.out.print("My name is ");
            String name = scan.nextLine();
            System.out.println("That's a very good name :), " + name);
        }
        System.out.println("The end of the program");
    }

    static void two() {
        System.out.println("Welcome! This is a program that checks eligibility to take the exam.");
        System.out.print("The Total Number of the classes: ");
        int totalClasses = Integer.parseInt(scan.nextLine());
        System.out.print("How many times the student came late: ");
        double lateAttendances = Double.parseDouble(scan.nextLine());
        System.out.print("How many times the student was absent: ");
        int absences = Integer.parseInt(scan.nextLine());
        System.out.println();
        
        double effectiveAttendance = totalClasses - (lateAttendances / 2 + absences);
        if (effectiveAttendance >= totalClasses * 0.8) {
            System.out.println("The student can take the exam");
        } else {
            System.out.println("The student cannot take the exam");
        }
    }

    static void three() {
        System.out.println("This is a GPA calculator.\n");

        double totalCredits = 0;
        double totalGradePoints = 0;
        int subjectCount = 2;

        for (int i = 1; i <= subjectCount; i++) {
            System.out.print("Enter subject " + i + ": ");
            String subject = scan.nextLine();

            System.out.print("Enter " + subject + " credits: ");
            double credits = Double.parseDouble(scan.nextLine());

            System.out.print("Enter the grade you got (A,B,C,D,F): ");
            String grade = scan.nextLine().toUpperCase();

            double gradePoint = gradeToGradePoint(grade);

            totalCredits += credits;
            totalGradePoints += gradePoint * credits;

            System.out.println();
        }

        double GPA = Math.round((totalGradePoints / totalCredits) * 100.0) / 100.0;
        System.out.println("Your GPA is: " + GPA);
    }

    static double gradeToGradePoint(String grade) {
        return switch (grade) {
            case "A" -> 4.0;
            case "B" -> 3.0;
            case "C" -> 2.0;
            case "D" -> 1.0;
            case "F" -> 0.0;
            default -> throw new IllegalArgumentException("Invalid grade");
        };
    }

    static void four() {
        System.out.println("This tool calculates the amount that the customer needs to pay.");
        System.out.print("Are you a member? (yes/no): ");
        boolean isMember = scan.nextLine().equalsIgnoreCase("yes");

        String memberType = "none";
        if (isMember) {
            System.out.print("What type of member are you? (gold/silver): ");
            memberType = scan.nextLine().toLowerCase();
        }

        System.out.print("Sub total price: ");
        double subTotalPrice = Double.parseDouble(scan.nextLine());

        double discountPercent = calculateDiscountPercent(isMember, memberType, subTotalPrice);
        double discountAmount = Math.round(subTotalPrice * discountPercent * 100) / 100.0;
        double totalPrice = subTotalPrice - discountAmount;

        System.out.println("Discount: " + (discountPercent * 100) + "%");
        System.out.println("Discount amount : " + discountAmount);
        System.out.println("Total price is " + totalPrice);
    }

    static double calculateDiscountPercent(boolean isMember, String memberType, double subTotalPrice) {
        if (!isMember) return 0;

        if (memberType.equals("gold")) {
            if (subTotalPrice < 1000) return 0.05;
            if (subTotalPrice <= 10000) return 0.08;
            return 0.10;
        } else if (memberType.equals("silver")) {
            if (subTotalPrice < 1000) return 0.02;
            if (subTotalPrice <= 10000) return 0.03;
            return 0.05;
        }

        return 0;
    }
}