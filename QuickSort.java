import java.io.*;
import java.util.Scanner;
public class QuickSort
{
	static int part(int a[],int low, int high)
	{
		int pivot=a[high];
		int k=low-1;
		for(int i=low;i<high;i++)
		{
			if(a[i]<=pivot)
			{
				k++;
				int t=a[k];
				a[k]=a[i];
				a[i]=t;
			}
		}
		int t=a[k+1];
		a[k+1]=a[high];
		a[high]=t;
		return k+1;
	}
	static void sortar(int a[],int low,int high)
	{
		if(low<high)
		{
			int p=part(a,low,high);
			sortar(a,low,p-1);
			sortar(a,p+1,high);
		}
	}
	static void sort(int arr[])
	{
		sortar(arr,0,arr.length-1);
	}
	public static void main(String args[]) throws IOException
	{
		long time=0;
		for(int t=0;t<10;t++)
		{
			String file="random\\input0"+t+".txt";
			Scanner in=new Scanner(new File(file));
			int n=in.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++)
				a[i]=in.nextInt();
			long x=System.nanoTime();
			sort(a);
			long y=System.nanoTime();
			time+=(y-x);
		}
		System.out.println("Time for Random QuickSort is : "+time/10);
		time=0;
		for(int t=0;t<10;t++)
		{
			String file="sorted\\input0"+t+".txt";
			Scanner in=new Scanner(new File(file));
			int n=in.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++)
				a[i]=in.nextInt();
			long x=System.nanoTime();
			sort(a);
			long y=System.nanoTime();
			time+=(y-x);
		}
		System.out.println("Time for Sorted QuickSort is : "+time/10);
	}
}
