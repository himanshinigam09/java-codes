import java.awt.*;
import java.applet.Applet;
public class AppletAvg extends Applet
{
	TextField t1,t2,t3,t4;
	String s1="Physics";
	String s2 ="Chem";
	String s3 = "Maths";
	String s4 = "Eng";
	public void init()
	{
		t1 = new TextField(20);
		t2 = new TextField(20);
		t3 = new TextField(20);
		t4 = new TextField(20);
		add(t1);
		add(t2);
		add(t3);
		add(t4);
		t1.setText("88");
		t2.setText("90");
		t3.setText("79");

	}
	public void paint(Graphics g)
	{
		String m1,m2,m3,m4;
		int i1,i2,i3;
		float i4;
		m1=t1.getText();
		m2=t2.getText();
		m3=t3.getText();
		
		i1=Integer.parseInt(m1);
		i2=Integer.parseInt(m2);
		i3=Integer.parseInt(m3);
        i4=(i1 +i2 +i3)/3;
        t4.setText(""+i4);
        m4=t4.getText();
        
        g.drawString(s1,10,10);
        
        g.drawString(s2,50,50);
        g.drawString(s3,100,100);





  }
}
/* <applet code="AppletAvg.class" width=500 height=500>
</applet> */