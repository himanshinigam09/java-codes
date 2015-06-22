class PassArray
{
	static int a[] = {1, 5, 4};
	public static void main(String args[])
	{
		PassArray p = new PassArray();
		System.out.println("Array before funtion call");
		for(int x : a)
		{
			System.out.println(x);
		}
		System.out.println("Array after function call");
		p.modifyArray(a);
		for(int y : a)
		{
			System.out.println(y);
		}
		
	}
	int modifyArray(int k[])
	{
		for(int i=0;i<3;i++)
		{
            k[i]*=2;
            
        }
    return k[2];
        
    } 

}

            
     

