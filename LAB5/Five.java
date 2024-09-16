import java.util.Scanner;

public class Five {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the number of the triangle : ");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i <= n; i++) {
            for (int j = n-i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print((char)('A'+j));
            }
            for (int j = i-2; j >= 0; j--) {
                System.out.print((char)('A'+j));
            }
            System.out.println();
        }
    }   
}
