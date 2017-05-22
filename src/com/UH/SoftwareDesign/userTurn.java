package com.UH.SoftwareDesign;

/**
 * Created by vinay on 5/22/2017.
 */
public class userTurn {
    public static char userTurn(char[][] board) {
        System.out.println("Enter the row and column indices seperated by a space you want to mark  ");
        int r = Main.sc.nextInt();

        int c = Main.sc.nextInt();




        while (board[r][c] != ' ') {
            System.out.println("This space is filled. Enter another row and column index numbers ");
            r = Main.sc.nextInt();
            c = Main.sc.nextInt();
        }
        board[r][c] = 'x';

        return board[r][c];
    }

    public static void main(String args[]){
        char[][] board = new char[3][3];
        userTurn(board);
    }
}
