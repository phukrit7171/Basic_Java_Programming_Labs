import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum_all = 0;
        int sum_each_row[] = new int[2];
        int sum_each_col[] = new int[8];
        int table[][] = new int[2][8];

        for (int row = 0; row < table.length; row++) {
            for (int col = 0; col < table[row].length; col++) {
                System.out.print("Enter the value of row " + row + " and column " + col + " : ");
                table[row][col] = Integer.parseInt(input.nextLine());
            }
        }

        for (int row = 0; row < table.length; row++) {
            for (int col = 0; col < table[row].length; col++) {
                sum_each_row[row] += table[row][col];
                sum_each_col[col] += table[row][col];
                sum_all += table[row][col];
            }
        }

        for (int row = 0; row < table.length; row++) {
            for (int col = 0; col < table[row].length; col++) {
                System.out.print(table[row][col] + " ");
            }
            System.out.println("| " + sum_each_row[row]);

        }

        System.out.print("------------------------------");

        System.out.println();
        for (int col : sum_each_col) {
            System.out.print(col + " ");
        }
        System.out.println("| " + sum_all);

        input.close();
    }
}
