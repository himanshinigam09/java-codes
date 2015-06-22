import java.util.*;
class MyException extends Exception
{
	double amt_withdraw;
	public MyException(double a_w)
	{
		amt_withdraw=a_w;

	}
	public boolean check()
	{
		if (amt_withdraw>10000 || amt_withdraw<100 || amt_withdraw%100!=0)
		{
			return false;
		}
		else
		{
			return true;
		}

	}
	public String show()
	{   String s="You cannot withdraw more than 10000 or less than 100";
		return s;
		 
	}
}
class ThrowExample
{
	public static void main(String args[])
	{
		Scanner s =new Scanner(System.in);
		System.out.println("enter the amount to withdraw");
		double amt =s.nextDouble();
		try
		{
			MyException me =new MyException(amt);
			boolean c=me.check();
			if (c==true)
			{
				System.out.println("the amount withdraw is " + amt);
			}
			else
				throw me;
		}
		catch (MyException e)
		{
			System.out.println(e.show());
		}	
		
	}

}