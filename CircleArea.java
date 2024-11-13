import java.io.*;
import java.util.*;
class CircleArea
{
	double r;
	CircleArea()
	{
		r=0;
	}
	CircleArea(double r)
	{
		super();
		this.r=r;
	}
	CircleArea(CircleArea C)
	{
		this.r=C.r;
	}
	double Area()
	{
		return (22/7)*r*r;
	}
	double Area(double x)
	{
		return (22/7.0)*r*r;
	}
	void SetCircle(double r)
	{
		this.r=r;
	}
}
public class Main extends Object
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	CircleArea c1=new CircleArea();
	System.out.println("Intially the area of the circle is: "+c1.Area());
	CircleArea c2=new CircleArea(7.0);
	System.out.println("Area of the circle with radius 7.0 is: "+c2.Area());
	System.out.println("Area of the circle with radius 5.5 is: "+c2.Area(5.5));
	CircleArea c3=new CircleArea(c2);
	System.out.println("After copy constructor area of the third circle is: "+c3.Area());
	c1.SetCircle(8.8);
	System.out.println("After set circle area of first circle is: "+c1.Area());
	}
}
