import java.util.Scanner;
import java.io.*;
public class BubbleSort
{
	public static void sort(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
	}
	public static void main(String args[])throws IOException
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
		System.out.println("Time for Random BubbleSort is : "+time/10);
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
		System.out.println("Time for Sorted BubbleSort is : "+time/10);
	}
}
			
		
