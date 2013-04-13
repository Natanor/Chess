
/**
 * Written by Natanel Ficher
 * April 2013
 */


import org.lwjgl.opengl.GL11;


public class RenderPawn {

	RenderPawn(int width, int hight,int i, int j){
		GL11.glPushMatrix();
		GL11.glTranslatef(i*(width/8), j*(hight/8), 0);

		GL11.glBegin(GL11.GL_TRIANGLES);
			GL11.glVertex2f((float) (0.50*(width/8)) ,(float) (0.80*(hight/8)) );
			GL11.glVertex2f((float) (0.80*(width/8)) , (float) (0.10*(hight/8)) );
			GL11.glVertex2f((float) (0.20*(width/8)) , (float) (0.10*(hight/8)));
		GL11.glEnd();
		GL11.glPopMatrix();
		
		GL11.glPushMatrix();
		GL11.glTranslatef(i*(width/8), j*(hight/8), 0);

		GL11.glBegin(GL11.GL_TRIANGLES);
			GL11.glVertex2f((float) (0.50*(width/8)),(float) (0.50*(hight/8)));
			GL11.glVertex2f((float) (0.70*(width/8)), (float) (0.90*(hight/8)));
			GL11.glVertex2f((float) (0.30*(width/8)), (float) (0.90*(hight/8)) );
		GL11.glEnd();
		GL11.glPopMatrix();
		
		
	}
}
