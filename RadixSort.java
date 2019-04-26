import java.util.*;
import java.io.*;
public class RadixSort
{
	static void rsort(int a[],int pos,boolean fl)
	{
		if(!fl)
			return;
		boolean flag=false;
		int f=(int)(Math.pow(10,pos-1));
		int l=(int)(Math.pow(10,pos));
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-i-1;j++)
			{
				if(a[j]>=l)
					flag=true;
				int x=a[j]%l-a[j]%f;
				int y=a[j+1]%l-a[j+1]%f;
				if(x>y)
				{
					int t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
		rsort(a,pos+1,flag);
	}
	static void sort(int a[])
	{
		rsort(a,1,true);
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
		System.out.println("Time for Random RadixSort is : "+time/10);
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
		System.out.println("Time for Sorted RadixSort is : "+time/10);
	}
}