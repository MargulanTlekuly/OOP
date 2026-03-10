package Problem2;

public class King extends Piece{

    public King(Position a){
        super(a);
    }

    @Override
    public boolean isLegalMove(Position b){
        if(Math.abs(a.getRow() - b.getRow()) <= 1 &&
                Math.abs(a.getCol() - b.getCol()) <= 1){
            return true;
        }
        return false;
    }
}
