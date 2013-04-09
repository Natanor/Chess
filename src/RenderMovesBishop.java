
public class RenderMovesBishop {
	
	public RenderMovesBishop(int width, int hight, int selectedTile, Board board) {
		CalcMovesBishop mb = new CalcMovesBishop(selectedTile,board);
		int[] a = mb.GetMoves();
		if(board.pieceAt[selectedTile/10][selectedTile - (selectedTile/10)*10].white == board.whiteTurn){
			for(int i=4; i<50;i++){
				if((a[i]/10 +a[i]) % 2 ==0){
					new RenderTileEffect(width, hight, a[i], 0.3f, 0.5f, 0.8f);
				}else{
					new RenderTileEffect(width, hight, a[i], 0.5f, 0.6f, 0.9f);
				}
				
			}
			for(int i=0; i<4;i++){
				if((a[i]/10 +a[i]) % 2 ==0){
					new RenderTileEffect(width, hight, a[i], 0.8f, 0.5f, 0.3f);
				}else{
					new RenderTileEffect(width, hight, a[i], 0.9f, 0.6f, 0.5f);
				}
				
			}
		}
	}

}
