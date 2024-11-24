import java.io.*;
import java.util.*;
class ThreadclassDemo implements Runnable
{
	public void run()
	{
		System.out.println("The thread is created and is running");
	}

	public static void main(String args[])
	{
		ThreadclassDemo obj=new ThreadclassDemo();
		Thread t=new Thread(obj);		
		t.start();
	}
}
