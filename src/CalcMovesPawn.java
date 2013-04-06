
public class CalcMovesPawn {
	int sx;
	int sy;
	int[] a = new int[4];
	boolean white;
	Board board;
	int z;
	
	CalcMovesPawn(int SelectedTile, Board board1){
		sx = SelectedTile/10;
		sy = SelectedTile - sx*10;
		white =board1.pieceAt[sx][sy].white;
		board = board1;
		for(int i=0;i<4;i++){
			a[i] = -1;
		}
				
	}
	int[] GetMoves(){
		if (white){
			z=1;
		}else{
			z=-1;
		}
		if(board.pieceAt[sx][sy+z].piece==Piece.Empty){
			a[0] = sx*10+sy+z;
			if(sy == ((7+z)%7)){
				a[1] = sx*10 +sy+2*z;
			}
		}
		if(sx != 0){
			if(board.pieceAt[sx-1][sy+z].white != white && board.pieceAt[sx-1][sy+z].piece != Piece.Empty){
				a[2] = (sx-1)*10 + (sy+z);
			}
		}
		if(sx != 7){
			if(board.pieceAt[sx+1][sy+z].white != white && board.pieceAt[sx+1][sy+z].piece != Piece.Empty){
				a[3] = (sx+1)*10 + (sy+z);
			}
		}
		
		return a;
				
	}
}
