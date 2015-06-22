Interface P
{
	final double PI = 3.14;	
	void displayP();
}
Interface P1 extends P
{
	final String S = "JAVA";
	void displayP1();
}
Interface P2 extends P
{
	final int I = 45;
	void displayP2();
}
Interface P12 extends P1,P2
{
	final float F = 66.66;
	void displayP12();
}
class Q implements P12
{
	public static void main(String args[])
	{
		void displayP()
		{
			System.out.println("val. of cons. is:"+PI);
		}
		void displayP1()
		{
			System.out.println("val. of cons. is:"+S);
		}
		void displayP2()
		{
			System.out.println("val. of cons. is:"+I);
		}
		void displayP12()
		{
			System.out.println("val. of cons. is:"+F);
		}
		Q q = new Q();
		q.displayP();
		q.displayP1();
		q.displayP2();
		q.displayP12();
	
	}

}