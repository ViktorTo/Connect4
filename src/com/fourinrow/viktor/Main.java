package com.fourinrow.viktor;

public class Main {
    public static void main(String[] args) {

        int rows = 6;
        int colums = 7;
        int playerTurn = GameBoard.firstTurn();
        int userInput;
        boolean win = false;
        char[][] gameBoard = new char[6][7];

        System.out.println("\t\t-WELCOME TO CONNECT 4!-");
        System.out.println("\t\t-----------------------\n");

        do {

            GameBoard.printBoard(gameBoard, rows, colums);

            userInput = User.userInput(playerTurn);
            
            gameBoard = GameBoard.userTurn(gameBoard, userInput, playerTurn);
            GameBoard.printBoard(gameBoard, rows, colums);

            playerTurn = (playerTurn == 1) ? 2 : 1;
            win = (GameBoard.checkWinO(gameBoard) || GameBoard.checkWinX(gameBoard)) ? true : false;

        } while (!win);

        playerTurn = (playerTurn == 1) ? 2 : 1;

        System.out.println("\n ********************************************************");
        System.out.println("\t\tWE HAVE A WINNER!");
        System.out.println("\t\tPlayer " + playerTurn + " won the game!");

    }
}
