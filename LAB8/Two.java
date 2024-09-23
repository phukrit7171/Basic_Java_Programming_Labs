import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        final Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number : ");
        double num = Double.parseDouble(input.nextLine());
        boolean running = true;
        
        while (running) {
            System.out.print("Enter a word (add,subtract,multiply,divide,exit) : ");
            switch (input.nextLine()) {
                case "add" -> {
                    System.out.print("Enter number : ");
                    num = add(num, Double.parseDouble(input.nextLine()));
                }
                case "subtract" -> {
                    System.out.print("Enter number : ");
                    num = subtract(num, Double.parseDouble(input.nextLine()));
                }
                case "multiply" -> {
                    System.out.print("Enter number : ");
                    num = multiply(num, Double.parseDouble(input.nextLine()));
                }
                case "divide" -> {
                    System.out.print("Enter number : ");
                    num = divide(num, Double.parseDouble(input.nextLine()));
                }
                case "exit" -> running = false;
                default -> System.out.println("Invalid input.");
            }
            System.out.println("Currently, num = " + num);
        }

        input.close();
    }

    static double add(double x, double y) {
        return x + y;
    }

    static double subtract(double x, double y) {
        return x - y;
    }

    static double multiply(double x, double y) {
        return x * y;
    }

    static double divide(double x, double y) {
        return x / y;
    }
}
