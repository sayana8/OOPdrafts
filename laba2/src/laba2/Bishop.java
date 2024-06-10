package laba2; //slon

public class Bishop extends Piece {
    public Bishop(String color) {
        super(color);
    }

    @Override
    public boolean isLegalMove(Position start, Position end) {
        int deltaX = Math.abs(start.getRow() - end.getRow());
        int deltaY = Math.abs(start.getColumn() - end.getColumn());
        return deltaX == deltaY;
    }
}
