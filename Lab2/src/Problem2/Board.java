package Problem2;

public class Board {
    private Piece[][] board;

    public Board(){
        board = new Piece[8][8];
    }

    public void placePiece(Piece p, int row, int col){
        board[row][col] = p;
    }

    public void movePiece(int fromRow, int fromCol, int toRow, int toCol){
        Piece p = board[fromRow][fromCol];
        if(p == null){
            System.out.println("No piece at that position.");
            return;
        }

        Position newPos = new Position((char)('A' + toCol), toRow + 1);
        if(p.isLegalMove(newPos)){
            board[toRow][toCol] = p;
            board[fromRow][fromCol] = null;
            System.out.println("Move successful.");
        }else{
            System.out.println("Illegal move!");
        }
    }

    public void drawBoard(){
        System.out.println("  A B C D E F G H");
        for(int i = 7; i >= 0; i--){
            System.out.print((i+1) + " ");
            for(int j = 0; j < 8; j++){
                if(board[i][j] == null){
                    System.out.print(". ");
                }else{
                    System.out.print(board[i][j].getClass().getSimpleName().charAt(0) + " ");
                }

            }
            System.out.println();
        }
    }
}
