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
		GL11.glPushMatrix();
		GL11.glTranslatef(0, 0, 0);
		GL11.glTranslatef(0, 0, 0);

		GL11.glBegin(GL11.GL_QUADS);
			GL11.glVertex2f((m.SelectedTile/10)*(width/8)+(width/8),(m.SelectedTile - (m.SelectedTile/10)*10) *(hight/8)+(hight/8));
			GL11.glVertex2f((m.SelectedTile/10)*(width/8), (m.SelectedTile - (m.SelectedTile/10)*10) *(hight/8)+(hight/8));
			GL11.glVertex2f((m.SelectedTile/10)*(width/8), (m.SelectedTile - (m.SelectedTile/10)*10) *(hight/8));
			GL11.glVertex2f((m.SelectedTile/10)*(width/8)+(width/8),(m.SelectedTile - (m.SelectedTile/10)*10) *(hight/8));
		GL11.glEnd();
		GL11.glPopMatrix();
		
		
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
		
		
	}

	private void renderGLBoard() {
		/*GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);

				GL11.glColor3f(0.4f, 0.4f, 0.4f);
				for (int i =0; i < (width-1); i = i+(width/4) ){
					for(int j = 0; j < (hight-1); j = j+(hight/4)){
						GL11.glPushMatrix();
							GL11.glTranslatef(0, 0, 0);
					
							GL11.glBegin(GL11.GL_QUADS);
								GL11.glVertex2f(i+(width/8),j+(hight/8));
								GL11.glVertex2f(i, j+(hight/8));
								GL11.glVertex2f(i, j );
								GL11.glVertex2f(i+(width/8),j );
							GL11.glEnd();
							GL11.glPopMatrix();
					}
				}
				
				GL11.glColor3f(0.4f, 0.4f, 0.4f);
				for (int i =(width/8); i < (width-1); i = i+(width/4) ){
					for(int j = (hight/8); j < (hight-1); j = j+(hight/4)){
						GL11.glPushMatrix();
							GL11.glTranslatef(0, 0, 0);
							GL11.glTranslatef(0, 0, 0);
					
							GL11.glBegin(GL11.GL_QUADS);
								GL11.glVertex2f(i+(width/8),j+(hight/8));
								GL11.glVertex2f(i, j+(hight/8));
								GL11.glVertex2f(i, j );
								GL11.glVertex2f(i+(width/8),j );
							GL11.glEnd();
							GL11.glPopMatrix();
					}
				}
				GL11.glColor3f(0.75f, 0.75f, 0.75f);
				for (int i =(width/8); i < (width-1); i = i+(width/4) ){
					for(int j = 0; j < (hight-1); j = j+(hight/4)){
						GL11.glPushMatrix();
							GL11.glTranslatef(0, 0, 0);
					
							GL11.glBegin(GL11.GL_QUADS);
								GL11.glVertex2f(i+(width/8),j+(hight/8));
								GL11.glVertex2f(i, j+(hight/8));
								GL11.glVertex2f(i, j );
								GL11.glVertex2f(i+(width/8),j );
							GL11.glEnd();
							GL11.glPopMatrix();
					}
				}
				
				GL11.glColor3f(0.75f, 0.75f, 0.75f);
				for (int i =0; i < (width-1); i = i+(width/4) ){
					for(int j = (hight/8); j < (hight-1); j = j+(hight/4)){
						GL11.glPushMatrix();
							GL11.glTranslatef(0, 0, 0);
							GL11.glTranslatef(0, 0, 0);
					
							GL11.glBegin(GL11.GL_QUADS);
								GL11.glVertex2f(i+(width/8),j+(hight/8));
								GL11.glVertex2f(i, j+(hight/8));
								GL11.glVertex2f(i, j );
								GL11.glVertex2f(i+(width/8),j );
							GL11.glEnd();
							GL11.glPopMatrix();
					}
				}*/
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