package Problem2;

public class Pawn extends Piece {

    public Pawn(Position a){
        super(a);
    }

    @Override
    public boolean isLegalMove(Position b){
        if(b.getRow() == a.getRow() + 1 &&
        b.getCol() == a.getCol()){
            return true;
        }
        return false;
    }
}
