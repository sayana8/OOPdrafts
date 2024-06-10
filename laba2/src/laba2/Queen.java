package laba2;


public class Queen extends Piece {
    public Queen(String color) {
        super(color);
    }

    @Override
    public boolean isLegalMove(Position start, Position end) {
        int deltaX = Math.abs(start.getRow() - end.getRow());
        int deltaY = Math.abs(start.getColumn() - end.getColumn());
        return start.getRow() == end.getRow() || start.getColumn() == end.getColumn() || deltaX == deltaY;
    }
}