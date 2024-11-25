import java.io.*;
import java.util.*;
class Point2D
{
	int a=5,b=10;
	void display()
	{
		System.out.println("The co-ordinates are ( " +a+ "," +b+ ")");
	}
}
class Point3D extends Point2D
{
	int c=15;
	void display()
	{
		System.out.println("The co-ordinates are ( " +a+ "," +b+ "," +c+ ")");
	}
}
class Single
{
	public static void main(String args[])
	{
		Point2D ob1=new Point2D();
	Point3D ob2=new Point3D();
	Point2D ob3=new Point3D();
	ob1.display();
	ob2.display();
	ob3.display();
	}
}
