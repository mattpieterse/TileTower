
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
    
    boolean verifyTurn() {
        return false;
    }
}
