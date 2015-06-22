import java.util.*;
class EntryException extends Exception
{
	String sub;
	EntryException(String s1)
	{
		
		sub = s1;
		
	}
	public String toString()
	{
		return(" Student should be of MTech");
	}

}
public class ThrowsDemo
{

	static void checkName(String sub) throws EntryException
	{
		if(sub.equals("MTech"))
		{
			System.out.println("Student is allowed");
		}
		else
		{
			
			throw new EntryException(sub);
		}
	}
	public static void main(String[] args) 
	{
	   Scanner s = new Scanner(System.in);
	   System.out.println("Enter name");
	   String name = s.next();
	   System.out.println("Enter Subject");
	   String sub = s.next();
	   try
	   {
	   	checkName(sub);

	   }
	   catch(EntryException e)
	   {
	   	  System.out.println("Exception caught"+e);
	   }	
	} 
}