import java.util.*;

public class HashSetTest
{
	public static Set union(Set a, Set b)
	{
		HashSet s = new HashSet(a);
		s.addAll(b);
		return s;
	}
	
	public static Set intersection(Set a, Set b)
	{
		HashSet s = new HashSet(a);
		s.retainAll(b);
		return s;
	}
	
	public static Set difference(Set a, Set b)
	{
		HashSet s = new HashSet(a);
		s.removeAll(b);
		return s;
	}
	
	public static void main(String a[])
	{
		HashSet set1 = new HashSet(Arrays.asList(new Integer[] {1,2,3,4}));
		HashSet set2 = new HashSet(Arrays.asList(new Integer[] {4,5,6,7}));
		Set result = union(set1, set2);
		
		System.out.println(set1);
		System.out.println(set2);
		System.out.println(result);//[1,2,3,4,5,6,7]
		result = intersection(set1, set2);
		System.out.println(result);//[4]
		result = difference(set1, set2);
		System.out.println(result);//[1,2,3]
	}
}
