import java.io.*;
public class Driver
{
	public static void main(String args[])throws IOException
	{
		System.out.println("Making test cases");
		Runtime.getRuntime().exec("javac tc_gen.java");
		Runtime.getRuntime().exec("javac MergeSort.java");
		Runtime.getRuntime().exec("javac InsertionSort.java");
		Runtime.getRuntime().exec("javac QuickSort.java");
		Runtime.getRuntime().exec("javac HeapSort.java");
		Runtime.getRuntime().exec("javac BubbleSort.java");
		Runtime.getRuntime().exec("javac SelectionSort.java");
		System.out.println("All programs compiled successfully");
		//Add new line for new method of sorting, to compile the code
		Process p=Runtime.getRuntime().exec("java tc_gen");
		Process q=Runtime.getRuntime().exec("java MergeSort");
		Process r=Runtime.getRuntime().exec("java InsertionSort");
		Process s=Runtime.getRuntime().exec("java QuickSort");
		Process t=Runtime.getRuntime().exec("java HeapSort");
		Process u=Runtime.getRuntime().exec("java SelectionSort");
		//Process u=Runtime.getRuntime().exec("java BubbleSort");
		/*Add a new process for a executing a new sorting method
		* Then follow the next 4 lines to output the time
		*/
		/*BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));
		String line=null;
		while((line=input.readLine()) != null) {
			System.out.println(line);
		}*/
		BufferedReader input = new BufferedReader(new InputStreamReader(q.getInputStream()));
		String line=null;
		while((line=input.readLine()) != null) {
			System.out.println(line);
		}
		input = new BufferedReader(new InputStreamReader(r.getInputStream()));
		line=null;
		while((line=input.readLine()) != null) {
			System.out.println(line);
		}
		input = new BufferedReader(new InputStreamReader(s.getInputStream()));
		line=null;
		while((line=input.readLine()) != null) {
			System.out.println(line);
		}
		input = new BufferedReader(new InputStreamReader(t.getInputStream()));
		line=null;
		while((line=input.readLine()) != null) {
			System.out.println(line);
		}
		/*input = new BufferedReader(new InputStreamReader(u.getInputStream()));
		line=null;
		while((line=input.readLine()) != null) {
			System.out.println(line);
		}*/
		System.out.println("All programs run successfully");
	}
}
