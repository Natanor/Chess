import org.lwjgl.opengl.GL11;


public class RenderRook {

	RenderRook(int width,int hight,int i,int j){
		GL11.glPushMatrix();
		GL11.glTranslatef(i*(width/8), j*(hight/8), 0);

		GL11.glBegin(GL11.GL_TRIANGLES);
			GL11.glVertex2f((float) (0.50*(width/8)),(float) (0.70*(hight/8)));
			GL11.glVertex2f((float) (0.85*(width/8)),(float) (0.20*(hight/8)));
			GL11.glVertex2f((float) (0.15*(width/8)),(float) (0.20*(hight/8)));
		GL11.glEnd();
		GL11.glPopMatrix();
		//-
		GL11.glPushMatrix();
		GL11.glTranslatef(i*(width/8), j*(hight/8), 0);

		GL11.glBegin(GL11.GL_QUADS);
			GL11.glVertex2f((float) (0.15*(width/8)),(float) (0.10*(hight/8)));
			GL11.glVertex2f((float) (0.85*(width/8)),(float) (0.10*(hight/8)));
			GL11.glVertex2f((float) (0.85*(width/8)),(float) (0.20*(hight/8)));
			GL11.glVertex2f((float) (0.15*(width/8)),(float) (0.20*(hight/8)));
		GL11.glEnd();
		GL11.glPopMatrix();
		
		GL11.glPushMatrix();
		GL11.glTranslatef(i*(width/8), j*(hight/8), 0);

		GL11.glBegin(GL11.GL_QUADS);
			GL11.glVertex2f((float) (0.25*(width/8)),(float) (0.30*(hight/8)));
			GL11.glVertex2f((float) (0.25*(width/8)),(float) (0.70*(hight/8)));
			GL11.glVertex2f((float) (0.75*(width/8)),(float) (0.70*(hight/8)));
			GL11.glVertex2f((float) (0.75*(width/8)),(float) (0.30*(hight/8)));
		GL11.glEnd();
		GL11.glPopMatrix();
		//-
		GL11.glPushMatrix();
		GL11.glTranslatef(i*(width/8), j*(hight/8), 0);

		GL11.glBegin(GL11.GL_TRIANGLES);
			GL11.glVertex2f((float) (0.80*(width/8)),(float) (0.75*(hight/8)));
			GL11.glVertex2f((float) (0.20*(width/8)),(float) (0.75*(hight/8)));
			GL11.glVertex2f((float) (0.50*(width/8)),(float) (0.20*(hight/8)));
		GL11.glEnd();
		GL11.glPopMatrix();
		
		GL11.glPushMatrix();
		GL11.glTranslatef(i*(width/8), j*(hight/8), 0);
		
		GL11.glBegin(GL11.GL_QUADS);
			GL11.glVertex2f((float) (0.80*(width/8)),(float) (0.75*(hight/8)));
			GL11.glVertex2f((float) (0.65*(width/8)),(float) (0.75*(hight/8)));
			GL11.glVertex2f((float) (0.65*(width/8)),(float) (0.90*(hight/8)));
			GL11.glVertex2f((float) (0.80*(width/8)),(float) (0.90*(hight/8)));
		GL11.glEnd();
		GL11.glPopMatrix();
		//-
		GL11.glPushMatrix();
		GL11.glTranslatef(i*(width/8), j*(hight/8), 0);

		GL11.glBegin(GL11.GL_QUADS);
			GL11.glVertex2f((float) (0.56*(width/8)),(float) (0.75*(hight/8)));
			GL11.glVertex2f((float) (0.44*(width/8)),(float) (0.75*(hight/8)));
			GL11.glVertex2f((float) (0.44*(width/8)),(float) (0.90*(hight/8)));
			GL11.glVertex2f((float) (0.56*(width/8)),(float) (0.90*(hight/8)));
		GL11.glEnd();
		GL11.glPopMatrix();
		//-
		GL11.glPushMatrix();
		GL11.glTranslatef(i*(width/8), j*(hight/8), 0);

		GL11.glBegin(GL11.GL_QUADS);
			GL11.glVertex2f((float) (0.35*(width/8)),(float) (0.75*(hight/8)));
			GL11.glVertex2f((float) (0.20*(width/8)),(float) (0.75*(hight/8)));
			GL11.glVertex2f((float) (0.20*(width/8)),(float) (0.90*(hight/8)));
			GL11.glVertex2f((float) (0.35*(width/8)),(float) (0.90*(hight/8)));
		GL11.glEnd();
		GL11.glPopMatrix();
	}

}
