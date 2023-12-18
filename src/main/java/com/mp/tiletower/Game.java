
package com.mp.tiletower;

public class Game {
    
    static int highest = 0;
    
    int score = 0;
    boolean[][] states = {
        {false, false},
        {false, false},
        {false, false},
        {false, false},
        {false, false}
    };
    
    // --
    
    boolean verifyTurn(char side) {
        if (side == 'L') return this.states[4][0] == true;
        if (side == 'R') return this.states[4][1] == true;
        return false;
    }
}
