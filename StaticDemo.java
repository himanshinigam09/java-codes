public class StaticDemo
{
	int x;
	StaticDemo()
	{
		x=x+1;
	}
	public static void main(String args[])
	{
		StaticDemo sd1 = new StaticDemo();
		sd1.show();

		StaticDemo sd2 = new StaticDemo();
		sd2.show();


	}
	void show()
	{
		System.out.println(x);
		System.out.println(x);

	}
}