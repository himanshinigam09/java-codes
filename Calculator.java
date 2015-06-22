import java.awt.event.*;
import java.applet.Applet;
import java.awt.*;
public class Calculator extends Applet implements ActionListener
{
	int i, j, k;
	Button sum,mult,div,sub,per,clr;
	TextField tf1,tf2,tf3;

	public void init()
	{
		clr = new Button("clear");
		sum = new Button("sum");
		mult = new Button("multiply");
		sub = new Button("Subtarct");
		div = new Button("Divide");
		per = new Button("percent");
		tf1 = new TextField(10);
		tf2 = new TextField(10);
		tf3 = new TextField(10);
		add(sum);
		add(mult);
		add(sub);
		add(div);
		add(per);
		add(tf1);
		add(tf2);
		add(tf3);
		add(clr);
		sum.addActionListener(this);
		sub.addActionListener(this);
		mult.addActionListener(this);
		per.addActionListener(this);
		div.addActionListener(this);
		clr.addActionListener(this);


	}
	public void actionPerformed(ActionEvent ae)
	{
		i = Integer.parseInt(tf1.getText());
		j = Integer.parseInt(tf2.getText());

		if(ae.getSource()==sum)
		{
			k = i+j;
		}
		
		if(ae.getSource()==mult)
		{

			k=i*j;
		}
		if(ae.getSource()==div)
		{
			k = i/j;
		}
		if(ae.getSource()==sub)
		{
			k = i-j;
		}
		if(ae.getSource()==per)
		{
			k = i/j*100
;		}
		String str = Integer.toString(k);
		tf3.setText(str);
		if(ae.getSource()==clr)
		{
			tf1.setText("");
			tf2.setText("");
			tf3.setText("");

		}
	}

	}
	/* <applet code = Calculator.class width=500 height = 500>
	</applet> */