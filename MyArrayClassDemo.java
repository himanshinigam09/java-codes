import java.util.*;
public class MyArrayClassDemo
{
	public static void main(String[] args) 
	{	int i;
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(String s : args)	
		{
			i=Integer.parseInt(s);
			al.add(i);
		}
		System.out.println("Array contains following elements "+al );	


	}
}