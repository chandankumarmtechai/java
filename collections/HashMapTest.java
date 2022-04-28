import java.util.*;

public class HashMapTest
{
	public static void main(String a[])
	{
		HashMap map = new HashMap();
		System.out.println(map.isEmpty());// true
		
		map.put(1,10);
		map.put(2,20);
		System.out.println(map);//{1=10, 2=20}
		System.out.println(map.put(2,25));//20
		System.out.println(map);//{1=10, 2=25}
		
		map.put(3,30);
		map.put(4,40);
		map.remove(2);
		System.out.println(map);//{1=10, 3=30, 4=40}
		
		System.out.println(map.keySet());//[1,3,4]
		System.out.println(map.values());//[10,30,40]
		
		Set set = map.entrySet();
		Iterator itr = set.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry me = (Map.Entry)itr.next();
			System.out.print(me.getKey() + " -> ");
			System.out.println(me.getValue());	
		}
	}
}
