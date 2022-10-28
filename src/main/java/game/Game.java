package game;

public class Game
{
    private Player player1;
    private Player player2;
    private Die die1;
    private Die die2;
    GameController controller;
    public Game()
    {
        die1 = new Die();
        die2 = new Die();

        player1 = new Player();
        player2 = new Player();
        controller = new GameController(die1, die2, player1, player2);
    }
    public void run()
    {
        controller.startGameLoop();
    }
}
