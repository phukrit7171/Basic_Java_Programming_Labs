import java.util.Scanner;

public class Four {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int a,b,c;
        do{
            System.out.print("Enter the first number : ");
            a = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter the second number : ");
            b = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter the third number : ");
            c = Integer.parseInt(scanner.nextLine());
            System.out.println((a < 0 || b < 0 || c < 0)?"\nEnter only positive number\n":"\n");
        }while(a < 0 || b < 0 || c < 0);
        for (int i = 0; i < 2; i++) {
            if (a > b) {
                int temp = a;
                a = b;
                b = temp;
            }
            if (b > c) {
                int temp = b;
                b = c;
                c = temp;
            }
        }
        System.out.printf("The numbers in ascending order are : %d %d %d \n", a, b, c);
    }
}