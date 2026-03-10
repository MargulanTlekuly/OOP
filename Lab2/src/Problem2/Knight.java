package Problem2;

public class Knight extends Piece{

    public Knight(Position a){
        super(a);
    }

    @Override
    public boolean isLegalMove(Position b){

        int rowDiff = Math.abs(a.getRow()-b.getRow());
        int colDiff = Math.abs(a.getCol()-b.getCol());

        if(rowDiff == 2 && colDiff == 1){
            return true;
        }
        if(rowDiff == 1 && colDiff == 2){
            return true;
        }
        return false;
    }
}
