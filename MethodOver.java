class MethodOver
{
	int a, b;
	void area(float a)
	{
		System.out.println("Area of square is:"+(a*a));

	}
	void area(float a,float b)
	{
		System.out.println("area of rectangle is:"+(a*b));
	}
	public static void main(String[] args)
	{
		MethodOver m1 = new MethodOver();
		m1.area(5);
		m1.area(4,5);
		
	}
}