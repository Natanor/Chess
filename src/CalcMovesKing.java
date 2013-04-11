
public class CalcMovesKing extends CalcMoves {

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
		boolean nextToKing = false;
		for(int i = -1; i<2;i++){
			for(int j = -1; j<2; j++){
				if((sx+i) >=0 && (sx+i)<=7 && (sy+j) >=0 && (sy+j)<=7){
					if(board.pieceAt[sx+i][sy+j].piece == Piece.Empty){
						if(isMoveLegit(sx*10 + sy,(sx+i)*10 + (sy+j), board)){
							for(int ih = -1; ih<2;ih++){
								for(int jh = -1; jh<2; jh++){
									if((sx+i+ih) >=0 && (sx+i+ih)<=7 && (sy+j+jh) >=0 && (sy+j+jh)<=7){
										if(board.pieceAt[sx+i+ih][sy+j+jh].piece == Piece.KING && board.pieceAt[sx+i+ih][sy+j+jh].white != board.pieceAt[sx][sy].white	){
											nextToKing = true;
										}
									}
								}
							}
							if(!nextToKing){
								a[moves]= (sx+i)*10 + (sy+j);
								moves++;
							}
							nextToKing = false;
						}
					}else{
						if(board.pieceAt[sx+i][sy+j].white!=white){
							if(isMoveLegit(sx*10 + sy,(sx+i)*10 + (sy+j), board)){	
								a[attacks]= (sx+i)*10 + (sy+j);
								attacks++;
							}
						}
					}
				}
			}
		}
		if(sx == 4 && sy == 0 && white == true){
			if(	   board.canCastleWL 
					&& board.pieceAt[3][0].piece == Piece.Empty
					&& board.pieceAt[2][0].piece == Piece.Empty
					&& isMoveLegit(40, 30, board)
					&& isMoveLegit(40, 20, board)){
				a[48] = 20;
			}
			if(	   board.canCastleWR 
				&& board.pieceAt[5][0].piece == Piece.Empty
				&& board.pieceAt[6][0].piece == Piece.Empty
				&& isMoveLegit(40, 50, board)
				&& isMoveLegit(40, 60, board)){
				a[49] = 60;
			}
		}
		if(sx == 4 && sy == 7 && white == false){
			if(	   board.canCastleBL 
					&& board.pieceAt[3][7].piece == Piece.Empty
					&& board.pieceAt[2][7].piece == Piece.Empty
					&& isMoveLegit(47, 37, board)
					&& isMoveLegit(47, 27, board)){
				a[48] = 27;
			}
			if(	   board.canCastleBR 
				&& board.pieceAt[5][7].piece == Piece.Empty
				&& board.pieceAt[6][7].piece == Piece.Empty
				&& isMoveLegit(47, 57, board)
				&& isMoveLegit(47, 67, board)){
				a[49] = 67;
			}
		}
		return a;
	}
	int[] GetMoves2(){
		for(int i = -1; i<2;i++){
			for(int j = -1; j<2; j++){
				if((sx+i) >=0 && (sx+i)<=7 && (sy+j) >=0 && (sy+j)<=7){
					if(board.pieceAt[sx+i][sy+j].piece == Piece.Empty){
						a[moves]= (sx+i)*10 + (sy+j);
						moves++;
					}else{
						if(board.pieceAt[sx+i][sy+j].white!=white){
							a[attacks]= (sx+i)*10 + (sy+j);
							attacks++;
						}
					}
				}
			}
		}
		return a;	
	}
}
