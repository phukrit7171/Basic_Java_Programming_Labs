import java.util.Scanner;

public class Three {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the number of the multiplication table : ");
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= 12; i++){
            System.out.println(n + " x " + i + " = " + i * n);
        }     
    }
    
}
