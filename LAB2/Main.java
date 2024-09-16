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
            switch (choice) {
                case "1":
                    one();
                    break;
                case "2":
                    two();
                    break;
                case "3":
                    three();
                    break;
                case "4":
                    four();
                    break;
                default:
                    System.out.println("Invalid choice");
                    System.out.println("Exit all program");
                    break;
            }
            System.out.println();
        } while (choice.equals("1") || choice.equals("2") || choice.equals("3") || choice.equals("4"));
    }

    static void one() {
        System.out.println("what is your age ?");
        System.out.print("Answer ");
        int age = scan.nextInt();
        if (age < 18) {
            System.out.println("You are not allowed to apply for a driving license");
        } else {
            System.out.println("You are an adult. What is your name ?");
            System.out.print("My name is ");
            String name = scan.next();
            System.out.println("That's is a very good name :), " + name);
        }
        System.out.println("The end of the program");
    }

    static void two() {
        System.out.println("Welcome! This is a program that checks eligibility to take the exam.");
        System.out.print("The Total Number of the classes : ");
        int classes = scan.nextInt();
        System.out.print("How many times the student came late : ");
        double late = scan.nextDouble();
        System.out.print("How many times the student was absent : ");
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

        System.out.print("Enter the first subject you enrolled in : ");
        String subject_1 = scan.next();

        System.out.print("Enter " + subject_1 + " credits : ");
        double credits_1 = scan.nextDouble();

        System.out.print("Enter the grade you got (A,B,C,D,F) : ");
        String grade_1 = scan.next().toUpperCase();

        double grade_1_point = gradeToGradePiont(grade_1);

        System.out.print("\nEnter the second subject you enrolled in : ");
        String subject_2 = scan.next();

        System.out.print("Enter " + subject_2 + " credits : ");
        double credits_2 = scan.nextDouble();

        System.out.print("Enter the grade you got (A,B,C,D,F) : ");
        String grade_2 = scan.next().toUpperCase();

        double grade_2_point = gradeToGradePiont(grade_2);


        System.out.println(subject_1+" credit " +credits_1+ " grade "+ grade_1);
        System.out.println(subject_2+" credit " +credits_2+ " grade "+ grade_2);

        double GPA = Math.round(
                ((grade_1_point * credits_1 + grade_2_point * credits_2) / (credits_1 + credits_2)) * 100.0) / 100.0;
        System.out.println("\nYour GPA is : " + GPA);

    }

    static double gradeToGradePiont(String grade) {
        switch (grade) {
            case "A":
                return 4.0;
            case "B":
                return 3.0;
            case "C":
                return 2.0;
            case "D":
                return 1.0;
            case "F":
                return 0.0;
            default:
                throw new IllegalArgumentException("Invalid grade");
        }
    }

    static void four() {
        double discount_percent = 0;
        System.out.println("This tool calculates the amount that the customer needs to pay.");
        System.out.print("Are you a member? (yes/no) :");
        boolean isMember = scan.next().equalsIgnoreCase("yes");

        String memberType = "none";

        if (isMember){
        System.out.print("What type of member are you? (gold/silver) :");
        memberType = scan.next();
    }
        System.out.print("Sub total prices : ");
        double subTotalPrice = scan.nextDouble();

        if (isMember) {
            if (memberType.equalsIgnoreCase("gold")) {
                if (0 <= subTotalPrice && subTotalPrice < 1000) {
                    discount_percent = 0.05;
                } else if (subTotalPrice <= 10000) {
                    discount_percent = 0.08;
                } else if (subTotalPrice > 10000) {
                    discount_percent = 0.10;
                }
            } else if (memberType.equalsIgnoreCase("silver")) {
                if (0 <= subTotalPrice && subTotalPrice < 1000) {
                    discount_percent = 0.02;
                } else if (subTotalPrice <= 10000) {
                    discount_percent = 0.03;
                } else if (subTotalPrice > 10000) {
                    discount_percent = 0.05;
                }
            }

        }
        double discountAmount = Math.round(subTotalPrice * discount_percent * 100)/100;
        double TotalPrice = subTotalPrice - discountAmount;
        System.out.println("Total proce is " + TotalPrice);
    }

}