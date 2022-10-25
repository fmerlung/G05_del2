package game;

import java.util.Scanner;

public class GameController
{
    private Die die;
    private int currentDiceRoll;
    private Player player1;
    private Player player2;
    private Player currentPlayer;

    public GameController(Die die, Player player1, Player player2)
    {
        this.die = die;
        this.player1 = player1;
        this.player2 = player2;
        this.currentDiceRoll = 0;
        this.currentPlayer = this.player1;
    }

    public void startGameLoop()
    {
        while(true)
        {
            requestInputToStart();
            rollDice();
            printFieldDescription();
            updatePlayerBalance();
            evaluateGameProgress();
            printScore();
            updateCurrentPlayer();
        }
    }

    private void printScore()
    {
        System.out.println("Current balance: \n" +
                           "Player 1: " + this.player1.getBalance() + "\n" +
                           "Player 2: " + this.player2.getBalance());
    }

    private void evaluateGameProgress()
    {
        if (this.currentPlayer.getBalance() == 0)
        {
            printWinnerAndExit();
        }
    }

    private void printWinnerAndExit()
    {
        updateCurrentPlayer();
        System.out.println("Congratulations player " + this.currentPlayer.id + ", you won with " + this.currentPlayer.getBalance() + " points!");
        System.out.println("Thanks for playing!");
        System.exit(0);
    }

    private void printFieldDescription()
    {
        System.out.println(Board.getFieldDescription(this.currentDiceRoll));
    }

    private void updatePlayerBalance()
    {
        this.currentPlayer.setBalance(this.currentPlayer.getBalance() + Board.getBalanceChange(this.currentDiceRoll));
    }

    private void requestInputToStart()
    {
        while (true)
        {
            System.out.print("Player " + this.currentPlayer.id + ", please press 'Enter' to roll dice.");
            Scanner scan = new Scanner(System.in);
            String input = scan.nextLine();
            if (input == "") break;
        }
    }

    private void updateCurrentPlayer()
    {
        if (this.currentPlayer.id = 1)
        {
            this.currentPlayer = this.player2;
        }
        else
        {
            this.currentPlayer = this.player1;
        }
    }

    private void rollDice()
    {
        this.currentDiceRoll = this.die.roll() + this.die.roll();
    }
}