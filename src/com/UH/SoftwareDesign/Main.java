package com.UH.SoftwareDesign;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
	// write your code here int gameCount = 0;
        int turnCount = 0, gameCount =0;
        boolean game = true;
        do {
            gameCount++;
            System.out.println("Let's play Tic-Tac-Toe! \n");
            System.out.println("Choose size of the board\n");
            final int size = sc.nextInt();
            if(size==0 || size==1 || size==2) {
                 game=false;
                break;
            }
            char[][] board = new char[size][size];

            selectBoard sel_obj=new selectBoard();
            sel_obj.selectBoard(board);

            System.out.println(" Select the level of difficulty  1 or 2 or 3 \n");
            int difLevel = sc.nextInt();

            NewGame new_gj= new NewGame();
            new_gj.newGame(board);

            int movesLeft = (size*size);

            userTurn user_obj= new userTurn();
            computerTurn comp_obj=new computerTurn();
            if (gameCount%2 != 0) {
                user_obj.userTurn(board);
                turnCount=1;
            }
            else {
                comp_obj.computerTurn(board, difLevel, turnCount);
                turnCount=2;
            }

            sel_obj.selectBoard(board);
            movesLeft--;

            boolean endOfGame = false;
            if (size == 1) {
                System.out.println("User won the game !");
                break;
            }
            declareWin dec_obj=new declareWin();

            while (!endOfGame && movesLeft > 0) {

                endOfGame = dec_obj.declareWIn(board,(turnCount-1));

                if (endOfGame==true) {
                    if ((turnCount-1)%2==0) {
                        System.out.println("Congratulations! You Won the Game ");
                        break;
                    }
                    else if ((turnCount-1)%2==1) {
                        System.out.println("Better Luck Next time .. Computer won the game !");
                        break;
                    }
                }

                else {
                    if (turnCount%2 != 0)
                        comp_obj.computerTurn(board, difLevel, turnCount);
                    else
                        user_obj.userTurn(board);

                    sel_obj.selectBoard(board);
                    movesLeft--;
                    turnCount++;
                }
            }

            if (movesLeft==0 && !endOfGame && size!=1) {
                System.out.println("Match drawn !");
                break;
            }

        } while(game==true);
    }

}
