package com.UH.SoftwareDesign;

/**
 * Created by vinay on 5/22/2017.
 */
public class NewGame extends Main{
    public int newGame(char board[][]) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++)
                board[i][j] = ' ';

        }
        return board.length;
    }
}
