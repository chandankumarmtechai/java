import java.util.*;

class MyComparator implements Comparator
{
	public int compare(Object o1, Object o2)
	{
		return 1;
	}
}

public class PriorityQueueTest
{
	public static void main(String a[])
	{
		PriorityQueue q = new PriorityQueue();
		System.out.println(q.isEmpty());
		q.offer(3);
		q.offer(2);
		q.offer(1);
		System.out.println(q.poll() + " " + q.poll() + " " +  q.poll());
		
		PriorityQueue q2 = new PriorityQueue(new MyComparator());
		System.out.println(q2.isEmpty());
		q2.offer(3);
		q2.offer(2);
		q2.offer(1);
		System.out.println(q2.poll() + " " + q2.poll() + " " +  q2.poll());
	}
}
