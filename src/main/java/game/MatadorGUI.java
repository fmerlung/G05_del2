import gui_fields.*;

import java.awt.*;

public class MatadorGUI {

    public static void main(String[] args) {
        GUI_Field[] fields = new GUI_Field[12];

        GUI_Start start = new GUI_Start();
        start.setTitle("Start");
        fields[0] = start;

        GUI_Street felt2 = new GUI_Street();
        felt2.setTitle("Felt 2");
        felt2.setSubText("Info");
        felt2.setBackGroundColor(Color.WHITE);
        fields[1] = felt2;

        GUI_Street felt3 = new GUI_Street();
        felt3.setTitle("Felt 3");
        felt3.setSubText("Info");
        felt3.setBackGroundColor(Color.WHITE);
        fields[2] = felt3;


        GUI_Street felt4 = new GUI_Street();
        felt4.setTitle("Felt 4");
        felt4.setSubText("Info");
        felt4.setBackGroundColor(Color.WHITE);
        fields[3] = felt4;

        GUI_Street felt5 = new GUI_Street();
        felt5.setTitle("Felt 5");
        felt5.setSubText("Info");
        felt5.setBackGroundColor(Color.WHITE);
        fields[4] = felt5;

        GUI_Street felt6 = new GUI_Street();
        felt6.setTitle("Felt 6");
        felt6.setSubText("Info");
        felt6.setBackGroundColor(Color.WHITE);
        fields[5] = felt6;

        GUI_Street felt7 = new GUI_Street();
        felt7.setTitle("Felt 7");
        felt7.setSubText("Info");
        felt7.setBackGroundColor(Color.WHITE);
        fields[6] = felt7;

        GUI_Street felt8 = new GUI_Street();
        felt8.setTitle("Felt 8");
        felt8.setSubText("Info");
        felt8.setBackGroundColor(Color.WHITE);
        fields[7] = felt8;

        GUI_Street felt9 = new GUI_Street();
        felt9.setTitle("Felt 9");
        felt9.setSubText("Info");
        felt9.setBackGroundColor(Color.WHITE);
        fields[8] = felt9;

        GUI_Street felt10 = new GUI_Street();
        felt10.setTitle("Felt 10");
        felt10.setSubText("Info");
        felt10.setBackGroundColor(Color.WHITE);
        fields[9] = felt10;

        GUI_Street felt11 = new GUI_Street();
        felt11.setTitle("Felt 11");
        felt11.setSubText("Info");
        felt11.setBackGroundColor(Color.WHITE);
        fields[10] = felt11;

        GUI_Street felt12 = new GUI_Street();
        felt12.setTitle("Felt 12");
        felt12.setSubText("Info");
        felt12.setBackGroundColor(Color.WHITE);
        fields[11] = felt12;

        GUI_Car car1 = new GUI_Car();
        car1.setPrimaryColor(Color.YELLOW);
        GUI_Car car2 = new GUI_Car();
        car2.setPrimaryColor(Color.RED);

        GUI_Player player1 = new GUI_Player("Player 1",999, car1);
        GUI_Player player2 = new GUI_Player("Player 2",1499, car2);

        gui_main.GUI gui = new gui_main.GUI(fields, Color.WHITE);
        gui.addPlayer(player1);
        gui.addPlayer(player2);

        fields[0].setCar(player1, true);
        fields[0].setCar(player2, true);

        gui.setDice(1, 3);
    }
}