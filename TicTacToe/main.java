package TicTacToe;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        char[][] game = new char[3][3];
        for (int i = 0; i < game.length; i++) {
            for (int j = 0; j < game[0].length; j++) {
                game[i][j] = ' ';
            }
        }

        char player = 'X';
        boolean gameOver = false;
        Scanner sc = new Scanner(System.in);

        while (!gameOver) {
            printboard(game);
            System.out.println("Player " + player + "Entered");
            int row = sc.nextInt();
            int col = sc.nextInt();

            if (game[row][col] == ' ') {
                game[row][col] = player;
                gameOver = haveWon(game, player);
                if (gameOver) {
                    System.out.println("HURRAY!!!!!! PLAYER " + player + " WON");
                } else {
                    if (player == 'X') {
                        player = 'O';
                    } else {
                        player = 'X';
                    }
                }

            } else {
                System.out.println("Invalid Move");
            }

        }
        printboard(game);

    }

    public static boolean haveWon(char[][] game, char player) {
        for (int i = 0; i < game.length; i++) {
            if (game[i][0] == player && game[i][1] == player && game[i][2] == player) {
                return true;
            }
        }

        for (int i = 0; i < game.length; i++) {
            if (game[0][i] == player && game[1][i] == player && game[2][i] == player) {
                return true;
            }
        }

        if (game[0][0] == player && game[1][1] == player && game[2][2] == player) {
            return true;
        }

        if (game[0][2] == player && game[1][1] == player && game[2][0] == player) {
            return true;
        }
        return false;
    }

    public static void printboard(char[][] game) {
        for (int i = 0; i < game.length; i++) {
            for (int j = 0; j < game[0].length; j++) {
                System.out.print(game[i][j] + "|");
            }
            System.out.println();

        }
    }
}

// import java.util.Scanner;

// class Main {
// public static void main(String[] args) {
// char[][] board = new char[3][3];
// for (int row = 0; row < board.length; row++) {
// for (int col = 0; col < board[row].length; col++) {
// board[row][col] = ' ';
// }
// }

// char player = 'X';
// boolean gameOver = false;
// Scanner scanner = new Scanner(System.in);

// while (!gameOver) {
// printBoard(board);
// System.out.print("Player " + player + " enter: ");
// int row = scanner.nextInt();
// int col = scanner.nextInt();
// System.out.println();

// if (board[row][col] == ' ') {
// board[row][col] = player; // place the element
// gameOver = haveWon(board, player);
// if (gameOver) {
// System.out.println("Player " + player + " has won: ");
// } else {
// // if (player == 'X') {
// // player = 'O';
// // } else {
// // player = 'X';
// // }
// player = (player == 'X') ? 'O' : 'X';
// }
// } else {
// System.out.println("Invalid move. Try again!");
// }
// }
// printBoard(board);
// }

// public static boolean haveWon(char[][] board, char player) {
// // check the rows
// for (int row = 0; row < board.length; row++) {
// if (board[row][0] == player && board[row][1] == player && board[row][2] ==
// player) {
// return true;
// }
// }

// // check for col
// for (int col = 0; col < board[0].length; col++) {
// if (board[0][col] == player && board[1][col] == player && board[2][col] ==
// player) {
// return true;
// }
// }

// // diagonal
// if (board[0][0] == player && board[1][1] == player && board[2][2] == player)
// {
// return true;
// }

// if (board[0][2] == player && board[1][1] == player && board[2][0] == player)
// {
// return true;
// }
// return false;
// }

// public static void printBoard(char[][] board) {
// for (int row = 0; row < board.length; row++) {
// for (int col = 0; col < board[row].length; col++) {
// System.out.print(board[row][col] + " | ");
// }
// System.out.println();
// }
// }
// }