import org.lwjgl.LWJGLException;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;


public class StartDisplay {
	
	long lastFrame;
	int fps;
	long lastFPS;
	int width;
	int hight;
	int mx;
	int my;
	boolean lMouse;
	Board board = new Board();
	MouseStuff m = new MouseStuff(this);
	int z =0;
	
	public void start(int width, int hight, String title){
		try {
			Display.setDisplayMode(new DisplayMode(width, hight));
			Display.create();
			Display.setTitle(title);
			Display.setResizable(true);
			
			Mouse.create();
		} catch (LWJGLException e) {
			e.printStackTrace();
			System.exit(0);
		}
		initGL(width, hight); 
		
	
		while (!Display.isCloseRequested()) {
			renderGLBoard();
			displayUpdate();
			userUpdate();
			renderGLEffect();
			chessUpdate();
			renderGLPieces();
			Display.update();
		}
		Mouse.destroy();
		Display.destroy();
		
	}
	
	
    private void renderGLEffect() {
		if(((m.SelectedTile/10) + (m.SelectedTile-(m.SelectedTile/10)*10))%2 == 0){
			GL11.glColor3f(0.9f, 0.9f, 0.2f);
		}else{
			GL11.glColor3f(0.7f, 0.7f, 0.0f);
		}
		new RenderTileEffect(width,hight,m.SelectedTile);
		if(m.SelectedTile > -0.5){
			if(board.pieceAt[m.SelectedTile/10][m.SelectedTile - (m.SelectedTile/10)*10].piece != Piece.Empty){
				new RenderMoves(width,hight,m.SelectedTile,board);
			}
				
		}
		
		
	}


	private void userUpdate() {
		m.setSelectedTile();
		
		
	}

	private void renderGLPieces() {
		for(int i = 0; i<8;i++){
			for(int j =0; j<8; j++){
				if(board.pieceAt[i][j].piece != Piece.Empty){
					if(board.pieceAt[i][j].white){
						GL11.glColor3f(1f, 1f, 1f);
					}else{
						GL11.glColor3f(0f, 0f, 0f);
					}
					if(board.pieceAt[i][j].piece == Piece.PAWN){
						new RenderPawn(width, hight, i, j);
					}
					if(board.pieceAt[i][j].piece == Piece.ROOK){
						new RenderRook(width,hight,i,j);
					}
					if(board.pieceAt[i][j].piece == Piece.BISHOP){
						new RenderBishop(width,hight,i,j);
					}
					if(board.pieceAt[i][j].piece == Piece.KNIGHT){
						new RenderKnight(width,hight,i,j);
					}
					if(board.pieceAt[i][j].piece == Piece.QUEEN){
						new RenderQueen(width,hight,i,j);
					}
					if(board.pieceAt[i][j].piece == Piece.KING){
						new RenderKing(width,hight,i,j);
					}
				}
			}
		}
		
		
	}

	private void displayUpdate() {
		width = Display.getWidth();
		hight = Display.getHeight();
		mx = Mouse.getX();
		my = Mouse.getY();
		lMouse = Mouse.isButtonDown(0);
		//System.out.println("" +mx +" "+my +" " +lMouse);
	}

	private void chessUpdate() {
		if(m.SelectedTile > -0.5f && m.LastSelectedTile > -0.5f){	
			if(board.pieceAt[m.LastSelectedTile/10][m.LastSelectedTile - (m.LastSelectedTile/10)*10].white == board.whiteTurn){
				if(board.pieceAt[m.LastSelectedTile/10][m.LastSelectedTile - (m.LastSelectedTile/10)*10].piece == Piece.PAWN){
					CalcMovesPawn mp = new CalcMovesPawn(m.LastSelectedTile,board);
					int[] a = mp.GetMoves();
					for(int i=0;i<a.length;i++){
						if(a[i] == m.SelectedTile){
							performMove(m.LastSelectedTile,m.SelectedTile,board);
						}
					}
				}
				
				if(board.pieceAt[m.LastSelectedTile/10][m.LastSelectedTile - (m.LastSelectedTile/10)*10].piece == Piece.BISHOP){
					CalcMovesBishop mb = new CalcMovesBishop(m.LastSelectedTile,board);
					int[] a = mb.GetMoves();
					for(int i=0;i<a.length;i++){
						if(a[i] == m.SelectedTile){
							performMove(m.LastSelectedTile,m.SelectedTile,board);
						}
					}
				}
				if(board.pieceAt[m.LastSelectedTile/10][m.LastSelectedTile - (m.LastSelectedTile/10)*10].piece == Piece.ROOK){
					CalcMovesRook mr = new CalcMovesRook(m.LastSelectedTile,board);
					int[] a = mr.GetMoves();
					for(int i=0;i<a.length;i++){
						if(a[i] == m.SelectedTile){
							performMove(m.LastSelectedTile,m.SelectedTile,board);
						}
					}
				}
				if(board.pieceAt[m.LastSelectedTile/10][m.LastSelectedTile - (m.LastSelectedTile/10)*10].piece == Piece.QUEEN){
					CalcMovesQueen mq = new CalcMovesQueen(m.LastSelectedTile,board);
					int[] a = mq.GetMoves();
					for(int i=0;i<a.length;i++){
						if(a[i] == m.SelectedTile){
							performMove(m.LastSelectedTile,m.SelectedTile,board);
						}
					}
				}
				if(board.pieceAt[m.LastSelectedTile/10][m.LastSelectedTile - (m.LastSelectedTile/10)*10].piece == Piece.KING){
					CalcMovesKing mk = new CalcMovesKing(m.LastSelectedTile,board);
					int[] a = mk.GetMoves();
					for(int i=0;i<a.length;i++){
						if(a[i] == m.SelectedTile){
							performMove(m.LastSelectedTile,m.SelectedTile,board);
						}
					}
				}
				if(board.pieceAt[m.LastSelectedTile/10][m.LastSelectedTile - (m.LastSelectedTile/10)*10].piece == Piece.KNIGHT){
					CalcMovesKnight mkn = new CalcMovesKnight(m.LastSelectedTile,board);
					int[] a = mkn.GetMoves();
					for(int i=0;i<a.length;i++){
						if(a[i] == m.SelectedTile){
							performMove(m.LastSelectedTile,m.SelectedTile,board);
						}
					}
				}
			}
		}
		
	}

	private void performMove(int lastSelectedTile, int selectedTile,Board board) {
		board.pieceAt[selectedTile/10][selectedTile - (selectedTile/10)*10].piece = board.pieceAt[lastSelectedTile/10][lastSelectedTile - (lastSelectedTile/10)*10].piece;
		board.pieceAt[selectedTile/10][selectedTile - (selectedTile/10)*10].white = board.pieceAt[lastSelectedTile/10][lastSelectedTile - (lastSelectedTile/10)*10].white;
		board.pieceAt[lastSelectedTile/10][lastSelectedTile - (lastSelectedTile/10)*10].piece = Piece.Empty;
		board.whiteTurn = !board.whiteTurn;
	}


	private void renderGLBoard() {
				new RenderBoard(width,hight);
		}
		
	


	private void initGL(int width, int hight) {
		GL11.glMatrixMode(GL11.GL_PROJECTION);
		GL11.glLoadIdentity();
		GL11.glOrtho(0, width, 0, hight, 1, -1);
		GL11.glMatrixMode(GL11.GL_MODELVIEW);
		//GL11.glEnable(GL11.GL_BLEND);
		//GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
	}

}