public class Player {
    private int balance;

    public Player() // Vores construktor
    {
        balance = 1000;
    }

    public int getBalance(){
        return(balance);
    }

    public void changeBalance(int balanceChange){
        balance += balanceChange;

        if(balance<0){
            balance = 0;
        }
    }
}
