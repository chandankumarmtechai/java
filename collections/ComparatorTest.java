import java.util.*;

class MyComparator implements Comparator
{
	public int compare(Object obj1, Object obj2)
	{
		return 1;// make insertion oreder preserved with duplicates allowed
		// return -1; reverse insertion order
		//return 0; element not inserted
	}
}

public class ComparatorTest
{
	public static void main(String a[])
	{
		MyComparator comp = new MyComparator();
		TreeSet set = new TreeSet(comp);
		
		set.add(10);
		set.add(5);
		set.add(25);
		set.add(15);
		
		System.out.println(set);
	}
}
