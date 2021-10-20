package com.fourinrow.viktor;

import java.util.Random;

public class GameBoard {

    public static void printBoard(char[][] arr, int rows, int colums) {

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < colums; j++) {

                if (arr[i][j] == 0) {

                    System.out.print(" | " + "   " + " |");

                } else {

                    System.out.print(" | " + " " + arr[i][j] + " " + " |");

                }

            }

            System.out.println();

        }

        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");

        System.out.println(" | " + " 1 " + " |" + " | " + " 2 " + " |" + " | " + " 3 " + " |" + " | " + " 4 " + " |"
                + " | " + " 5 " + " |" + " | " + " 6 " + " |" + " | " + " 7 " + " |");

    }

    public static char[][] userTurn(char[][] arr, int userInput, int turn) {

        int rows = 6;

        if (turn == 1) {

            for (int i = rows - 1; i >= 0; i--) {

                if (arr[i][userInput] == 0) {

                    arr[i][userInput] = 'X';
                    i = 0;

                }

            }

        } else if (turn == 2) {

            for (int i = rows - 1; i >= 0; i--) {

                if (arr[i][userInput] == 0) {

                    arr[i][userInput] = 'O';
                    i = 0;

                }

            }

        }

        return arr;

    }

    public static int firstTurn() {

        Random rand = new Random();

        return rand.nextInt(2) + 1;
    }

    public static boolean checkWinX(char[][] arr) {

        int rows = 6;
        int colums = 7;

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < 4; j++) {

                if (arr[i][j] == 'X' && arr[i][j + 1] == 'X' && arr[i][j + 2] == 'X' && arr[i][j + 3] == 'X') {

                    return true;

                }

            }

        }

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < colums; j++) {

                if (arr[i][j] == 'X' && arr[i + 1][j] == 'X' && arr[i + 2][j] == 'X' && arr[i + 3][j] == 'X') {

                    return true;

                }

            }

        }

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 4; j++) {

                if (arr[i][j] == 'X' && arr[i + 1][j + 1] == 'X' && arr[i + 2][j + 2] == 'X'
                        && arr[i + 3][j + 3] == 'X') {

                    return true;

                }

            }

        }

        for (int i = 5; i > 0; i--) {

            for (int j = 0; j < 4; j++) {

                if (arr[i][j] == 'X' && arr[i - 1][j + 1] == 'X' && arr[i - 2][j + 2] == 'X'
                        && arr[i - 3][j + 3] == 'X') {

                    return true;

                }

            }

        }

        return false;

    }

    public static boolean checkWinO(char[][] arr) {

        int rows = 6;
        int colums = 7;

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < 4; j++) {

                if (arr[i][j] == 'O' && arr[i][j + 1] == 'O' && arr[i][j + 2] == 'O' && arr[i][j + 3] == 'O') {

                    return true;

                }

            }

        }

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < colums; j++) {

                if (arr[i][j] == 'O' && arr[i + 1][j] == 'O' && arr[i + 2][j] == 'O' && arr[i + 3][j] == 'O') {

                    return true;

                }

            }

        }

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 4; j++) {

                if (arr[i][j] == 'O' && arr[i + 1][j + 1] == 'O' && arr[i + 2][j + 2] == 'O'
                        && arr[i + 3][j + 3] == 'O') {

                    return true;

                }

            }

        }

        for (int i = 5; i > 0; i--) {

            for (int j = 0; j < 4; j++) {

                if (arr[i][j] == 'O' && arr[i - 1][j + 1] == 'O' && arr[i - 2][j + 2] == 'O'
                        && arr[i - 3][j + 3] == 'O') {

                    return true;

                }

            }

        }

        return false;

    }

}
