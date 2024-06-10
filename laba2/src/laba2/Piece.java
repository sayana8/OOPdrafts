package laba2;

public abstract class Piece {
    private String color;

    public Piece(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract boolean isLegalMove(Position start, Position end);
}