import java.util.Scanner;

public class StickGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stick1 = 1, stick2 = 1, stick3 = 1, stick4 = 1, stick5 = 1;
        int currentPlayer = 1;
        int rounds = 0;
        int player1Sticks = 0;
        int player2Sticks = 0;
        boolean gameOver = false;

        while (!gameOver) {
            // Display sticks
            System.out.println("Sticks on the table");
            System.out.println("1: " + (stick1 == 1 ? "------" : ""));
            System.out.println("2: " + (stick2 == 1 ? "------" : ""));
            System.out.println("3: " + (stick3 == 1 ? "------" : ""));
            System.out.println("4: " + (stick4 == 1 ? "------" : ""));
            System.out.println("5: " + (stick5 == 1 ? "------" : ""));

            // Player's turn
            System.out.println("The " + currentPlayer + " player turn");
            System.out.print("Please choose the stick number: ");
            int choice = scanner.nextInt();

            // Check if the choice is valid
            if (choice < 1 || choice > 5 || 
                (choice == 1 && stick1 == 0) || 
                (choice == 2 && stick2 == 0) || 
                (choice == 3 && stick3 == 0) || 
                (choice == 4 && stick4 == 0) || 
                (choice == 5 && stick5 == 0)) {
                System.out.println("Error you entered the wrong number. Please enter again");
                continue;
            }

            // Remove the chosen stick
            if (choice == 1) stick1 = 0;
            if (choice == 2) stick2 = 0;
            if (choice == 3) stick3 = 0;
            if (choice == 4) stick4 = 0;
            if (choice == 5) stick5 = 0;

            // Update player's stick count
            if (currentPlayer == 1) {
                player1Sticks++;
            } else {
                player2Sticks++;
            }

            rounds++;

            // Check for game over conditions
            if (choice == 3 || player1Sticks + player2Sticks == 5) {
                int winner = (choice == 3) ? 3 - currentPlayer : currentPlayer;
                int loser = 3 - winner;
                System.out.println("The winner is player " + winner);
                System.out.println("The loser is player " + loser);
                System.out.println("The total rounds " + rounds);
                System.out.println("player 1 picked " + player1Sticks + " stick(s)");
                System.out.println("player 2 picked " + player2Sticks + " stick(s)");
                gameOver = true;
            }
            

            // Switch player
            currentPlayer = 3 - currentPlayer;
        }

        scanner.close();
    }
}