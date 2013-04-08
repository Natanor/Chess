
public class CalcMovesKing  {

	int sx;
	int sy;
	int[] a = new int[20];
	boolean white;
	Board board;
	int moves = 8;
	int attacks =0;
	
	CalcMovesKing(int SelectedTile, Board board1){
		sx = SelectedTile/10;
		sy = SelectedTile - sx*10;
		white =board1.pieceAt[sx][sy].white;
		board = board1;
		for(int i=0;i<20;i++){
			a[i] = -1;
		}
		
				
	}
	int[] GetMoves(){
		for(int i = -1; i<2;i++)
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
		
		return a;
				
	}
}
