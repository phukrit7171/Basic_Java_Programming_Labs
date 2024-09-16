import java.util.Scanner;
import java.util.ArrayList;

public class Six {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        while (true) {
            try {
                System.out.print("Enter number: ");
                numbers.add(Integer.parseInt(input.nextLine()));
            } catch (Exception e) {
                System.out.println("Exit program.");
                break;
            }
        }

        for (int i = 0; i < numbers.size(); i++) {
            for (int j = i + 1; j < numbers.size(); j++) {
                if (numbers.get(i) < numbers.get(j)) {
                    int temp = numbers.get(i);
                    numbers.set(i, numbers.get(j));
                    numbers.set(j, temp);
                }
            }
        }
        System.out.println(numbers);
        input.close();
    }
}
