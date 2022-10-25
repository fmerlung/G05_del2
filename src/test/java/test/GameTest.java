package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GameTest
{
    @Test
    @DisplayName("Testing to make sure that player balance can't be set to negative")
    void changeBalanceBelowZeroTest()
    {
        Player testPlayer = new Player();
        assertEquals(1000,testPlayer.getBalance());
        testPlayer.changeBalance(-5000);
        assertEquals(0,testPlayer.getBalance());
    }
}