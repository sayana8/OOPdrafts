package laba2;

public class Position {
    private char column;
    private int row;

   public Position(String position) {
	   this.row= Integer.parseInt(position.substring(0,1));
	   this.column = position.charAt(1);
   }

    public char getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }
}




