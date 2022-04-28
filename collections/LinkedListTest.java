import java.util.*;

public class LinkedListTest
{
	public static void main(String a[])
	{
		LinkedList list = new LinkedList();
		System.out.println(list.isEmpty());
		list.add(11);
		list.addFirst(22);
		System.out.println(list);//[22,11]
		list.addLast(33);
		list.add(11);
		System.out.println(list);//[22, 11, 33, 11]
		System.out.println(list.getFirst());// 22
		list.removeLast();
		System.out.println(list);//[22, 11, 33]
		
		list.remove(new Integer(22));
		list.add(1,22);
		System.out.println(list);//[11,22,33]
		
		list.set(2,44);
		System.out.println(list);//[11,22,44]
	}
}
