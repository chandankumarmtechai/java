import java.util.*;

public class TreeSetTest
{
	public static void main(String a[])
	{
		TreeSet set = new TreeSet();
		set.addAll(Arrays.asList(new Integer[]{5,4,3,2,1}));
		System.out.println(set);//[1,2,3,4,5]
		System.out.println(set.comparator());//null
	}
}
