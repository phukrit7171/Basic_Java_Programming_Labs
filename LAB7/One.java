import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] a = new int[5][4];
        for (int row = 0; row < a.length; row++) {
            for (int col = 0; col < a[row].length; col++) {
                System.out.print("Enter the value of a[" + row + "][" + col + "]:");
                a[row][col] = input.nextInt();
            }

        }

        for (int row = 0; row < a.length; row++) {
            for (int col = 0; col < a[0].length; col++) {
                // print values with space
                System.out.print(a[row][col] + " ");
            }
            // a newline for the next row
            System.out.println();
        }
        input.close();
    }
}

/*
 * What do you get from a.length, a[row].length, and a[0].length?
 * a.length รับค่าความกว้าง Array มิติที่ 1 (จำนวนแถว) ,a[row].length รับค่าความกว้าง Array (จำนวนคอลลัม) มิติที่ 2 ในแถวนั้นๆ , a[0].length รับค่าความกว้าง Array (จำนวนคอลลัม) มิติที่ 2 ในแถวแรก
 * 
 * Is a[row].length always equal to a[0].length ? 
 * ใช่ ถ้าเป็น Array ปกติที่ไม่ใช่ ArrayList
 */

 