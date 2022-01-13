import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//instantiating Scanner method
        Random random = new Random();//instantiating Random method for cpu
        boolean game = true;
        //Score set @ 0 to begin game
        int userScore = 0;
        int cpuScore = 0;
        User player1 = new User();
        //player1.userScore();
        Computer cpu = new Computer();


        while (game) {//Infinite while loop

            System.out.println("Enter 1 for Rock, 2 for Paper, and 3 for Scissors, or 4 to quit the game");
            int userChoice = scan.nextInt();
            player1.setChoice(userChoice);
            //int cpuChoice = random.nextInt(3) + 1;//Iterates the computer choice at random
            cpu.setCpuChoice(random.nextInt(3) + 1);
            if (player1.playerChoice() == cpu.getCpuChoice()) {//Testing all possible outcomes with if/else if loops
                System.out.println("It's a tie!");
            } else if (userChoice == 1) {//logic for user as rock
                if (cpu.getCpuChoice() == 2) {
                    System.out.println("Computer chose paper, you have lost");
                    cpuScore++;
                    System.out.printf("Computer score: %d\n User score: %d\n", cpuScore, userScore);//Keeps score and using printf as placeholders
                } else if (cpu.getCpuChoice() == 3) {
                    System.out.println("Computer chose scissors, you have won!");
                    userScore++;
                    player1.setUserScore(userScore);
                    System.out.printf("Computer score: %d\n User score: %d\n", cpuScore, player1.userScore());
                }
            } else if (player1.playerChoice() == 2) {//logic for user as paper
                if (cpu.getCpuChoice() == 3) {
                    System.out.println("Computer chose scissors, you have lost");
                    cpuScore++;
                    System.out.printf("Computer score: %d\n User score: %d\n", cpuScore, userScore);
                } else if (cpu.getCpuChoice() == 1) {
                    System.out.println("Computer chose rock, you have won!");
                    userScore++;
                    System.out.printf("Computer score: %d\n User score: %d\n", cpuScore, userScore);
                } else if (player1.playerChoice() == 3) {//logic for user as scissors
                    if (cpu.getCpuChoice() == 1) {
                        System.out.println("Computer chose rock, you have lost");
                        cpuScore++;
                        System.out.printf("Computer score: %d\n User score: %d\n", cpuScore, userScore);
                    } else if (cpu.getCpuChoice() == 2) {
                        System.out.println("Computer chose paper, you have won!");
                        userScore++;
                        System.out.printf("Computer score: %d\n User score: %d\n", cpuScore, userScore);
                    }
                }
            } else if (player1.playerChoice() == 4) {
                System.out.println("You chose not to play, too much homework for play time!");
                break;
            }

        }
    }
}
