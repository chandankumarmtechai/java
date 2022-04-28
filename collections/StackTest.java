import java.util.*;

public class StackTest
{
	public static void main(String a[])
	{
		//Applying stack related methods
		Stack s = new Stack();
		System.out.println(s.empty());// true
		s.push(10);
		s.push(20);
		System.out.println(s);//[10,20]
		System.out.println(s.peek());//20
		System.out.println(s.pop());//20
		System.out.println(s);//[10]
		System.out.println(s.search(10));// 1
		
		//Lets fun with Collection, List and Vector methods
		
		s.add(20);
		System.out.println(s); //[10,20]
		s.add(10);
		System.out.println(s); //[10,20,10]
		System.out.println(s.peek());//10
		System.out.println(s.lastElement()); //10
		System.out.println(s.get(2));//10
		
		//voilating stack concept by inserting everywhere as list, but possible doing so
		s.add(0,5);
		s.add(50);
		System.out.println(s);//[5,10,20,10,50]
	}
}
