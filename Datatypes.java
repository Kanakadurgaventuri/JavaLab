import java.io.*;
import java.util.Scanner;
class PrimitiveDataTypes
	{
		static byte b;
		static short s;
		static int i;
		static long l;
		static float f;
		static double d;
		static char c;
		static boolean a;
		public static void main(String args[])
		{
			Scanner obj=new Scanner(System.in);
			System.out.print("Byte value: ");
			b=obj.nextByte();
			System.out.print("short value: ");
			s=obj.nextShort();
			System.out.print("int value: ");
			i=obj.nextInt();
			System.out.print("long value: ");
			l=obj.nextLong();
			System.out.print("float value: ");
			f=obj.nextFloat();
			System.out.print("double value: ");
			d=obj.nextDouble();
			System.out.print("char value: ");
			c=obj.next().charAt(0);
			System.out.print("boolean value (true/false): ");
			a=obj.nextBoolean();
			System.out.println("byteVar: "+b);
			System.out.println("shortVar: "+s);
			System.out.println("intVar: "+i);
			System.out.println("longVar: "+l);
			System.out.println("floatVar: "+f);
