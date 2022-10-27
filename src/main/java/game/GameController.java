package game;

import java.util.Scanner;

public class GameController
{
    private Die die1;
    private Die die2;
    private int currentDiceRoll;
    private Player player1;
    private Player player2;
    private Player currentPlayer;
    private GUI gui;

    public GameController(Die die1, Die die2, Player player1, Player player2)
    {
        this.die1 = die1;
        this.die2 = die2;
        this.player1 = player1;
        this.player1.setTurnOrderId(1);
        this.player2 = player2;
        this.player2.setTurnOrderId(2);
        this.currentDiceRoll = 0;
        this.currentPlayer = this.player1;
        this.gui = new GUI();
    }

    public void startGameLoop()
    {

        gui.AddPlayerToBoard();

        while(true)
        {
            gui.displayDiceButton();
            rollDice();
            gui.DisplayDieRoll(die1.getFaceValue(),die2.getFaceValue());
            printFieldDescription();
            updatePlayerBalance();
            gui.DisplayPlayerBalance(player1.getBalance(),player2.getBalance());
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
        System.out.println("Congratulations player " + this.currentPlayer.getTurnOrderId() + ", you won with " + this.currentPlayer.getBalance() + " points!");
        System.out.println("Thanks for playing!");
        System.exit(0);
    }

    private void printFieldDescription()
    {
        System.out.println(Board.getFieldDescription(this.currentDiceRoll));
    }

    private void updatePlayerBalance()
    {
        this.currentPlayer.changeBalance(this.currentPlayer.getBalance() + Board.getBalanceChange(this.currentDiceRoll));
    }

    private void updateCurrentPlayer()
    {
        if (this.currentPlayer.getTurnOrderId() == 1)
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
        this.currentDiceRoll = this.die1.roll() + this.die2.roll();
    }
}
