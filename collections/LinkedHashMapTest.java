import java.util.*;

public class LinkedHashMapTest
{
	public static void main(String a[])
	{
		LinkedHashMap map = new LinkedHashMap();
		System.out.println(map.isEmpty());//true
		map.put(1,10);
		map.put(2,20);
		map.put(5,5);
		map.put(6,50);
		System.out.println(map);//{1=10, 2=20, 5=5, 6=50}
	}
}
