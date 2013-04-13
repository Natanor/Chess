
/**
 * Written by Natanel Ficher
 * April 2013
 */

import org.lwjgl.opengl.GL11;


public class RenderTileEffect {
	RenderTileEffect(int width, int hight, int tilePos, float r , float g, float b){
		GL11.glColor3f(r, g, b);
		
		GL11.glPushMatrix();
		GL11.glTranslatef(0, 0, 0);
		GL11.glTranslatef(0, 0, 0);

		GL11.glBegin(GL11.GL_QUADS);
			GL11.glVertex2f((tilePos/10)*(width/8)+(width/8),(tilePos - Math.abs((tilePos/10)*10)) *(hight/8)+(hight/8));
			GL11.glVertex2f((tilePos/10)*(width/8),(tilePos - Math.abs((tilePos/10)*10)) *(hight/8)+(hight/8));
			GL11.glVertex2f((tilePos/10)*(width/8),(tilePos - Math.abs((tilePos/10)*10)) *(hight/8));
			GL11.glVertex2f((tilePos/10)*(width/8)+(width/8),(tilePos - Math.abs((tilePos/10)*10)) *(hight/8));
		GL11.glEnd();
		GL11.glPopMatrix();
	}
	
	RenderTileEffect(int width, int hight, int tilePos){
		GL11.glPushMatrix();
		GL11.glTranslatef(0, 0, 0);
		GL11.glTranslatef(0, 0, 0);

		GL11.glBegin(GL11.GL_QUADS);
			GL11.glVertex2f((tilePos/10)*(width/8)+(width/8),(tilePos - Math.abs((tilePos/10)*10)) *(hight/8)+(hight/8));
			GL11.glVertex2f((tilePos/10)*(width/8),(tilePos - Math.abs((tilePos/10)*10)) *(hight/8)+(hight/8));
			GL11.glVertex2f((tilePos/10)*(width/8),(tilePos - Math.abs((tilePos/10)*10)) *(hight/8));
			GL11.glVertex2f((tilePos/10)*(width/8)+(width/8),(tilePos - Math.abs((tilePos/10)*10)) *(hight/8));
		GL11.glEnd();
		GL11.glPopMatrix();
	}
}
