import java.awt.event.*;
import java.applet.Applet;
import java.awt.*;
public class ShapeMaker extends Applet implements ActionListener
{
	CheckBox c1,c2,c3;
	Button b1,b2,b3;

	public void init()
	{
		b1 = new Button("Rectangle");
		b2 = new Button("Oval");
		b3 = new Button("Square");

		c1 = new CheckBox("Pink")
		c2 = new CheckBox("Blue")
		c3 = new CheckBox("Yellow")

		add(b1)
		add(b2)
		add(b3)
		add(c1)
		add(c2)
		add(c3)

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		c1.addActionListener(this);
		c2.addActionListener(this);
		c3.addActionListener(this);
	}

	public void actionPerformed(ActionListener ae)
	{
		if(ae.getSource()==b1)
	}
}