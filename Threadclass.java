import java.io.*;
import java.util.*;
class ThreadclassDemo extends Thread
{
	public static void main(String args[])
	{
		Thread t1=new Thread("my thread");
		ThreadclassDemo t2=new ThreadclassDemo();
		t1.start();
		t2.start();
		String str=t1.getName();
		System.out.println("The name of the thread is: "+str);
	}
	public void run()
	{
		System.out.println("The thread is created and executed");
	}
}

