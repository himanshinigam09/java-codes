class VariableHiding
{
  public static void main(String[] args) 
  {
    S s = new S();
    P p = new P();
    System.out.println("S :"+s.x);
    System.out.println("P : "+p.x);
  }
}
class S
{
  int x=7;
}
class P extends S
{
  StringBuffer x = new StringBuffer("I am great");
}