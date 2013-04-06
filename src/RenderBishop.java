import org.lwjgl.opengl.GL11;


public class RenderBishop {

	RenderBishop(int width,int hight,int i,int j)
	{
		GL11.glPushMatrix();
		GL11.glTranslatef(i*(width/8), j*(hight/8), 0);

		GL11.glBegin(GL11.GL_TRIANGLES);
			GL11.glVertex2f((float) (0.50*(width/8)),(float) (0.40*(hight/8)));
			GL11.glVertex2f((float) (0.80*(width/8)),(float) (0.10*(hight/8)));
			GL11.glVertex2f((float) (0.20*(width/8)),(float) (0.10*(hight/8)));
		GL11.glEnd();
		GL11.glPopMatrix();
		
		GL11.glPushMatrix();
		GL11.glTranslatef(i*(width/8), j*(hight/8), 0);

		GL11.glBegin(GL11.GL_QUADS);
			GL11.glVertex2f((float) (0.40*(width/8)),(float) (0.30*(hight/8)));
			GL11.glVertex2f((float) (0.60*(width/8)),(float) (0.30*(hight/8)));
			GL11.glVertex2f((float) (0.55*(width/8)),(float) (0.50*(hight/8)));
			GL11.glVertex2f((float) (0.45*(width/8)),(float) (0.50*(hight/8)));
		GL11.glEnd();
		GL11.glPopMatrix();
		
		GL11.glPushMatrix();
		GL11.glTranslatef(i*(width/8), j*(hight/8), 0);

		GL11.glBegin(GL11.GL_QUADS);
			GL11.glVertex2f((float) (0.50*(width/8)),(float) (0.45*(hight/8)));
			GL11.glVertex2f((float) (0.35*(width/8)),(float) (0.65*(hight/8)));
			GL11.glVertex2f((float) (0.50*(width/8)),(float) (0.85*(hight/8)));
			GL11.glVertex2f((float) (0.65*(width/8)),(float) (0.65*(hight/8)));
		GL11.glEnd();
		GL11.glPopMatrix();
		
		GL11.glPushMatrix();
		GL11.glTranslatef(i*(width/8), j*(hight/8), 0);

		GL11.glBegin(GL11.GL_TRIANGLES);
			GL11.glVertex2f((float) (0.40*(width/8)),(float) (0.90*(hight/8)));
			GL11.glVertex2f((float) (0.60*(width/8)),(float) (0.90*(hight/8)));
			GL11.glVertex2f((float) (0.50*(width/8)),(float) (0.75*(hight/8)));
		GL11.glEnd();
		GL11.glPopMatrix();
	}
}
