import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] array = new double[15];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            array[i] = Double.parseDouble(input.nextLine());
        }
        System.out.print("Enter index to replace: ");
        int index = Integer.parseInt(input.nextLine());
        System.out.print("Enter replace number: ");
        double replace = Double.parseDouble(input.nextLine());
        System.out.println("Before replace:");
        printArray(array);
        array[index] = replace;
        System.out.println("After replace:");
        printArray(array);

        input.close();
    }
    static void printArray(double[] array){
        System.out.print("{ ");
        for (double i : array) {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.print("}\n");
       
    }
    
}
