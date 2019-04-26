import java.util.*;
import java.io.*;
public class HeapSort
{
	static void buildMaxHeap(int a[])
	{
		int size=a.length;
		for(int i=size/2;i>=0;i--)
			maxHeapify(a,i,size);
	}
	static void maxHeapify(int a[],int parent,int size)
	{
		int lc=parent*2;
		int rc=lc+1;
		int max=parent;
		if(lc<size && a[max]<a[lc])
			max=lc;
		if(rc<size && a[max]<a[rc])
			max=rc;
		if(max!=parent)
		{
			int t=a[max];
			a[max]=a[parent];
			a[parent]=t;
			maxHeapify(a,max,size);
		}
	}
	static void sort(int a[])
	{
		int size=a.length;
		buildMaxHeap(a);
		for(int i=size-1;i>=0;i--)
		{
			int t=a[0];
			a[0]=a[i];
			a[i]=t;
			maxHeapify(a,0,i-1);
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
		System.out.println("Time for Random HeapSort is : "+time/10);
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
		System.out.println("Time for Sorted HeapSort is : "+time/10);
	}
}