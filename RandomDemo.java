public class RandomDemo implements Runnable
{
	public void run()
	{	System.out.println("Press ctrl+c to stop");
		try
		{
			while(true)
			{
				System.out.println("The random no. is " +randomWithRange(5,10));
				Thread.sleep(3000);
			}

		}
		catch(InterruptedException e)
		{
			System.out.println("Interrupt occured!");
		}
	}
	public static void main(String[] args) 
	{
		RandomDemo rd = new RandomDemo();
		Thread t = new Thread(rd,"DemoThread");
		t.start();	
	}
	double randomWithRange(int min, int max)
	{
	   int range = (max - min);     
	   return (double)(Math.random() * 1.0*range) + min;
	}


}

