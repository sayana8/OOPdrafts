package laba2; //peshka

public class Pawn extends Piece {
    public Pawn(String color) {
        super(color);
    }

    @Override
    public boolean isLegalMove(Position start, Position end) {
    	int deltaX = Math.abs(start.getRow() - end.getRow());
        int deltaY = Math.abs(start.getColumn() - end.getColumn());
        
        if (getColor().equalsIgnoreCase("White")) {
            // White pawn can move forward by one square
            if (start.getRow() == 2 && deltaX == 1 && deltaY == 0) {
                return true;
            } else if (deltaX == 1 && deltaY == 0) {
                return true;
            }
        } else {
            if (start.getRow() == 7 && deltaX == 1 && deltaY == 0) {
                return true;
            } else if (start.getRow()== 1 && deltaY == 0) {
                return true;
            }
        }

        return false;
    }
}