import java.util.*;
public class SelectionSort
{
	public static void sort(int a[])
	{
		int n=a.length;
		for(int i=0;i<n;i++)
		{
			int index=i;
			int min=a[i];
			for(int j=i+1;j<n-i;j++)
			{
				if(min<a[j])
				{
					min=a[j];
					index=j;
				}
			}
			int t=a[index];
			a[index]=a[i];
			a[i]=t;
		}
	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=in.nextInt();
		
		sort(a);
		System.out.println("Sorted array is: "+Arrays.toString(a));
	}
}
		
		
