package game;

public class Board {

    public static String FieldName() {
        String result = null;
        switch (die.roll) {
            case 2:
                result = "Tower";
                break;
            case 3:
                result = "Crater";
                break;
            case 4:
                result = "Palace Gates";
                break;
            case 5:
                result = "Cold Desert";
                break;
            case 6:
                result = "Walled City";
                break;
            case 7:
                result = "Monastery";
                break;
            case 8:
                result = "Black cave";
                break;
            case 9:
                result = "Huts in the mountain";
                break;
            case 10:
                result = "The Werewall";
                break;
            case 11:
                result = "The Pit";
                break;
            case 12:
                result = "Goldmine";
                break;
        }
        return result;
    }
    public static String FieldDescription() {
        String result = null;
        switch (die.roll) {
            case 2:
                result = "Tower";
                break;
            case 3:
                result = "Crater";
                break;
            case 4:
                result = "Palace Gates";
                break;
            case 5:
                result = "Cold Desert";
                break;
            case 6:
                result = "Walled City";
                break;
            case 7:
                result = "Monastery";
                break;
            case 8:
                result = "Black cave";
                break;
            case 9:
                result = "Huts in the mountain";
                break;
            case 10:
                result = "The Werewall";
                break;
            case 11:
                result = "The Pit";
                break;
            case 12:
                result = "Goldmine";
                break;
        }
        return result;
    }
}
