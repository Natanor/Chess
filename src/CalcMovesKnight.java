
/**
 * Written by Natanel Ficher
 * April 2013
 */

public class CalcMovesKnight extends CalcMoves {

	int sx;
	int sy;
	int[] a = new int[50];
	boolean white;
	Board board;
	int moves = 8;
	int attacks =0;
	
	CalcMovesKnight(int SelectedTile, Board board1){
		sx = SelectedTile/10;
		sy = SelectedTile - sx*10;
		white =board1.pieceAt[sx][sy].white;
		board = board1;
		for(int i=0;i<50;i++){
			a[i] = -1;
		}
		
				
	}
	int[] GetMoves(){
		for(int i = -1; i<2;i=i+2){
			for(int j = -1; j<2; j=j+2){
				if((sx+i) >=0 && (sx+i)<=7 && (sy+j*2) >=0 && (sy+j*2)<=7){
					if(board.pieceAt[sx+i][sy+j*2].piece == Piece.Empty){
						if(isMoveLegit(sx*10 + sy, (sx+i)*10 + (sy+j*2), board)){
							a[moves]= (sx+i)*10 + (sy+j*2);
							moves++;
						}
					}else{
						if(board.pieceAt[sx+i][sy+j*2].white!=white){
							if(isMoveLegit(sx*10 + sy, (sx+i)*10 + (sy+j*2), board)){
								a[attacks]= (sx+i)*10 + (sy+j*2);
								attacks++;
							}
						}
					}
					
				}
				if((sx+i*2) >=0 && (sx+i*2)<=7 && (sy+j) >=0 && (sy+j)<=7){
					if(board.pieceAt[sx+i*2][sy+j].piece == Piece.Empty){
						if(isMoveLegit(sx*10 + sy,(sx+i*2)*10 + (sy+j), board)){
							a[moves]= (sx+i*2)*10 + (sy+j);
							moves++;
						}
					}else{
						if(board.pieceAt[sx+i*2][sy+j].white!=white){
							if(isMoveLegit(sx*10 + sy,(sx+i*2)*10 + (sy+j), board)){
								a[attacks]= (sx+i*2)*10 + (sy+j);
								attacks++;
							}
						}
					}
				}
			}
		}
		return a;
				
	}
	int[] GetMoves2(){
		for(int i = -1; i<2;i=i+2){
			for(int j = -1; j<2; j=j+2){
				if((sx+i) >=0 && (sx+i)<=7 && (sy+j*2) >=0 && (sy+j*2)<=7){
					if(board.pieceAt[sx+i][sy+j*2].piece == Piece.Empty){
						a[moves]= (sx+i)*10 + (sy+j*2);
						moves++;
					}else{
						if(board.pieceAt[sx+i][sy+j*2].white!=white){
							a[attacks]= (sx+i)*10 + (sy+j*2);
							attacks++;
						}
					}
					
				}
				if((sx+i*2) >=0 && (sx+i*2)<=7 && (sy+j) >=0 && (sy+j)<=7){
					if(board.pieceAt[sx+i*2][sy+j].piece == Piece.Empty){
							a[moves]= (sx+i*2)*10 + (sy+j);
							moves++;
					}else{
						if(board.pieceAt[sx+i*2][sy+j].white!=white){
								a[attacks]= (sx+i*2)*10 + (sy+j);
								attacks++;
						}
					}
				}
			}
		}
		return a;
				
	}
}
