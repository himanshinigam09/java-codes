import java.awt.*;
import java.applet.Applet;
public class ShapeApplet extends Applet{
	public void paint(Graphics g){
		ShapeApplet s1=new ShapeApplet();
		this.setBackground(Color.WHITE);
		g.setColor(Color.RED);
		g.draw3DRect(40,30,120,30,true);
		g.fill3DRect(40,30,120,30,false);

		g.setColor(Color.BLUE);
		g.drawOval(150,130,30,40);
		g.fillOval(150,130,30,40);

		g.setColor(Color.CYAN);
		g.drawRoundRect(120,220,40,50,20,20);
		g.fillRoundRect(120,220,40,50,20,20);
	}
}/* <applet code= "ShapeApplet.class" height=500 width=500>
</applet> */