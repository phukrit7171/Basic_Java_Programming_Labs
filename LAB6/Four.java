import java.util.Scanner;

public class Four {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        String[] names = new String[5];
        int[] heights = new int[5];
        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = input.nextLine();
            System.out.print("Enter height " + (i + 1) + ": ");
            heights[i] = Integer.parseInt(input.nextLine());
        }
        System.out.println(findTallestStudent(names, heights));
    }

    private static String findTallestStudent(String[] names, int[] heights){
        int max = 0;
        int index = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] > max)
            {
                max = heights[i];
                index = i;
            }
        }
        return names[index] + " is the tallest student with height " + max;
    }
}
