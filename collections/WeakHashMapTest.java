import java.util.*;

class Temp
{
	public String toString()
	{
		return "temp";
	}
	
	public void finalize()
	{
		System.out.println("finalize called");
	}
}

public class WeakHashMapTest
{
	//HashMap
	public static void main(String a[]) throws Exception
	{
		Temp t1 = new Temp();
		HashMap map = new HashMap();
		map.put(t1,10);
		System.out.println(map);
		t1=null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(map);
		
		//WeakHashMap
		Temp t2 = new Temp();
		WeakHashMap map2 = new WeakHashMap();
		map2.put(t2,10);
		System.out.println(map2);
		t2=null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(map2);
		
	}
	
}
