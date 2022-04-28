import java.util.*;

public class EnumerationCursorTest
{
	public static void main(String a[])
	{
		Vector v = new Vector();
		for(int i=0; i<10; i++)
			v.add(i);
		
		Enumeration e = v.elements();
		
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
	}
}
