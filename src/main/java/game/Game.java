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
        controller.startGameLoop();
    }
}
