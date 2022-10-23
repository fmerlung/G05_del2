package game;

import java.util.Scanner;

public class GameController
{
    private Die die;
    private Player player1;
    private Player player2;

    public GameController(Die die, Player player1, Player player2)
    {
        this.die = die;
        this.player1 = player1;
        this.player2 = player2;
    }

    public void startGameLoop()
    {
        int currentPlayer = 1;
        int currentDiceRoll = 0;
        while(true)
        {
            startRound(currentPlayer);
            currentDiceRoll = rollDice();
            updatePlayerBalance();
            // print field flavour text
            // evaluate game progress
            updateCurrentPlayer(currentPlayer);
        }
    }

    private void updatePlayerBalance()
    {
    }

    private void startRound(int currentPlayer)
    {
        while (true)
        {
            System.out.print("Player " + currentPlayer + ", please press 'Enter' to roll dice.");
            Scanner scan = new Scanner(System.in);
            String input = scan.next();
            if (input == "") break;
        }
    }

    private int updateCurrentPlayer(int currentPlayer)
    {
        if (currentPlayer < Player.numberOfPlayers)
        {
            currentPlayer += 1;
        }
        else
        {
            currentPlayer = 1;
        }
    }

    private int rollDice()
    {
        return this.die.roll() + this.die.roll();
    }
}
