package Problem2;

public class TestChess {
    public static void main(String[] args){
        Board board = new Board();
        Position start = new Position('A',0);
        Piece rook = new Rook(start);

        board.placePiece(rook,0,0);

        board.drawBoard();

        System.out.println("Move rook A0 -> A5");

        board.movePiece(0,0,5,0);

        board.drawBoard();
    }
}
