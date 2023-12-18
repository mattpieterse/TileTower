
package com.mp.tiletower;

public class Game {
    
    private static int highest = 0;
    
    private int score = 0;
    private boolean[][] states = {
        {false, false},
        {false, false},
        {false, false},
        {false, false},
        {false, false}
    };
    
    // --
    
    boolean verifyTurn(char side) {
        if (side == 'L') return this.states[5][0] == true;
        if (side == 'R') return this.states[5][1] == true;
        return false;
    }
    
    void incrementScore() {
        this.score++;
    }
    
    // --
    
    public int getScore() {
        return this.score;
    }
    
    public int getHighest() {
        return highest;
    }
}
