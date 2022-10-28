package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GameTest
{
    @Test
    @DisplayName("Testing to make sure that the player starts with a balance of 1000")
    void startingBalanceTest()
    {
        game.Player testPlayer = new game.Player();
        assertEquals(1000,testPlayer.getBalance());
    }

    @Test
    @DisplayName("Testing to make sure that player balance can't be set to negative")
    void changeBalanceBelowZeroTest()
    {
        game.Player testPlayer = new game.Player();
        testPlayer.changeBalance(-1*(testPlayer.getBalance()-1)); // Changes balance to 1
        assertEquals(1,testPlayer.getBalance());

        testPlayer.changeBalance(-1); // Changes balance to 0
        assertEquals(0,testPlayer.getBalance());

        testPlayer.changeBalance(-1); // Changes balance to -1. This should automatically set it back to 0
        assertEquals(0,testPlayer.getBalance()); // Checks if balance is still 0

        testPlayer.changeBalance(-5000); // Changes balance to -5000 for good measure. This should also set it back to 0
        assertEquals(0,testPlayer.getBalance()); // Checks if balance is still 0
    }
}