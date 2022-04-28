import java.util.*;

public class IteratorCursor
{
	public static void main(String a[])
	{
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<10; i++)
			list.add(new Integer(i));
		
		System.out.println(list);
		
		Iterator itr = list.iterator();
		
		while(itr.hasNext())
		{
			if((int)itr.next() % 2 == 0)
				itr.remove();
		}
		
		System.out.println(list);
	}
}
