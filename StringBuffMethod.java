class StringBuffMethod
{
   public static void main(String[] args) 
   {
     StringBuffer s1= new StringBuffer("I love ");
     StringBuffer s2=s1.append("Java programming");
     System.out.println(s2);
	 StringBuffer s3=s1.insert(7,"C++ and ");
	 System.out.println(s3);
	 StringBuffer s4=s1.delete(0,6);
	 System.out.println(s4);
	 StringBuffer s5=s1.deleteCharAt(0);
	 System.out.println(s5);
	 StringBuffer s6=s1.replace(0,3,"C");
	 System.out.println(s6);
	}
}