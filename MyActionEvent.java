import java.awt.event.*;
import java.applet.Applet;
import java.awt.*;

public class MyActionEvent extends Applet implements ActionListener
{	TextField t1,t2,t3 ;
		Button b;
		int i,j;
	public void init()
	{
		
		t1= new TextField(10);
		t2= new TextField(10);
		t3= new TextField(10);
		b = new Button("Area Of Rectangle");
		add(t1);
		add(t2);
		add(t3);
		add(b);
		b.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		
		i = Integer.parseInt(t1.getText());
		j =  Integer.parseInt(t2.getText());

		String s = Integer.toString(i*j);
		t3.setText(s);
	}

	

}
/*<applet code ="MyActionEvent.class" height=300 width=300></applet>*/