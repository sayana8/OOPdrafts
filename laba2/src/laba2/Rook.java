package laba2; //lad`ya

public class Rook extends Piece {
    public Rook(String color) {
        super(color);
    }

    @Override
    public boolean isLegalMove(Position start, Position end) {
        return start.getRow() == end.getRow() || start.getColumn() == end.getColumn();
    }
}