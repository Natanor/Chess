import org.lwjgl.opengl.GL11;


public class RenderQueen {
	RenderQueen(int width,int hight, int i, int j){
			
		GL11.glPushMatrix();
		GL11.glTranslatef(i*(width/8), j*(hight/8), 0);

		GL11.glBegin(GL11.GL_QUADS);
			GL11.glVertex2f((float) (0.80*(width/8)),(float) (0.10*(hight/8)));
			GL11.glVertex2f((float) (0.20*(width/8)),(float) (0.10*(hight/8)));
			GL11.glVertex2f((float) (0.20*(width/8)),(float) (0.15*(hight/8)));
			GL11.glVertex2f((float) (0.80*(width/8)),(float) (0.15*(hight/8)));
		GL11.glEnd();
		GL11.glPopMatrix();
	}
}
