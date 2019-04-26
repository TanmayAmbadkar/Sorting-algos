import java.util.*;
import java.io.*;
import java.math.*;
public class tc_gen
{
	public static void main(String args[]) throws IOException
	{
		Random ob=new Random();
		for(int t=0;t<10;t++)
		{
			int n=1000;
			int a[]=new int[n];
			for(int i=0;i<n;i++)
			{
				a[i]=Math.abs(ob.nextInt());
				a[i]=a[i]%10000;
			}
			int b[]=Arrays.copyOf(a,n);
			Arrays.sort(b);
			String x="random\\input0"+t+".txt";
			String y="sorted\\input0"+t+".txt";
			Writer f=new FileWriter(new File(x));
			Writer f1=new FileWriter(new File(y));
			f.write(n+" ");
			f1.write(n+" ");
			f.write(System.getProperty("line.separator"));
			f1.write(System.getProperty("line.separator"));
			for(int i=0;i<n;i++)
				f.write(a[i]+" ");
			for(int i=0;i<n;i++)
				f1.write(b[i]+" ");
			f1.close();
			f.close();
		}
		System.out.println("File Generation complete");
	}
}
			