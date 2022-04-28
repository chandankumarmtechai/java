import java.util.*;

public class VectorTest
{
	public static void main(String a[])
	{
		//Applying vector specific methods
		Vector v = new Vector();
		System.out.println(v.capacity());// print 10
		
		v.addElement(10);
		v.addElement(20);
		System.out.println(v); //[10,20]
		System.out.println(v.firstElement());//print 10
		v.removeElementAt(0);
		System.out.println(v);//[20]
		
		//Applying Collection and List Methods
		v.add(30);
		v.add(50);
		System.out.println(v); //[20,30,50]
		v.add(2,40);
		System.out.println(v);//[20,30,40,50]
	}
}
