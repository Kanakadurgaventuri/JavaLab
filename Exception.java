import java.io.*;
class MultipleException
{
	public static void main(String args[])
	{
		int a=5,b=0,c;
		int arr1[]=new int[5];
		try
		{
			c=a/b;
			arr1[100]=100;
			throw new IOException();
		}
		catch(NullPointerException n)
		{
			System.out.println("Null pointer exception caught");
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Arithmetic exception caught"+ae);
		}
		catch(ArrayIndexOutOfBoundsException x)
		{
			System.out.println("Array index out of bounds exception caught"+x);
		}
		catch(Exception e)
		{
			System.out.println(" exception caught"+e);
		}
		finally
		{
			System.out.println("End of the program");
		}
	}
}


