import java.util.Scanner;

public class Three {
    /*************************************
     * labMethodQ1 accepts two integers.
     * it will return 0 when both integers are negative, otherwise return the
     * summation.
     */
    public static int labMethodQ1(int x , int y/* add a parameter here */) {
        int sum = 0;
        if (x < 0 || y < 0) {/* modify the condition here */
            return 0;
        }
        /* calculate the summation here */
        sum = x+y;
        return sum;
    }

    public static void main(String[] args) {
        int x, y;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter integer 1:");
        x = input.nextInt();
        System.out.print("Enter integer 2:");
        y = input.nextInt();
        System.out.println(labMethodQ1(x,y));
        input.close();
    }
}