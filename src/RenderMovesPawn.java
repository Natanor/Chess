
public class RenderMovesPawn {

	public RenderMovesPawn(int width, int hight, int selectedTile, Board board) {
		CalcMovesPawn mp = new CalcMovesPawn(selectedTile,board);
		int[] a = mp.GetMoves();
		for(int i=0; i<2;i++){
			if((a[i]/10 +a[i]) % 2 ==0){
				new RenderTileEffect(width, hight, a[i], 0.3f, 0.5f, 0.8f);
			}else{
				new RenderTileEffect(width, hight, a[i], 0.5f, 0.6f, 0.9f);
			}
			
		}
		for(int i=2; i<4;i++){
			if((a[i]/10 +a[i]) % 2 ==0){
				new RenderTileEffect(width, hight, a[i], 0.8f, 0.5f, 0.3f);
			}else{
				new RenderTileEffect(width, hight, a[i], 0.9f, 0.6f, 0.5f);
			}
			
		}
	}

}
