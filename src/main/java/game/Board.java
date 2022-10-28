package game;

public class Board {

    public static String getFieldName(int roll) {
        String name = null;
        switch (roll) {
            case 2:
                name = "2. Tower: ";
                break;
            case 3:
                name = "3. Crater: ";
                break;
            case 4:
                name = "4. Palace Gates: ";
                break;
            case 5:
                name = "5. Cold Desert: ";
                break;
            case 6:
                name = "6. Walled City: ";
                break;
            case 7:
                name = "7. Monastery: ";
                break;
            case 8:
                name = "8. Black cave: ";
                break;
            case 9:
                name = "9. Huts in the mountain: ";
                break;
            case 10:
                name = "10. The Werewall: ";
                break;
            case 11:
                name = "11. The Pit: ";
                break;
            case 12:
                name = "12. Goldmine: ";
                break;
        }
        return name;
    }

    public static String getFieldDescription(int roll) {
        String description = null;
        switch (roll) {
            case 2:
                description = "You reached a tower and \nsaved a princess. She \nrewards you with \n250 goldpieces!";
                break;
            case 3:
                description = "You fell down a crater. A stranger offers to help you up. You have to pay him 100 goldpieces…";
                break;
            case 4:
                description = "You find yourself at some palace gates, a guard pays you to walk away. You receive 100 goldpieces!";
                break;
            case 5:
                description = "You are about to enter the cold desert. You buy some logs to build a bonfire. You pay 20 goldpieces.";
                break;
            case 6:
                description = "You find a walled city. It’s full of goblins, so you raid it. Your efforts paid off, you stole 180 goldpieces!";
                break;
            case 7:
                description = "You enter the monastery, and the monks offers you a bed. You found inner peace but 0 goldpieces.";
                break;
            case 8:
                description = "You enter a dark black cave. You hear monsters in the dark and feel a cold touch. You run screaming out with no concern for your belongings, and lost 70 goldpieces…";
                break;
            case 9:
                description = "You find some huts in the mountains, where 3 different size bears lives. You slay them, eat their food, and sleep in the smallest bear’s bed. You found 60 goldpieces!";
                break;
            case 10:
                description = "You found yourself in front of a big wall. Werewolves come crawling out of openings in the wall. You manage to run away save, but a werewolf snatched 80 goldpieces from your sachet. Your adrenaline is sky high, you run to a new location.";
                break;
            case 11:
                description = "You fell down a pit. Molemen offer to help you up, for a price. You pay them 50 goldpieces…";
                break;
            case 12:
                description = "You find a mine and start mining. You’ve struck gold and have acquired 650 goldpieces!";
                break;
        }
        return description;
    }

    public static int getBalanceChange(int roll) {
        int balance = 0;
        switch (roll) {
            case 2:
                balance = 250;
                break;
            case 3:
                balance = -100;
                break;
            case 4:
                balance = 100;
                break;
            case 5:
                balance = -20;
                break;
            case 6:
                balance = +180;
                break;
            case 7:
                balance = 0;
                break;
            case 8:
                balance = -70;
                break;
            case 9:
                balance = +60;
                break;
            case 10:
                balance = -80;
                break;
            case 11:
                balance = -50;
                break;
            case 12:
                balance = 650;
                break;
        }
        return balance;
    }

    public static String getFieldEffect(int roll) {
        if (roll == 10) {
            return "Extra turn";
        }
        return null;
    }
}
