import javax.swing.*;
import java.util.Scanner;

import static com.sun.xml.internal.bind.v2.schemagen.Util.equalsIgnoreCase;

public class RPS
{
    public static void main(String[] args)
    {
        //variable declaration
        Scanner in = new Scanner(System.in);
        String playerA = "";
        String playerB = "";
        String trash = "";
        String continueGame = "";
        boolean done = false;
        boolean legalMoves = false;

        System.out.println("Welcome to Rock Paper Scissors! Here are the rules:\nPlayer A and Player B will choose what move they want to make from Rock, Paper, or Scissors [RPS].\nRock breaks Scissors, Scissors cuts Paper, and Paper covers Rock!");
        do {
            System.out.println("Sounds Easy enough? Let's begin then!");
            do {
                System.out.print("Player A make your move! [RPS]:");
                playerA = in.nextLine();
                //player A choice Rock, all possible outcomes
                if (playerA.equalsIgnoreCase("R"))
                {
                    do {
                        System.out.print("Player B make your move! [RPS]:");
                        playerB = in.nextLine();
                        if (playerB.equalsIgnoreCase("R")) {
                            System.out.println("Rock vs Rock! Its a tie!");
                            legalMoves = true;
                        } else if (playerB.equalsIgnoreCase("P")) {
                            System.out.println("Paper covers Rock! Player B wins!");
                            legalMoves = true;
                        } else if (playerB.equalsIgnoreCase("S")) {
                            System.out.println("Rock breaks Scissors! Player A wins!");
                            legalMoves = true;
                        } else {
                            System.out.println("You entered an Illegal move! " + playerB);
                        }
                    }while (!legalMoves);
                }
                //Player A choice Paper, all possible outcomes
                else if (playerA.equalsIgnoreCase("P"))
                {
                    do {
                        System.out.print("Player B make your move! [RPS]:");
                        playerB = in.nextLine();
                        if (playerB.equalsIgnoreCase("P")) {
                            System.out.println("Paper vs Paper! Its a tie!");
                            legalMoves = true;
                        } else if (playerB.equalsIgnoreCase("R")) {
                            System.out.println("Paper covers Rock! Player A wins!");
                            legalMoves = true;
                        } else if (playerB.equalsIgnoreCase("S")) {
                            System.out.println("Scissors cuts Paper! Player B wins!");
                            legalMoves = true;
                        } else if ((!playerB.equalsIgnoreCase("R") && !playerB.equalsIgnoreCase("P") && !playerB.equalsIgnoreCase("S"))) {
                            System.out.println("You entered an Illegal move! " + playerB);
                            in.nextLine();
                        }
                    }while (!legalMoves);
                }
                //player A choice Scissors, all possible outcomes
                else if (playerA.equalsIgnoreCase("S"))
                {
                    do {
                        System.out.print("Player B make your move! [RPS]:");
                        playerB = in.nextLine();
                        if (playerB.equalsIgnoreCase("S")) {
                            System.out.println("Scissors vs Scissors! Its a tie!");
                            legalMoves = true;
                        } else if (playerB.equalsIgnoreCase("P")) {
                            System.out.println("Scissors cuts Paper! Player A wins!");
                            legalMoves = true;
                        } else if (playerB.equalsIgnoreCase("R")) {
                            System.out.println("Rock breaks Scissors! Player B wins!");
                            legalMoves = true;
                        } else {
                            System.out.println("You entered an Illegal move! " + playerB);
                            in.nextLine();
                        }
                    }while (!legalMoves);
                }
                //illegal move
                else
                {
                    System.out.println("You entered an Illegal move: " + playerA);
                }
            }while (!legalMoves);

            //statements prompting the user if they want to play again
            System.out.print("Would you like to play again? [Y/N]:");
            continueGame = in.nextLine();
            //end game if they choose no
            if (continueGame.equalsIgnoreCase("N"))
            {
                done = true;
            }//continue game if they choose yes
            else if (continueGame.equalsIgnoreCase("Y"))
            {
                done = false;
            }

        }while (!done);
        System.out.println("Thanks for playing!");













    }
}