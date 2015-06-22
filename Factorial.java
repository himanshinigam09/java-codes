class Factorial
{

  static long factorial ( long n )
 {
    long fact = 1;
    for (long x = n; x > 1; x--)
      fact *= x;

  
     System.out.println("Factorial is "+fact);
     return fact;

  } 
  public static void main(String[] args) 
  {
	
	factorial(10);
	
	
  } 
}