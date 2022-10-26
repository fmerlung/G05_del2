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
        this.gui = new gui_main.GUI(fields, Color.WHITE);
        this.car1 = new GUI_Car();
        this.car1.setPrimaryColor(Color.YELLOW);
        this.car2 = new GUI_Car();
        this.car2.setPrimaryColor(Color.RED);
        this.player1 = new GUI_Player("Player 1",1000, this.car1);
        this.player2 = new GUI_Player("Player 2",1000, this.car2);
        this.fields = new GUI_Field[12];
    }

    public void SetFieldInformation() {

        GUI_Start start = new GUI_Start();
        start.setTitle("Start");
        fields[0] = start;

        GUI_Street felt2 = new GUI_Street();
        felt2.setTitle(Board.getFieldName(2));
        felt2.setSubText(Board.getFieldDescription(2));
        felt2.setBackGroundColor(Color.WHITE);
        fields[1] = felt2;

        GUI_Street felt3 = new GUI_Street();
        felt3.setTitle(Board.getFieldName(3));
        felt3.setSubText(Board.getFieldDescription(3));
        felt3.setBackGroundColor(Color.WHITE);
        fields[2] = felt3;

        GUI_Street felt4 = new GUI_Street();
        felt4.setTitle(Board.getFieldName(4));
        felt4.setSubText(Board.getFieldDescription(4));
        felt4.setBackGroundColor(Color.WHITE);
        fields[3] = felt4;

        GUI_Street felt5 = new GUI_Street();
        felt5.setTitle(Board.getFieldDescription(5));
        felt5.setSubText(Board.getFieldDescription(5));
        felt5.setBackGroundColor(Color.WHITE);
        fields[4] = felt5;

        GUI_Street felt6 = new GUI_Street();
        felt6.setTitle(Board.getFieldDescription(6));
        felt6.setSubText(Board.getFieldDescription(6));
        felt6.setBackGroundColor(Color.WHITE);
        fields[5] = felt6;

        GUI_Street felt7 = new GUI_Street();
        felt7.setTitle(Board.getFieldDescription(7));
        felt7.setSubText(Board.getFieldDescription(7));
        felt7.setBackGroundColor(Color.WHITE);
        fields[6] = felt7;

        GUI_Street felt8 = new GUI_Street();
        felt8.setTitle(Board.getFieldDescription(8));
        felt8.setSubText(Board.getFieldDescription(8));
        felt8.setBackGroundColor(Color.WHITE);
        fields[7] = felt8;

        GUI_Street felt9 = new GUI_Street();
        felt9.setTitle(Board.getFieldDescription(9));
        felt9.setSubText(Board.getFieldDescription(9));
        felt9.setBackGroundColor(Color.WHITE);
        fields[8] = felt9;

        GUI_Street felt10 = new GUI_Street();
        felt10.setTitle(Board.getFieldDescription(10));
        felt10.setSubText(Board.getFieldDescription(10));
        felt10.setBackGroundColor(Color.WHITE);
        fields[9] = felt10;

        GUI_Street felt11 = new GUI_Street();
        felt11.setTitle(Board.getFieldDescription(11));
        felt11.setSubText(Board.getFieldDescription(11));
        felt11.setBackGroundColor(Color.WHITE);
        fields[10] = felt11;

        GUI_Street felt12 = new GUI_Street();
        felt12.setTitle(Board.getFieldDescription(12));
        felt12.setSubText(Board.getFieldDescription(12));
        felt12.setBackGroundColor(Color.WHITE);
        fields[11] = felt12;
    }
    
    public void ChangePlayerBalance(int balance) {
        this.player1.setBalance(balance);
        this.player2.setBalance(balance);
    }
    
    public void DisplayDieRoll(int DieRoll) {
        gui.setDice(DieRoll, DieRoll);
    }
    
    public void AddPlayerToBoard() {
        gui.addPlayer(player1);
        gui.addPlayer(player2);

        gui.showMessage("Klik start");
        boolean selection = gui.getUserLeftButtonPressed("vælg Ja eller nej", "Ja", "Nej");
    }

    public void MoveCarToField(int die){
        fields[die-1].setCar(player1, true);
        fields[die-1].setCar(player2, true);
    }
}