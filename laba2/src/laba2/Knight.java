package laba2;  // horse

public class Knight extends Piece {
    public Knight(String color) {
        super(color);
    }

    @Override
    public boolean isLegalMove(Position start, Position end) {
        int deltaX = Math.abs(start.getRow() - end.getRow());
        int deltaY = Math.abs(start.getColumn() - end.getColumn());
        return (deltaX == 2 && deltaY == 1) || (deltaX == 1 && deltaY == 2);
    }
}