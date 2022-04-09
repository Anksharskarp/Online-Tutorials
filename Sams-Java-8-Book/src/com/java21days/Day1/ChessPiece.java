package com.java21days.Day1;

class ChessPiece {
    String color;
    int startingPosition;
}

class King extends ChessPiece {
    int forwardMovement = 1;
    int sideMovement = 1;
}

class Queen extends ChessPiece {
    int forwardMovement;
    int sideMovement;
}

class Pawn extends ChessPiece {
    int forwardMovement = 1;
    int sideMovement = 0;
}

class Rook extends ChessPiece {
    int forwardMovement;
    int sideMovement;
}

class Bishop extends ChessPiece {
    int forwardMovement;
    int sideMovement;
}

class Knight extends ChessPiece {
    int forwardMovement;
    int sideMovement;
}