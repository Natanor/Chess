
/**
 * Written by Natanel Ficher
 * April 2013
 */

import org.lwjgl.opengl.GL11;


public class RenderBoard {
	RenderBoard(int width, int hight){
		
		GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);

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
		}
		
		
	}
}
