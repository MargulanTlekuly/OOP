package Problem2;

public class Bishop extends Piece{

    public Bishop(Position a){
        super(a);
    }

    @Override
    public boolean isLegalMove(Position b){
        if(Math.abs(a.getRow()-b.getRow()) == Math.abs(a.getCol()-b.getCol())){
            return true;
        }
        return false;
    }
}
