package Problem2;

public class Position {
    private int row;
    private char col;

    public Position(char col, int row){
        this.col=col;
        this.row=row;
    }

    public void setRow(int row){
        this.row=row;
    }
    public void setCol(char col){
        this.col=col;
    }

    public int getRow(){
        return row;
    }
    public int getCol(){
        return col;
    }
    @Override
    public String toString(){
        return col + "" + row;
    }
}
