package game;

import java.util.Scanner;

public class Game
{
    private Player player1;
    private Player player2;
    private Die die;
    GameController controller;
    public Game()
    {
        die = new Die();
        player1 = new Player();
        player2 = new Player();
        controller = new GameController(die, player1, player2);
    }
    public void run()
    {
        initialize();
        controller.startGameLoop();
    }

    public void initialize()
    {
        printWelcomeMessage();
        getPlayerNames();
        controller.startGameLoop();
    }

    private void getPlayerNames()
    {
        System.out.println("Please input name of player 1:\n");
        Scanner scan = new Scanner(System.in);
        this.player1.setName(scan.nextLine());
        System.out.println();

        System.out.println("Please input name of player 1:\n");
        this.player2.setName(scan.nextLine());
        System.out.println();
    }

    private void printWelcomeMessage()
    {
        System.out.println("Welcome to the game!");
    }
}
