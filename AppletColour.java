import java.awt.*;
import java.applet.Applet;
public class AppletColour extends Applet
{
	TextField t1;
	String s1;
	public void init()
	{
		t1 = new TextField(10);
		add(t1);
		s1 = getParameter("colour");
		t1.setText(s1);

	}
	public void paint(Graphics g)
	{
		g.draw3DRect(50,50,40,40,true);
		
		
		if(s1.equals("Red"))
		{	
		g.setColor(Color.red);
		g.fillRect(50,50,40,40);
		g.drawString("RED",60,60);
	    }
	    else
	   { 	
	    g.setColor(Color.blue);
		g.fillRect(50,50,40,40);
		g.drawString("BLUE",60,60);}


		
	}
	


}
/* <applet code="AppletColour.class" width=300 height=400>
<param name="colour" value = "Red">
</applet> */