public class Player {

    private String name;
    private int balance;

    public Player() // Vores construktor
    {
        balance = 1000;
    }

    public getBalance(){
        return(balance);
    }

    public changeBalance(int balanceChange){
        balance += balanceChange;
    }

    public int rollDice(Die die1, Die die2)
    {
        return die1.roll()+die2.roll();
    }
}
