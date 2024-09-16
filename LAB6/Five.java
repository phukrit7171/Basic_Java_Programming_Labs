
import java.util.Scanner;
import java.util.Arrays;


public class Five {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int[] numbers = { 1, 5, 9, 11, 12, 13, 14, 15, 19, 22 };
        int addNum = Integer.parseInt(input.nextLine());
        numbers[9] = addNum;
        System.out.println(Arrays.toString(sortArray(numbers)));
        input.close();

    }
    static int[] sortArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] < numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        return numbers;
    }
}
