package com.UH.SoftwareDesign;

/**
 * Created by vinay on 5/22/2017.
 */
public class computerTurn extends Main{
    public static void computerTurn(char[][] board, int difLevel, int turnCount) {
        int rIndex = 0;
        int cIndex = 0;
        int totalElements = 0;
        declareWin declare_obj=new declareWin();

        if (difLevel == 1) {
            do {
                totalElements = board.length * board[0].length;
                int index = (int) (Math.random() * totalElements);
                rIndex = (int) index / board.length;
                cIndex = index % board.length;
            } while (board[rIndex][cIndex] != ' ');
            board[rIndex][cIndex] = 'o';
        } else if (difLevel == 2) {
            boolean winTemp = false;
            char[][] boardTemp = new char[board.length][board[0].length];
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[0].length; j++) {
                    boardTemp[i][j] = board[i][j];
                }
            }
            for (int i = 0; i < boardTemp.length; i++) {
                for (int j = 0; j < boardTemp[0].length; j++) {
                    if (boardTemp[i][j] == ' ') {
                        boardTemp[i][j] = 'o';
                        for (int k = i; k < boardTemp.length; k++) {
                            for (int l = j + 1; l < boardTemp[0].length; l++) {
                                boardTemp[k][l] = 'o';
                                winTemp = declare_obj.declareWIn(boardTemp, turnCount);
                                if (winTemp == true) {
                                    board[i][j] = 'o';
                                    return;
                                } else
                                    break;

                            }
                        }
                    }
                }
            }
            if (winTemp == false) {
                do {
                    totalElements = board.length * board[0].length;
                    int index = (int) (Math.random() * totalElements);
                    rIndex = (int) index / board.length;
                    cIndex = index % board.length;
                } while (board[rIndex][cIndex] != ' ');
                board[rIndex][cIndex] = 'o';
            }

        } else if (difLevel == 3) {
            boolean winTemp = false;
            char[][] boardTemp = new char[board.length][board[0].length];
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[0].length; j++) {
                    boardTemp[i][j] = board[i][j];
                }
            }
            for (int i = 0; i < boardTemp.length; i++) {
                for (int j = 0; j < boardTemp[0].length; j++) {
                    if (boardTemp[i][j] == ' ') {
                        boardTemp[i][j] = 'o';
                        winTemp = declare_obj.declareWIn(boardTemp, turnCount);
                        if (winTemp == true) {
                            board[i][j] = 'o';
                            return;
                        } else {
                            continue;
                        }
                    }
                }
            }
        }
    }
}
