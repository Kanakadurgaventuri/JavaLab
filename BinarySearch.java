import java.io.*;
import java.util.*;
class BinarySearch
{
	public static void main(String args[])
	{
	    Scanner sc=new Scanner(System.in);
	    int pos=-1;
	    System.out.println("Enter the size of the array: ");
	    int n=sc.nextInt();
	    int arr[]=new int[n];
	    System.out.println("Enter"+n+"elements into the array in sorted order");
	    for(int i=0;i<n;i++)
	    {
	        arr[i]=sc.nextInt();   
	    }
	    System.out.println("Enter key element to search: ");
	    int key=sc.nextInt();
	    int low=0;
	    int high=n-1;
	    while(low<high)
	    {
	        int mid=(low+high)/2;
	        if(arr[mid]==key)
	        {
	            pos=mid+1;
	            break;
	        }
	        else if(arr[mid]<key)
	        {
	            low=mid+1;
	        }
	        else
	        {
	            high=mid-1;
	        }
	    }
	    if(pos==-1)
	    {
	        System.out.println("Search failed");
	        System.out.println(key+" not found in the array");
	    }
	    else
	    {
	        System.out.println("Search successful");
	        System.out.println(key+" found at"+pos+"position in the array");
	    }
	}
}
