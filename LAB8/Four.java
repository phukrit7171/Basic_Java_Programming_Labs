import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        final Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        System.out.println(check_odd_even(Integer.parseInt(input.nextLine())));
        input.close();
    }
    static String check_odd_even(int n){
        return (n % 2 == 0) ? "EVEN" : "ODD";
    }
}
