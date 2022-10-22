package game;

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
        int currentDiceRoll = 0;
        while(true)
        {
            // get current player
            // get input from player to continue
            currentDiceRoll = rollDice();
            // get field balance change
            // print field flavour text
            // evaluate game progress
            // update current player
        }
    }

    private int rollDice()
    {
        return this.die.roll() + this.die.roll();
    }
}
