package com.study.tdd.se.tictactoe;

public class TicTacToe {

    private char[][] board = {{'\0', '\0', '\0'}, {'\0', '\0', '\0'}, {'\0', '\0', '\0'}};

    private static final int SIZE = 3;

    private char lastPlayer = '\0';

    public String play(int x, int y) {
        checkAxis(x);
        checkAxis(y);
        lastPlayer = nextPlayer();
        setBox(x, y, lastPlayer);
        if (isWin()) {
            return lastPlayer + " is the winner";
        } else if (isDraw()) {
            return "The result is draw";
        }
        return "No winner";
    }

    private void checkAxis(int axis) {
        if (axis < 1 || axis > 3) {
            throw new RuntimeException("X is outside board");
        }
    }

    private void setBox(int x, int y, char lastPlayer) {
        if (board[x - 1][y - 1] != '\0') {
            throw new RuntimeException("Box is occupied");
        } else {
            board[x - 1][y - 1] = lastPlayer;
        }
    }

    public char nextPlayer() {
        if (lastPlayer == 'X') {
            return 'O';
        }
        return 'X';
    }

    private boolean isWin() {
        int playerTotal = lastPlayer * SIZE;
        for (int i = 0; i < 3; i++) {
            if ((board[0][i] + board[1][i] + board[2][i]) == playerTotal) {
                return true;
            }
            if ((board[i][0] + board[i][1] + board[i][2]) == playerTotal) {
                return true;
            }
        }
        if ((board[0][0] + board[1][1] + board[2][2]) == playerTotal) {
            return true;
        }
        if ((board[0][2] + board[1][1] + board[2][0]) == playerTotal) {
            return true;
        }
        return false;
    }

    /**
     * 若全不为 '\0' 说明棋盘已经下满
     *
     * @return true 平局
     */
    private boolean isDraw() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE ; j++) {
                if(board[i][j]=='\0'){
                    return false;
                }
            }
        }
        return true;
    }
}
