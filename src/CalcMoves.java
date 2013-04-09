


public class CalcMoves {
	int tile;
	Board board;
	int[] a = null;
	CalcMoves(int tile1, Board board1){
			tile = tile1;
			board = board1;
	}
	int[] Calc(){
		if(board.pieceAt[tile/10][tile - (tile/10)*10].piece != Piece.Empty){
		
			if(board.pieceAt[tile/10][tile - (tile/10)*10].piece == Piece.PAWN){
				CalcMovesPawn cmp = new CalcMovesPawn(tile, board);
				a = cmp.GetMoves();
			}
			if(board.pieceAt[tile/10][tile - (tile/10)*10].piece == Piece.ROOK){
				CalcMovesRook cmr = new CalcMovesRook(tile, board);
				a = cmr.GetMoves();
			}
			if(board.pieceAt[tile/10][tile - (tile/10)*10].piece == Piece.KNIGHT){
				CalcMovesKnight cmkn = new CalcMovesKnight(tile, board);
				a = cmkn.GetMoves();
			}
			if(board.pieceAt[tile/10][tile - (tile/10)*10].piece == Piece.BISHOP){
				CalcMovesBishop cmb = new CalcMovesBishop(tile, board);
				a = cmb.GetMoves();
			}
			if(board.pieceAt[tile/10][tile - (tile/10)*10].piece == Piece.QUEEN){
				CalcMovesQueen cmq = new CalcMovesQueen(tile, board);
				a = cmq.GetMoves();
			}
			if(board.pieceAt[tile/10][tile - (tile/10)*10].piece == Piece.KING){
				CalcMovesKing cmk = new CalcMovesKing(tile, board);
				a = cmk.GetMoves();
			}
		}
		return a;
	}
	int[] CalcDanger(){
		if(board.pieceAt[tile/10][tile - (tile/10)*10].piece != Piece.Empty){
		
			if(board.pieceAt[tile/10][tile - (tile/10)*10].piece == Piece.PAWN){
				int z;
				if (board.pieceAt[tile/10][tile - (tile/10)*10].white){
					z=1;
				}else{
					z=-1;
				}
				a = new int[50];
				for(int i=0;i<50;i++ ){
					a[i]= -1;
				}
				a[2] = ((tile/10)-1)*10 + ((tile - (tile/10)*10)+z);
				a[3] = ((tile/10)+1)*10 + ((tile - (tile/10)*10)+z);
			}
			if(board.pieceAt[tile/10][tile - (tile/10)*10].piece == Piece.ROOK){
				CalcMovesRook cmr = new CalcMovesRook(tile, board);
				a = cmr.GetMoves();
			}
			if(board.pieceAt[tile/10][tile - (tile/10)*10].piece == Piece.KNIGHT){
				CalcMovesKnight cmkn = new CalcMovesKnight(tile, board);
				a = cmkn.GetMoves();
			}
			if(board.pieceAt[tile/10][tile - (tile/10)*10].piece == Piece.BISHOP){
				CalcMovesBishop cmb = new CalcMovesBishop(tile, board);
				a = cmb.GetMoves();
			}
			if(board.pieceAt[tile/10][tile - (tile/10)*10].piece == Piece.QUEEN){
				CalcMovesQueen cmq = new CalcMovesQueen(tile, board);
				a = cmq.GetMoves();
			}
			if(board.pieceAt[tile/10][tile - (tile/10)*10].piece == Piece.KING){
				a = new int[50];
				for(int i=0;i<50;i++ ){
					a[i]= -1;
				}
				for(int i = -1; i<2;i++)
					for(int j = -1; j<2; j++){
						if(((tile/10)+i) >=0 && ((tile/10)+i)<=7 && ((tile - (tile/10)*10)+j) >=0 && ((tile - (tile/10)*10)+j)<=7){
							if(board.pieceAt[(tile/10)+i][(tile - (tile/10)*10)+j].piece == Piece.Empty){
								int moves = 0;
								a[moves]= ((tile/10)+i)*10 + ((tile - (tile/10)*10)+j);
								moves++;
							}
						}
					}
				}	
				
			}
		return a;
	}
}
			

