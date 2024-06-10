package laba2;

public class King extends Piece {
    public King(String color) {
        super(color);
    }

    @Override
    public boolean isLegalMove(Position start, Position end) {
        int deltaX = Math.abs(start.getRow() - end.getRow());
        int deltaY = Math.abs(start.getColumn() - end.getColumn());
        return deltaX <= 1 && deltaY <= 1;
    }
}
