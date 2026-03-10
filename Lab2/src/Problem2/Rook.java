package Problem2;

public class Rook extends Piece{
    public Rook(Position a){
        super(a);
    }

    @Override
    public boolean isLegalMove(Position b){
        if(a.getRow() == b.getRow() || a.getCol() == b.getCol()){
            return true;
        }
        return false;
    }
}
