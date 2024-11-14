package q27331;
import java.io.*;
import java.util.Scanner;
import java.lang.Math;
class QuadraticEquation
	{
		public static void main(String args[])
		{
			double a,b,c;
			Scanner obj=new Scanner(System.in);
			System.out.print("Coefficient a: ");
			a = obj.nextDouble();
			System.out.print("Coefficient b: ");
			b = obj.nextDouble();
			System.out.print("Coefficient c: ");
			c = obj.nextDouble();
			double d=b*b-4*a*c , r1,r2;
			double x=Math.sqrt(d);
			if(d==0)
			{
				System.out.print("The roots are real and equal\n");
				r1=(-b+x)/(2*a);
				r2=(-b-x)/(2*a);
				System.out.println("Root: "+r1);
			}
			else if(d<0)
			{
				System.out.print("The roots are imaginary\n");
			}
			else
			{
				System.out.print("The roots are real and distinct\n");
				r1=(-b+x)/(2*a);
				r2=(-b-x)/(2*a);
				System.out.println("Root1: "+r1+" Root2: "+r2);
			}
			}
		}
