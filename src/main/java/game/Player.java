public class Player {
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
}
