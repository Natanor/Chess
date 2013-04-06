
public class RenderMoves {
	public RenderMoves(int width, int hight, int selectedTile, Board board) {
		if(board.pieceAt[selectedTile/10][selectedTile - (selectedTile/10)*10].piece == Piece.PAWN){
			new RenderMovesPawn(width, hight, selectedTile, board);
		}
		if(board.pieceAt[selectedTile/10][selectedTile - (selectedTile/10)*10].piece == Piece.ROOK){
			new RenderMovesRock(width, hight, selectedTile, board);
		}
		if(board.pieceAt[selectedTile/10][selectedTile - (selectedTile/10)*10].piece == Piece.BISHOP){
			new RenderMovesBishop(width, hight, selectedTile, board);
		}
		if(board.pieceAt[selectedTile/10][selectedTile - (selectedTile/10)*10].piece == Piece.KNIGHT){
			new RenderMovesKnight(width, hight, selectedTile, board);
		}
		if(board.pieceAt[selectedTile/10][selectedTile - (selectedTile/10)*10].piece == Piece.QUEEN){
			new RenderMovesQueen(width, hight, selectedTile, board);
		}
		if(board.pieceAt[selectedTile/10][selectedTile - (selectedTile/10)*10].piece == Piece.KING){
			new RenderMovesKing(width, hight, selectedTile, board);
		}
	}
}
