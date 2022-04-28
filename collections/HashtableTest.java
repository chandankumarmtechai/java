import java.util.*;

class Temp
{
	int i;
	public Temp(int i)
	{
		this.i = i;
	}
	
	public String toString()
	{
		return i+"";
	}
	
	public int hashCode()
	{
		return i;
	}
}

public class HashtableTest
{
	public static void main(String a[])
	{
		Hashtable table = new Hashtable();
		Temp five = new Temp(5);
		Temp five2 = new Temp(5);
		System.out.println(five.equals(five2));
		
		table.put(new Temp(1), "A");
		table.put(new Temp(12), "B");
		table.put(new Temp(16), "C");
		table.put(five, "E");
		table.put(new Temp(7), "G");
		table.put(five2, "A");
		System.out.println(table);
		
		
		Hashtable t2 = new Hashtable();
		
		t2.put(1,'a');
		t2.put(2,'b');
		t2.put(3,'c');
		t2.put(1,'d');
		System.out.println(t2);
	}
}
