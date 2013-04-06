import org.lwjgl.opengl.GL11;


public class RenderKing {
	RenderKing(int width,int hight, int i, int j){
		
		GL11.glPushMatrix();
		GL11.glTranslatef(i*(width/8), j*(hight/8), 0);

		GL11.glBegin(GL11.GL_QUADS);
			GL11.glVertex2f((float) (0.80*(width/8)),(float) (0.10*(hight/8)));
			GL11.glVertex2f((float) (0.20*(width/8)),(float) (0.10*(hight/8)));
			GL11.glVertex2f((float) (0.20*(width/8)),(float) (0.15*(hight/8)));
			GL11.glVertex2f((float) (0.80*(width/8)),(float) (0.15*(hight/8)));
		GL11.glEnd();
		GL11.glPopMatrix();
		
		GL11.glPushMatrix();
		GL11.glTranslatef(i*(width/8), j*(hight/8), 0);

		GL11.glBegin(GL11.GL_QUADS);
			GL11.glVertex2f((float) (0.25*(width/8)),(float) (0.15*(hight/8)));
			GL11.glVertex2f((float) (0.75*(width/8)),(float) (0.15*(hight/8)));
			GL11.glVertex2f((float) (0.60*(width/8)),(float) (0.40*(hight/8)));
			GL11.glVertex2f((float) (0.40*(width/8)),(float) (0.40*(hight/8)));
		GL11.glEnd();
		GL11.glPopMatrix();
		
		GL11.glPushMatrix();
		GL11.glTranslatef(i*(width/8), j*(hight/8), 0);

		GL11.glBegin(GL11.GL_QUADS);
			GL11.glVertex2f((float) (0.65*(width/8)),(float) (0.40*(hight/8)));
			GL11.glVertex2f((float) (0.35*(width/8)),(float) (0.40*(hight/8)));
			GL11.glVertex2f((float) (0.35*(width/8)),(float) (0.45*(hight/8)));
			GL11.glVertex2f((float) (0.65*(width/8)),(float) (0.45*(hight/8)));
		GL11.glEnd();
		GL11.glPopMatrix();
		
		GL11.glPushMatrix();
		GL11.glTranslatef(i*(width/8), j*(hight/8), 0);

		GL11.glBegin(GL11.GL_QUADS);
			GL11.glVertex2f((float) (0.70*(width/8)),(float) (0.60*(hight/8)));
			GL11.glVertex2f((float) (0.30*(width/8)),(float) (0.60*(hight/8)));
			GL11.glVertex2f((float) (0.40*(width/8)),(float) (0.45*(hight/8)));
			GL11.glVertex2f((float) (0.60*(width/8)),(float) (0.45*(hight/8)));
		GL11.glEnd();
		GL11.glPopMatrix();
		
		GL11.glPushMatrix();
		GL11.glTranslatef(i*(width/8), j*(hight/8), 0);

		GL11.glBegin(GL11.GL_QUADS);
			GL11.glVertex2f((float) (0.70*(width/8)),(float) (0.60*(hight/8)));
			GL11.glVertex2f((float) (0.30*(width/8)),(float) (0.60*(hight/8)));
			GL11.glVertex2f((float) (0.45*(width/8)),(float) (0.70*(hight/8)));
			GL11.glVertex2f((float) (0.55*(width/8)),(float) (0.70*(hight/8)));
		GL11.glEnd();
		GL11.glPopMatrix();
		

		GL11.glPushMatrix();
		GL11.glTranslatef(i*(width/8), j*(hight/8), 0);

		GL11.glBegin(GL11.GL_QUADS);
			GL11.glVertex2f((float) (0.55*(width/8)),(float) (0.65*(hight/8)));
			GL11.glVertex2f((float) (0.45*(width/8)),(float) (0.65*(hight/8)));
			GL11.glVertex2f((float) (0.45*(width/8)),(float) (0.97*(hight/8)));
			GL11.glVertex2f((float) (0.55*(width/8)),(float) (0.97*(hight/8)));
		GL11.glEnd();
		GL11.glPopMatrix();
		
		GL11.glPushMatrix();
		GL11.glTranslatef(i*(width/8), j*(hight/8), 0);

		GL11.glBegin(GL11.GL_QUADS);
			GL11.glVertex2f((float) (0.35*(width/8)),(float) (0.77*(hight/8)));
			GL11.glVertex2f((float) (0.65*(width/8)),(float) (0.77*(hight/8)));
			GL11.glVertex2f((float) (0.65*(width/8)),(float) (0.87*(hight/8)));
			GL11.glVertex2f((float) (0.35*(width/8)),(float) (0.87*(hight/8)));
		GL11.glEnd();
		GL11.glPopMatrix();
	}
}
