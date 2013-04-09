
public class CalcMovesKing  {

	int sx;
	int sy;
	int[] a = new int[50];
	boolean white;
	Board board;
	int moves = 8;
	int attacks =0;
	
	CalcMovesKing(int SelectedTile, Board board1){
		sx = SelectedTile/10;
		sy = SelectedTile - sx*10;
		white =board1.pieceAt[sx][sy].white;
		board = board1;
		for(int i=0;i<50;i++){
			a[i] = -1;
		}
		
				
	}
	int[] GetMoves(){
		for(int i = -1; i<2;i++)
			for(int j = -1; j<2; j++){
				if((sx+i) >=0 && (sx+i)<=7 && (sy+j) >=0 && (sy+j)<=7){
					if(board.pieceAt[sx+i][sy+j].piece == Piece.Empty && !board.isTileInDangerTo(white, (sx+i)*10+(sy+j))){
						a[moves]= (sx+i)*10 + (sy+j);
						moves++;
					}else{
						if(board.pieceAt[sx+i][sy+j].white!=white && !board.isTileInDangerTo(white, (sx+i)*10+(sy+j))){
							a[attacks]= (sx+i)*10 + (sy+j);
							attacks++;
						}
					}
				}
			}
		if(sx == 4 && sy == 0 && white == true){
			if(	   board.canCastleWL 
					&& board.pieceAt[3][0].piece == Piece.Empty
					&& board.pieceAt[2][0].piece == Piece.Empty
					&& !board.isTileInDangerTo(true, 30)
					&& !board.isTileInDangerTo(true, 20)){
				a[48] = 20;
			}
			if(	   board.canCastleWR 
				&& board.pieceAt[5][0].piece == Piece.Empty
				&& board.pieceAt[6][0].piece == Piece.Empty
				&& !board.isTileInDangerTo(true, 50)
				&& !board.isTileInDangerTo(true, 60)){
				a[49] = 60;
			}
		}
		if(sx == 4 && sy == 7 && white == false){
			if(	   board.canCastleBL 
					&& board.pieceAt[3][7].piece == Piece.Empty
					&& board.pieceAt[2][7].piece == Piece.Empty
					&& !board.isTileInDangerTo(false, 37)
					&& !board.isTileInDangerTo(false, 27)){
				a[48] = 27;
			}
			if(	   board.canCastleBR 
				&& board.pieceAt[5][7].piece == Piece.Empty
				&& board.pieceAt[6][7].piece == Piece.Empty
				&& !board.isTileInDangerTo(false, 57)
				&& !board.isTileInDangerTo(false, 67)){
				a[49] = 67;
			}
		}
		
		return a;
				
	}
}
