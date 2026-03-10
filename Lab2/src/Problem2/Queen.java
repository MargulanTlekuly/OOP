package Problem2;

public class Queen extends Piece{

    public Queen(Position a){
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
