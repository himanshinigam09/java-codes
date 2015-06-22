class ParameterizedCons
{
	int x;
	public static void main(String args[])
	{
		ParameterizedCons p = new ParameterizedCons(5);
		p.show();

	}
	ParameterizedCons(int y)
	{
		x=y;
	}
	void show()
	{
		System.out.println(x);
	}
}