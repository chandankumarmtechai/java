import java.util.*;
import java.util.stream.*;
import java.nio.file.*;

public class StreamTest
{
	public static void main(String args[]) throws Exception
	{
		IntStream
				.range(0,10)
				.skip(5)
				.forEach(x->System.out.print(x));
		System.out.println();
		
		Stream.of("alla","cala","bala", "dalla")
			.sorted()
			.findFirst()
			.ifPresent(System.out::print);
		System.out.println();
		
		String[] names = {"aa","bb","abc","bbc","ads"};
		Arrays.stream(names)
			.filter(x->x.startsWith("a"))
			.sorted()
			.map(x->x+" ")
			.forEach(System.out::print);
		System.out.println();
		
		Arrays.stream(new int[] {1,2,3,4,5})
			.map(x->x*x)
			.average()
			.ifPresent(System.out::println);
		
		Stream<String> lines = Files.lines(Paths.get("abc.txt"));
		lines.filter(x->x.length() >4).forEach(System.out::println);
		lines.close();
		
	}
}
