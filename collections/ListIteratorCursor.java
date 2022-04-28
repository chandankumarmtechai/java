import java.util.*;

public class ListIteratorCursor
{
	public static void main(String a[])
	{
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list);//[10,20,30]
		
		ListIterator itr = list.listIterator();
		
		while(itr.hasNext())
		{
			itr.add((int)itr.next() + 5);
		}
		
		System.out.println(list);//[10,15,20,25,30,35]
		
		ListIterator ltr = list.listIterator();
		while(ltr.hasNext())
		{
			if((int)ltr.next() %10 ==0)
			{
				ltr.remove();
			}
			else
			{
				ltr.previous();
				ltr.set((int)ltr.next() %10);
			}
		}
		
		System.out.println(list);//[5,5,5]
	}
}
