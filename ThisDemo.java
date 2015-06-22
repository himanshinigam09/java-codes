/* using this in calling methods */
class ThisDemo
{
	int s,a,b;
	double avg;
	ThisDemo()
	{
		this.a = a;
		this.b = b;
	}
	int sum(int a,int b)
	{
		s = a + b;
		
		System.out.println("Sum:"+s);
		return s;

	}
	double avg(int a,int b)
	{
		avg = ((float)(a+b)/2);
		
		System.out.println("Average is:"+avg);
		return avg;
	}
	void show()
	{
		this.sum(4,3);
		this.avg(4,3);
	}
	public static void main(String[] agrs)
	{
		ThisDemo t1 = new ThisDemo();
		t1.show();
	}
}