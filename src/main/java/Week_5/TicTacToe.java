package Week_5;
class TicTacToe extends Game {
    private char[][] board;
    private static final int BOARD_SIZE = 3;
    private static final char EMPTY_CELL = '-';
    private static final char PLAYER_X = 'X';
    private static final char PLAYER_O = 'O';

    @Override
    void initializeGame() {
        board = new char[BOARD_SIZE][BOARD_SIZE];
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                board[i][j] = EMPTY_CELL;
            }
        }
        System.out.println("Tic Tac Toe Game Initialized.");
        printBoard();
    }

    @Override
    void makePlay(int player) {
        System.out.println("Player " + (player + 1) + "'s turn:");
        // Simulate player input for simplicity
        int row = (int) (Math.random() * BOARD_SIZE);
        int col = (int) (Math.random() * BOARD_SIZE);
        while (board[row][col] != EMPTY_CELL) {
            row = (int) (Math.random() * BOARD_SIZE);
            col = (int) (Math.random() * BOARD_SIZE);
        }
        if (player == 0) {
            board[row][col] = PLAYER_X;
        } else {
            board[row][col] = PLAYER_O;
        }
        printBoard();
    }

    @Override
    boolean endOfGame() {
        return isWinner(PLAYER_X) || isWinner(PLAYER_O) || isBoardFull();
    }

    @Override
    void printWinner() {
        if (isWinner(PLAYER_X)) {
            System.out.println("Player X wins!");
        } else if (isWinner(PLAYER_O)) {
            System.out.println("Player O wins!");
        } else {
            System.out.println("It's a draw!");
        }
    }

    private boolean isWinner(char player) {
        // Check rows, columns, and diagonals
        for (int i = 0; i < BOARD_SIZE; i++) {
            if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) ||
                    (board[0][i] == player && board[1][i] == player && board[2][i] == player)) {
                return true;
            }
        }
        return (board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
                (board[0][2] == player && board[1][1] == player && board[2][0] == player);
    }

    private boolean isBoardFull() {
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                if (board[i][j] == EMPTY_CELL) {
                    return false;
                }
            }
        }
        return true;
    }

    private void printBoard() {
        System.out.println("Current Board:");
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}