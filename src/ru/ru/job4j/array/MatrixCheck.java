package ru.ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
           for (int cell = 0; cell < board.length; cell++) {

                if (board[row][cell] != 'X') {
                    result = false;
                    break;
                }
            }
        return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int row = 0; row < board.length; row++) {
            if (board[row][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            rsl[i] = board[i][i];
        }
        return rsl;
    }

    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int i = 0; i < board.length; i++) {
                        if ((monoHorizontal(board, i) || monoVertical(board, i))) {
                result = true;
                break;
            }
        }
        return result;
    }

        public static void main(String[]args) {
            char[][] input = {
                    {' ', ' ', ' '},
                    {'X', 'X', 'X'},
                    {' ', ' ', ' '},
            };
            MatrixCheck.monoHorizontal(input, 1);
            MatrixCheck.monoVertical(input, 2);
            MatrixCheck.extractDiagonal(input);
            MatrixCheck.isWin(input);
        }
    }
