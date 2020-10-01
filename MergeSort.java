import java.io.*;
import java.util.Scanner;
public class MergeSort
{
	static void sort(int a[],int low,int high)
	{
		if(low==high)
			return;
		else
		{
			int mid=(low+high)/2;
			sort(a,low,mid);
			sort(a,mid+1,high);
			int l[]=new int[mid-low+1];
			int r[]=new int[high-mid];
			for(int i=0;i<l.length;i++)
				l[i]=a[low+i];
			for(int i=0;i<r.length;i++)
				r[i]=a[mid+1+i];
			int x=0,y=0,z=low;
			while(x<l.length && y<r.length)
			{
				if(l[x]<r[y])
				a[z++]=l[x++];
				else
				a[z++]=r[y++];
			}
			for(;x<l.length;x++)
				a[z++]=l[x];
			for(;y<r.length;y++)
				a[z++]=r[y];
		}
	}
	static void sort(int a[])
	{
		sort(a,0,a.length-1);
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
		System.out.println("Time for Random MergeSort is : "+time/10);
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
		System.out.println("Time for Sorted MergeSort is : "+time/10);
	}
}
