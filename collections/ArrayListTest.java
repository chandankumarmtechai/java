import java.util.*;

public class ArrayListTest
{
	public static void main(String args[])
	{
		ArrayList list = new ArrayList();
		// should print 0
		System.out.println(list.size());
		System.out.println(list.isEmpty());//print true
		list.add(new Integer(10));
		System.out.println(list.size()); // should print 1, current size
		System.out.println(list.contains(10));// true
		//System.out.println(getArrayListCapacity(list));
		list.add("hello");
		System.out.println(list); // print [10, hello]
		list.add(0, new Integer(5));
		System.out.println(list); // print [5, 10, hello]
		//list.add(4, new Integer(20));// java.lang.IndexOutOfBoundsException
		
		System.out.println(list.indexOf(new Integer(10)));// print 1
		System.out.println(list.indexOf(10)); // print 1
		System.out.println(list.indexOf("10")); // print -1 -- not present
		
		list.add(10);
		System.out.println(list);//[5, 10, hello, 10]
		System.out.println(list.lastIndexOf(10)); //print 3
		
		ArrayList l = new ArrayList(list);
	    System.out.println(l);//[5, 10, hello, 10]
	    
	    list.addAll(l);
	    System.out.println(list);//[5, 10, hello, 10, 5, 10, hello, 10]
	    
	    list.set(list.size()-1, 100);
	    System.out.println(list);//[5, 10, hello, 10, 5, 10, hello, 100]
	    System.out.println(list.containsAll(l)); //true
	    
	    list.removeAll(l);
	    System.out.println(list);//[100]
	    
	    list.add(200);
	    list.add(300);
	    list.add(400);
	    System.out.println(list);
	    list.retainAll(list);
	    System.out.println(list);//[100, 200, 300, 400]
	    
	    list.removeIf(n -> ((int)n % 3 == 0));
	    System.out.println(list);//[100, 200, 400]
	}
}
