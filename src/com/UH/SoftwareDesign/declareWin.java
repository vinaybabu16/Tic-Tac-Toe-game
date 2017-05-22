package com.UH.SoftwareDesign;

/**
 * Created by vinay on 5/22/2017.
 */
public class declareWin {
    public static boolean declareWIn(char[][] board, int turnCount) {
        char symbol = ' ';
        if (turnCount % 2 != 0) {
            symbol = 'o';
        } else {
            symbol = 'x';
        }
        int r = board.length;
        int c = board[0].length;
        int i, j;
        boolean endOfGame = false;

        for (i = 0; i < r && !endOfGame; i++) {
            for (j = 0; j < c; j++) {
                if (board[i][j] != symbol)
                    break;
            }
            if (j == c)
                endOfGame = true;
        }

        for (j = 0; j < c && !endOfGame; j++) {
            for (i = 0; i < r; i++) {
                if (board[i][j] != symbol)
                    break;
            }
            if (i == r)
                endOfGame = true;
        }

        if (!endOfGame) {
            for (i = 0; i < r; i++) {
                if (board[i][i] != symbol)
                    break;
            }
            if (i == r)
                endOfGame = true;
        }

        if (!endOfGame) {
            for (i = 0; i < r; i++) {
                if (board[i][r - 1 - i] != symbol)
                    break;
            }
            if (i == r)
                endOfGame = true;
        }

        return endOfGame;

    }
}