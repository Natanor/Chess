
public class Piece {
	final static int Empty = 0;
	final static int PAWN =1 ;
	final static int BISHOP = 2;
	final static int ROOK = 3;
	final static int KNIGHT =4;
	final static int QUEEN = 5;
	final static int KING =6;
	int x;
	int y;
	boolean white;
	int piece;
	Piece(int xPos, int yPos, boolean isWhite,int pieceKind ){
		x = xPos;
		y = yPos;
		white = isWhite;
		piece = pieceKind;
	}
	int getX(){
		return x;
	}
	int getY(){
		return y;
	}
	boolean isWhite(){
		return white;
	}
	int getPiece(){
		return piece;
	}
}
