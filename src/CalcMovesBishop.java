
public class CalcMovesBishop extends CalcMoves{

	int sx;
	int sy;
	int[] a = new int[50];
	boolean white;
	Board board;
	int zy;
	int zx;
	int i =1;
	int moves = 4;
	int attacks =0;
	boolean reachedBlock=false;
	
	CalcMovesBishop(int SelectedTile, Board board1){
		sx = SelectedTile/10;
		sy = SelectedTile - sx*10;
		white =board1.pieceAt[sx][sy].white;
		board = board1;
		for(int i=0;i<50;i++){
			a[i] = -1;
		}
		
				
	}
	int[] GetMoves(){
		for(zx =1; zx>-2; zx = zx-2){
			for(zy =1; zy>-2; zy = zy-2){
				while(!reachedBlock && (sx+(i*zx)) >= 0 && (sx+(i*zx))<=7 && (sy+(zy*i)) >= 0 && (sy+(zy*i))<=7 ){
					if(board.pieceAt[sx+(i*zx)][sy+(i*zy)].piece!=Piece.Empty){
						reachedBlock =true;
						if(board.pieceAt[sx+(i*zx)][sy+(i*zy)].white != board.pieceAt[sx][sy].white){
							if(isMoveLegit(sx*10 + sy,(sx+i*zx)*10 + (sy+(i*zy)), board)){
								a[attacks] = (sx+(i*zx))*10 +(sy +(i*zy));
								attacks++;
							}
						}
					}else{
						if(isMoveLegit(sx*10 + sy,(sx+i*zx)*10 + (sy+(i*zy)), board)){
							a[moves] = (sx+i*zx)*10 + (sy+(i*zy));
							moves++;
						}
					}
					i++;	
				}
				reachedBlock = false;
				i =1;
				
			}
		}
		return a;
				
	}
	
	int[] GetMoves2(){
		for(zx =1; zx>-2; zx = zx-2){
			for(zy =1; zy>-2; zy = zy-2){
				while(!reachedBlock && (sx+(i*zx)) >= 0 && (sx+(i*zx))<=7 && (sy+(zy*i)) >= 0 && (sy+(zy*i))<=7 ){
					if(board.pieceAt[sx+(i*zx)][sy+(i*zy)].piece!=Piece.Empty){
						reachedBlock =true;
						if(board.pieceAt[sx+(i*zx)][sy+(i*zy)].white != board.pieceAt[sx][sy].white){
							a[attacks] = (sx+(i*zx))*10 +(sy +(i*zy));
							attacks++;
						}
					}else{
						a[moves] = (sx+i*zx)*10 + (sy+(i*zy));
						moves++;
					}
					i++;	
				}
				reachedBlock = false;
				i =1;
				
			}
		}
		return a;
				
	}
}
