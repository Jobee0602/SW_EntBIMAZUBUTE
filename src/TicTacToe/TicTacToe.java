package TicTacToe;

public class TicTacToe {

    /**
     * Team: Nils Lütke, Basel Alwani, Laura Weber, Benny Burkert
     */

    private int ROWS = 3;
    private int COLS = 3;
    private Player[][] board; //board[row][col]
    public enum Player {
        Unknown, X, O
    }

    private Player currentPlayer = Player.X;
    private Player winner = Player.Unknown;

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
    }

    public void play(int row, int col) {
        if(board[row][col]==Player.Unknown) {
            try {
                switch (currentPlayer) {
                    case X:
                        board[row][col] = Player.X;
                        currentPlayer = Player.O;
                        break;
                    case O:
                        board[row][col] = Player.O;
                        currentPlayer = Player.X;
                        break;
                    default:
                        throw new IllegalStateException("There is no current Player");
                }
            } catch (Exception e) {
                throw new ArrayIndexOutOfBoundsException("The board accepts values between 0 and 2");
            }
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
        //Determines vertical win
        for(int rows = 0; rows < 3; rows++){
            if(board[rows][0] == board[rows][1] && board[rows][0] == board[rows][2]){
                winner = board[rows][0];
                if(board[rows][0] != Player.Unknown){
                    return true;
                }
            }
        }

        //Determines horizontal win
        for(int cols = 0; cols < 3; cols++){
            if(board[0][cols] == board[1][cols] && board[0][cols] == board[2][cols]){
                winner = board[0][cols];
                if(board[0][cols] != Player.Unknown){
                    return true;
                }
            }
        }

        //Determines diagonal win
        if((board[0][0] == board[1][1] && board[0][0] == board[2][2]) || (board[2][0] == board[1][1] && board[2][0] == board[0][2])){
            winner = board[1][1];
            if(board[1][1] != Player.Unknown){
                return true;
            }
        }
        return false;
    }

    public boolean isDraw() {
        if(isGameOver() && !isGameWon()){
            return true;
        }
        return false;
    }

    public boolean isGameOver() {
        boolean finished = true;
        for(int rows = 0; rows < 3; rows++){
            for(int cols = 0; cols < 3; cols++){
                if(board[rows][cols] == Player.Unknown){
                    finished = false;
                }
            }
        }
        return finished;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public Player getWinner() {
        return winner;
    }

    public void outputBoard(){
        for(int rows = 0; rows < 3; rows++){
            for(int cols = 0; cols < 3; cols++){
                switch(board[rows][cols]){
                    case Unknown: System.out.print(" - "); break;
                    case O: System.out.print(" O "); break;
                    case X: System.out.print(" X "); break;
                }
            }
            System.out.println();
        }
    }

    public Player getBoard(int row, int col){
        return board[row][col];
    }

    /**
     * Attention! No use except for testing
     * @param row
     * @param col
     */
    public void setBoard(int row, int col, Player pl){
        board[row][col] = pl;
    }
}
