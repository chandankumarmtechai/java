import java.util.*;
public class IdentityHashMapTest
{
	public static void main(String a[])
	{
		//How HashMap handle duplicate key, uses equals() to check duplicate
		HashMap map = new HashMap();
		Integer i1 = new Integer(1);
		Integer i2 = new Integer(1);
		map.put(i1,10);
		map.put(2,20);
		map.put(3,30);
		System.out.println(map);//{1=10, 2=20, 3=30}
		map.put(i2,100);
		System.out.println(map);//{1=100, 2=20, 3=30}
		
		//How IdentityHashMap handle duplicate key, use == to check duplicates
		IdentityHashMap imap = new IdentityHashMap();
		imap.put(i1,10);
		imap.put(2,20);
		imap.put(3,30);
		System.out.println(imap);//{2=20, 1=10, 3=30}
		imap.put(i2,100);
		System.out.println(imap);//{2=20, 1=100, 1=10, 3=30}
	} 
}
