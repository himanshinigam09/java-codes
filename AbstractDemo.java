class AbstractDemo
{
  public static void main(String[] args) 
  {
	Triangle t = new Triangle();
	Rectangle r = new Rectangle();
	Circle c = new Circle();
	t.display();
	r.display();
	c.display();
  }
}
abstract class Shape
{
	abstract void display();
}
class Triangle extends Shape
{
	public void display()
	{
		System.out.println("This is display of triangle");
	}
}
class Rectangle extends Shape
{
	public void display()
	{
		System.out.println("This is display of rectangle");
	}
}
class Circle extends Shape
{
	public void display()
	{
		System.out.println("This is display of circle");
	}
}