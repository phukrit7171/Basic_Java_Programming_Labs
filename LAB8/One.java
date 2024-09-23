import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        final Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        System.out.println(pow_2_by_received(input.nextInt()));
        input.close();
    }
    static double pow_2_by_received(int n){
        return Math.pow(2,n);
    }
}