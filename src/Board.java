
public class Board {
	Piece[][] pieceAt= new Piece[8][8];
	boolean whiteTurn;
	
	//int[] a;
	
	boolean canCastleWR;
	boolean canCastleWL;
	boolean canCastleBR;
	boolean canCastleBL;
	Board(){
		for(int i =0; i<8; i++){
			for(int j =0; j<8;j++){
				pieceAt[i][j] = new Piece(i, j, false, Piece.Empty);
			}
			
		}
		for(int i =0; i<8;i++){
			pieceAt[i][1] = new Piece(i,1,true,Piece.PAWN);
			pieceAt[i][6] = new Piece(i,6,false,Piece.PAWN);
		}
		pieceAt[0][0] = new Piece(0,0,true,Piece.ROOK);
		pieceAt[1][0] = new Piece(1,0,true,Piece.KNIGHT);
		pieceAt[2][0] = new Piece(2,0,true,Piece.BISHOP);
		pieceAt[3][0] = new Piece(3,0,true,Piece.QUEEN);
		pieceAt[4][0] = new Piece(4,0,true,Piece.KING);
		pieceAt[5][0] = new Piece(5,0,true,Piece.BISHOP);
		pieceAt[6][0] = new Piece(6,0,true,Piece.KNIGHT);
		pieceAt[7][0] = new Piece(7,0,true,Piece.ROOK);
		
		pieceAt[0][7] = new Piece(0,7,false,Piece.ROOK);
		pieceAt[1][7] = new Piece(1,7,false,Piece.KNIGHT);
		pieceAt[2][7] = new Piece(2,7,false,Piece.BISHOP);
		pieceAt[3][7] = new Piece(3,7,false,Piece.QUEEN);
		pieceAt[4][7] = new Piece(4,7,false,Piece.KING);
		pieceAt[5][7] = new Piece(5,7,false,Piece.BISHOP);
		pieceAt[6][7] = new Piece(6,7,false,Piece.KNIGHT);
		pieceAt[7][7] = new Piece(7,7,false,Piece.ROOK);
		
		whiteTurn = true;
		
		canCastleWR = true;
		canCastleWL = true;
		canCastleBR = true;
		canCastleBL = true;
	}
	
	boolean isPieceInDanger(int tile, Board board){
		boolean foundDanger = false;
				for(int i =0; i<8;i++){
					for(int j =0; j<8;j++){
						if(board.pieceAt[i][j].white != board.pieceAt[tile/10][tile - (tile/10*10)].white && !foundDanger){
							int[] g = new int[50];
							if(board.pieceAt[i][j].piece == Piece.PAWN){
								CalcMovesPawn cmp = new CalcMovesPawn(i*10+j, board);
								g =cmp.GetMoves2();
							}
							if(board.pieceAt[i][j].piece == Piece.ROOK){
								CalcMovesRook cmr = new CalcMovesRook(i*10+j, board);
								g =cmr.GetMoves2();
							}
							if(board.pieceAt[i][j].piece == Piece.BISHOP){
								CalcMovesBishop cmb = new CalcMovesBishop(i*10+j, board);
								g =cmb.GetMoves2();
							}
							if(board.pieceAt[i][j].piece == Piece.KNIGHT){
								CalcMovesKnight cmkn = new CalcMovesKnight(i*10+j, board);
								g =cmkn.GetMoves2();
							}
							if(board.pieceAt[i][j].piece == Piece.QUEEN){
								CalcMovesQueen cmq = new CalcMovesQueen(i*10+j, board);
								g =cmq.GetMoves2();
							}
							if(board.pieceAt[i][j].piece == Piece.KING){
								CalcMovesKing cmk = new CalcMovesKing(i*10+j, board);
								g =cmk.GetMoves2();
							}
							for(int h=0;h<50;h++){
								if(g[h] == tile){
									foundDanger = true;
								}
							}
								
						}
					}
					
				}
		return foundDanger;
	}
	
}
