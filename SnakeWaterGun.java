import java.util.Scanner;
import java.util.Random;

class SnakeWaterGun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int computerWins = 0;
        int userWins = 0;
        int attempts = 0;

        while (attempts < 5) {
            int computer = random.nextInt(-1, 2);

            System.out.print("What is your choice [Snake, Water, Gun]>> ");
            String user = sc.next();

            int u;
            String c;

            if (computer == -1) {
                c = "water";
            } else if (computer == 0) {
                c = "gun";
            } else {
                c = "snake";
            }

            if (user.equalsIgnoreCase("snake")) {
                u = 1;
            } else if (user.equalsIgnoreCase("water")) {
                u = -1;
            } else if (user.equalsIgnoreCase("gun")) {
                u = 0;
            } else {
                System.out.println("Invalid Input!!");
                continue;
            }

            switch (computer - u) {
                case 0 -> {
                    System.out.printf("Computer chose %s and you chose %s%n", c, user);
                    System.out.println("It's a tie!!");
                    attempts++;
                }

                case -1, 2 -> {
                    System.out.printf("Computer chose %s and you chose %s%n", c, user);
                    System.out.println("You Won!!");
                    attempts++;
                    userWins++;
                }

                case -2, 1 -> {
                    System.out.printf("Computer chose %s and you chose %s%n", c, user);
                    System.out.println("You Lose!!");
                    attempts++;
                    computerWins++;
                }
            }

            System.out.printf("Attempts: %d out of 5%n", attempts);
        }

        if (computerWins == userWins) {
            System.out.println("Final Result: It's a tie");
        } else if (computerWins > userWins) {
            System.out.println("Final Result: You lose");
        } else {
            System.out.println("Final Result: You won");
        }

        sc.close();
    }
}
