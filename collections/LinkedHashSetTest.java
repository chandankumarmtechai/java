import java.util.*;

public class LinkedHashSetTest
{
	public static void main(String a[])
	{
		LinkedHashSet set = new LinkedHashSet();
		System.out.println(set.isEmpty());//true
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(10);
		System.out.println(set);//[10,20,30]
	}
}
