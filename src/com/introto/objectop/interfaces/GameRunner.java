package com.introto.objectop.interfaces;

import com.introto.objectop.learnAbstract.Recipe1;
import com.introto.objectop.learnAbstract.RecipeWithMicrowave;

public class GameRunner {
    public static void main(String[] args){
/*      MarioGame game = new MarioGame();
        ChessGame game = new ChessGame();
        // Both work in creating a new game, one can also use the interface to create an instance
 */
        GamingConsole game = new ChessGame();
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
