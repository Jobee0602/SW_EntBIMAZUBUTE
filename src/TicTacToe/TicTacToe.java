package TicTacToe;

public class TicTacToe {
    private int ROWS = 3;
    private int COLS = 3;
    public Player[][] board; //board[row][col]
    public enum Player {
        Unknown, X, O
    }

    private Player currentPlayer;
    private Player winner;

    public TicTacToe() {
        initialiazeBoard();
    }

    public void initialiazeBoard() {
        board = new Player[ROWS][COLS];
        for(int rows = 0; rows < 3; rows++){
            for(int cols = 0; cols < 3; cols++){
                board[rows][cols] = Player.Unknown;
            }
        }
        System.out.println("Board initialized.");
    }

    public void play(int row, int col) {
        try{
            switch(currentPlayer){
                case X: board[row][col] = Player.X; currentPlayer = Player.O; break;
                case O: board[row][col] = Player.O; currentPlayer = Player.X; break;
                default: throw new IllegalStateException("There is no current Player");
            }
        }
        catch (Exception e){
            throw new ArrayIndexOutOfBoundsException("The board accepts values between 0 and 2");
        }
    }

    public boolean isBoardEmpty() {
        boolean empty = true;
        for(int rows = 0; rows < 3; rows++) {
            for (int cols = 0; cols < 3; cols++) {
                if(!(board[rows][cols] == Player.Unknown)){
                    empty = false;
                }
            }
        }
        return empty;
    }

    public boolean isGameWon() {
        return false; //not ready
    }

    public boolean isDraw() {
        return false; //not ready
    }

    public boolean isGameOver() {
        return false; //not ready
    }

    public Player getCurrentPlayer() {
        return null; //not ready
    }

    public Player getWinner() {
        return null; //not ready
    }
}
