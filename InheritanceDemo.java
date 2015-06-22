class InheritanceDemo
{
  public static void main(String[] args) 
  {
    N n = new N();
    System.out.println("double val = "+ n.d + "\nfloat val = " +n.f+"\nstring val = "+ n.s);
  }
}
class M extends Object
{
  float f = 1.11f;
  String s = "fabulous";
}
class N extends M
{
  double d =44.44;
}