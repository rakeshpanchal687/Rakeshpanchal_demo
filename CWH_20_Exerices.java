
import java.util.Random;
import java.util.Scanner;
public class CWH_20_Exerices {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();

            String[] options = {"Rock", "Paper", "Scissors"};

            while (true) {
                System.out.println("Enter your choice (Rock, Paper, Scissors) or 'exit' to end the game:");
                String userChoice = scanner.nextLine().toLowerCase();

                if (userChoice.equals("exit")) {
                    System.out.println("Thanks for playing. Exiting the game.");
                    break;
                }

                if (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
                    System.out.println("Invalid choice. Please enter Rock, Paper, or Scissors.");
                    continue;
                }

                int computerIndex = random.nextInt(3);
                String computerChoice = options[computerIndex];

                System.out.println("Computer's choice: " + computerChoice);

                determineWinner(userChoice, computerChoice);
            }

            scanner.close();
        }

        private static void determineWinner(String userChoice, String computerChoice) {
            if (userChoice.equals(computerChoice)) {
                System.out.println("It's a tie!");
            } else if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                    (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                    (userChoice.equals("scissors") && computerChoice.equals("paper"))) {
                System.out.println("You win!");
            } else{
                System.out.println("Computer wins!");
            }
        }
}

