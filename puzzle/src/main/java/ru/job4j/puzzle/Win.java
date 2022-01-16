package ru.job4j.puzzle;

public class Win {

    public static boolean monoHorizontal(int[][] board, int row) {
        boolean rsl = true;
        for (int column = 0; column < board[row].length; column++) {
            if (board[row][column] != 1) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    public static boolean monoVertical(int[][] board, int column) {
        boolean rsl = true;
        for (int row = 0; row < board[column].length; row++) {
            if (board[row][column] != 1) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int row = 0; row < board.length; row++) {
            if (board[row][row] == 1) {
                if (monoHorizontal(board, row) || monoVertical(board, row)) {
                    rsl = true;
                    break;
                }
            }
        }
        return rsl;
    }
}

