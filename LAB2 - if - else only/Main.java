import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);
    static String choice;

    public static void main(String[] args) {
        do {
            System.out.println("Please select the desired program to run from 1 to 4.");
            System.out.print("Choose : ");
            choice = scan.next();
            System.out.println();
            
            if (choice.equals("1")) {
                one();
            } else if (choice.equals("2")) {
                two();
            } else if (choice.equals("3")) {
                three();
            } else if (choice.equals("4")) {
                four();
            } else {
                System.out.println("Invalid choice");
                System.out.println("Exit all program");
                break;
            }
            System.out.println();
        } while (choice.equals("1") || choice.equals("2") || choice.equals("3") || choice.equals("4"));
    }

    static void one() {
        System.out.println("What is your age?");
        System.out.print("Answer: ");
        int age = scan.nextInt();
        scan.nextLine(); // Consume newline
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
        int classes = scan.nextInt();
        System.out.print("How many times the student came late: ");
        double late = scan.nextDouble();
        System.out.print("How many times the student was absent: ");
        int absent = scan.nextInt();
        System.out.println();
        if (classes - (late / 2 + absent) >= classes * 0.8) {
            System.out.println("The student can take the exam");
        } else {
            System.out.println("The student cannot take the exam");
        }
    }

    static void three() {
        System.out.println("This is a GPA calculator.\n");

        System.out.print("Enter the first subject you enrolled in: ");
        String subject1 = scan.next();

        System.out.print("Enter " + subject1 + " credits: ");
        double credits1 = scan.nextDouble();

        System.out.print("Enter the grade you got (A,B,C,D,F): ");
        String grade1 = scan.next().toUpperCase();

        double grade1Point = gradeToGradePoint(grade1);

        System.out.print("\nEnter the second subject you enrolled in: ");
        String subject2 = scan.next();

        System.out.print("Enter " + subject2 + " credits: ");
        double credits2 = scan.nextDouble();

        System.out.print("Enter the grade you got (A,B,C,D,F): ");
        String grade2 = scan.next().toUpperCase();

        double grade2Point = gradeToGradePoint(grade2);

        System.out.println(subject1+" credit " +credits1+ " grade "+ grade1);
        System.out.println(subject2+" credit " +credits2+ " grade "+ grade2);

        double GPA = Math.round(((grade1Point * credits1 + grade2Point * credits2) / (credits1 + credits2)) * 100.0) / 100.0;
        System.out.println("\nYour GPA is: " + GPA);
    }

    static double gradeToGradePoint(String grade) {
        if (grade.equals("A")) {
            return 4.0;
        } else if (grade.equals("B")) {
            return 3.0;
        } else if (grade.equals("C")) {
            return 2.0;
        } else if (grade.equals("D")) {
            return 1.0;
        } else if (grade.equals("F")) {
            return 0.0;
        } else {
            throw new IllegalArgumentException("Invalid grade");
        }
    }

    static void four() {
        double discountPercent = 0;
        System.out.println("This tool calculates the amount that the customer needs to pay.");
        System.out.print("Are you a member? (yes/no): ");
        boolean isMember = scan.next().equalsIgnoreCase("yes");

        String memberType = "none";

        if (isMember) {
            System.out.print("What type of member are you? (gold/silver): ");
            memberType = scan.next();
        }
        System.out.print("Sub total price: ");
        double subTotalPrice = scan.nextDouble();

        if (isMember) {
            if (memberType.equalsIgnoreCase("gold")) {
                if (subTotalPrice > 10000) {
                    discountPercent = 0.10;
                } else if (subTotalPrice >= 1000) {
                    discountPercent = 0.08;
                } else {
                    discountPercent = 0.05;
                }
            } else if (memberType.equalsIgnoreCase("silver")) {
                if (subTotalPrice > 10000) {
                    discountPercent = 0.05;
                } else if (subTotalPrice >= 1000) {
                    discountPercent = 0.03;
                } else {
                    discountPercent = 0.02;
                }
            }
        }
        double discountAmount = Math.round(subTotalPrice * discountPercent * 100) / 100.0;
        double totalPrice = subTotalPrice - discountAmount;
        System.out.println("Total price is " + totalPrice);
    }
}