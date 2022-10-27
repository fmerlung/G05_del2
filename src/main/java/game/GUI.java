package game;

import gui_fields.*;

import java.awt.*;

public class GUI {
    private gui_main.GUI gui;
    private GUI_Car car1;
    private GUI_Car car2;
    private GUI_Player player1;
    private GUI_Player player2;
    private GUI_Field[] fields;
    public GUI(){
        this.fields = new GUI_Field[12];
        SetFieldInformation();
        this.gui = new gui_main.GUI(fields, Color.WHITE);
        this.car1 = new GUI_Car();
        this.car1.setPrimaryColor(Color.YELLOW);
        this.car2 = new GUI_Car();
        this.car2.setPrimaryColor(Color.RED);
        this.player1 = new GUI_Player("Player 1",1000, this.car1);
        this.player2 = new GUI_Player("Player 2",1000, this.car2);
    }

    public void SetFieldInformation() {

        GUI_Start start = new GUI_Start();
        start.setTitle("Start");
        fields[0] = start;

        GUI_Street felt2 = new GUI_Street();
        felt2.setTitle(Board.getFieldName(2));
        felt2.setDescription(Board.getFieldDescription(2));
        felt2.setSubText(Integer.toString(Board.getBalanceChange(2)));
        felt2.setBackGroundColor(Color.WHITE);
        fields[1] = felt2;

        GUI_Street felt3 = new GUI_Street();
        felt3.setTitle(Board.getFieldName(3));
        felt3.setDescription(Board.getFieldDescription(3));
        felt3.setSubText(Integer.toString(Board.getBalanceChange(3)));
        felt3.setBackGroundColor(Color.WHITE);
        fields[2] = felt3;

        GUI_Street felt4 = new GUI_Street();
        felt4.setTitle(Board.getFieldName(4));
        felt4.setDescription(Board.getFieldDescription(4));
        felt4.setSubText(Integer.toString(Board.getBalanceChange(4)));
        felt4.setBackGroundColor(Color.WHITE);
        fields[3] = felt4;

        GUI_Street felt5 = new GUI_Street();
        felt5.setTitle(Board.getFieldName(5));
        felt5.setDescription(Board.getFieldDescription(5));
        felt5.setSubText(Integer.toString(Board.getBalanceChange(5)));
        felt5.setBackGroundColor(Color.WHITE);
        fields[4] = felt5;

        GUI_Street felt6 = new GUI_Street();
        felt6.setTitle(Board.getFieldName(6));
        felt6.setDescription(Board.getFieldDescription(6));
        felt6.setSubText(Integer.toString(Board.getBalanceChange(6)));
        felt6.setBackGroundColor(Color.WHITE);
        fields[5] = felt6;

        GUI_Street felt7 = new GUI_Street();
        felt7.setTitle(Board.getFieldName(7));
        felt7.setDescription(Board.getFieldDescription(7));
        felt7.setSubText(Integer.toString(Board.getBalanceChange(7)));
        felt7.setBackGroundColor(Color.WHITE);
        fields[6] = felt7;

        GUI_Street felt8 = new GUI_Street();
        felt8.setTitle(Board.getFieldName(8));
        felt8.setDescription(Board.getFieldDescription(8));
        felt8.setSubText(Integer.toString(Board.getBalanceChange(8)));
        felt8.setBackGroundColor(Color.WHITE);
        fields[7] = felt8;

        GUI_Street felt9 = new GUI_Street();
        felt9.setTitle(Board.getFieldName(9));
        felt9.setDescription(Board.getFieldDescription(9));
        felt9.setSubText(Integer.toString(Board.getBalanceChange(9)));
        felt9.setBackGroundColor(Color.WHITE);
        fields[8] = felt9;

        GUI_Street felt10 = new GUI_Street();
        felt10.setTitle(Board.getFieldName(10));
        felt10.setDescription(Board.getFieldDescription(10));
        felt10.setSubText(Integer.toString(Board.getBalanceChange(10))+", "+Board.getFieldEffect(10));
        felt10.setBackGroundColor(Color.WHITE);
        fields[9] = felt10;

        GUI_Street felt11 = new GUI_Street();
        felt11.setTitle(Board.getFieldName(11));
        felt11.setDescription(Board.getFieldDescription(11));
        felt11.setSubText(Integer.toString(Board.getBalanceChange(11)));
        felt11.setBackGroundColor(Color.WHITE);
        fields[10] = felt11;

        GUI_Street felt12 = new GUI_Street();
        felt12.setTitle(Board.getFieldName(12));
        felt12.setDescription(Board.getFieldDescription(12));
        felt12.setSubText(Integer.toString(Board.getBalanceChange(12)));
        felt12.setBackGroundColor(Color.WHITE);
        fields[11] = felt12;
    }
    
    public void DisplayPlayerBalance(int balance1, int balance2) {
        this.player1.setBalance(balance1);
        this.player2.setBalance(balance2);
    }
    
    public void DisplayDieRoll(int DieRoll1, int DieRoll2) {
        gui.setDice(DieRoll1, DieRoll2);
    }
    
    public void AddPlayerToBoard() {
        gui.addPlayer(player1);
        gui.addPlayer(player2);


    }

    public void MoveCarToField(int dieRoll1, int dieRoll2, Player currentPlayer){
        if(currentPlayer.getTurnOrderId() ==1) {
            // Moves player 1 to current location
            for(int i = 0; i < 12; ++i){
                fields[i].setCar(player1,false);
            }
            fields[dieRoll1 + dieRoll2 - 1].setCar(player1, true);

            // Moves player 2 back to start
            for(int i = 0; i < 12; ++i){
                fields[i].setCar(player2,false);
            }
            fields[0].setCar(player2, true);
        }
        else
        {
            // Moves player 2 to current location
            for(int i = 0; i < 12; ++i){
                fields[i].setCar(player2,false);
            }
            fields[dieRoll1 + dieRoll2 - 1].setCar(player2, true);

            // Moves player 1 back to start
            for(int i = 0; i < 12; ++i){
                fields[i].setCar(player1,false);
            }
            fields[0].setCar(player1, true);
        }
    }

    public void moveCarsToStart(){
        fields[0].setCar(player1, true);
        fields[0].setCar(player2, true);
    }

    public void displayDiceButton()
    {
        gui.getUserButtonPressed("","Throw dice!").equals("Throw dice!");
    }

    public void displayWinner(Player currentPlayer){
        if(currentPlayer.getTurnOrderId() ==1) {
            gui.showMessage("Player 1 wins!");
        }
        else
        {
            gui.showMessage("Player 2 wins!");
        }
    }
}