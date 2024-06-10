package laba2;


public class ChessGame {
    public static void main(String[] args) {
        
        Rook whiteRook = new Rook("White");
        King blackKing = new King("Black");
        Bishop whiteBishop = new Bishop("White");
        Queen blackQueen = new Queen("Black");
        Knight whiteKnight = new Knight("White");
        Pawn blackPawn = new Pawn("Black");

        Position rookStart = new Position("1a");
        Position rookEnd = new Position("5a");

        Position kingStart = new Position("4e");
        Position kingEnd = new Position("5f");

        Position bishopStart = new Position("2c");
        Position bishopEnd = new Position("5f");

        Position queenStart = new Position("1d");
        Position queenEnd = new Position("5h");

        Position knightStart = new Position("3b");
        Position knightEnd = new Position("5c");

        Position pawnStart = new Position("2d");
        Position pawnEnd = new Position("3d");

        if (whiteRook.isLegalMove(rookStart, rookEnd)) {
            System.out.println("White Rook can legally move to the new position.");
        } else {
            System.out.println("White Rook cannot legally move to the new position.");
        }

        if (blackKing.isLegalMove(kingStart, kingEnd)) {
            System.out.println("Black King can legally move to the new position.");
        } else {
            System.out.println("Black King cannot legally move to the new position.");
        }

        if (whiteBishop.isLegalMove(bishopStart, bishopEnd)) {
            System.out.println("White Bishop can legally move to the new position.");
        } else {
            System.out.println("White Bishop cannot legally move to the new position.");
        }

        if (blackQueen.isLegalMove(queenStart, queenEnd)) {
            System.out.println("Black Queen can legally move to the new position.");
        } else {
            System.out.println("Black Queen cannot legally move to the new position.");
        }

        if (whiteKnight.isLegalMove(knightStart, knightEnd)) {
            System.out.println("White Knight can legally move to the new position.");
        } else {
            System.out.println("White Knight cannot legally move to the new position.");
        }

        if (blackPawn.isLegalMove(pawnStart, pawnEnd)) {
            System.out.println("Black Pawn can legally move to the new position.");
        } else {
            System.out.println("Black Pawn cannot legally move to the new position.");
        }
    }
}

