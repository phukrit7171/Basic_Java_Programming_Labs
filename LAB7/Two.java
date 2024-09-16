import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int student = 2;
        String[] name = new String[student]; 
        int[][] data = new int[student][2];

        for(int row = 0; row < data.length; row++) {
            System.out.print("Enter the name of student " + (row+1) + ": ");
            name[row] = input.nextLine();
            for(int col = 0; col < data[row].length; col++) {
               System.out.print("Enter "+ ((col == 0)? "height" : "weight")+" of " + name[row] + ": ");
               data[row][col] = Integer.parseInt(input.nextLine());
            }
        }
        for(int row = 0; row < data.length; row++) {
            System.out.print(name[row] + " : ");
            for(int col = 0; col < data[row].length; col++) {
                System.out.print(data[row][col] + " ");
            }
            System.out.println();
        }
       

        input.close();
    }
}
