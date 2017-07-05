import java.util.Arrays;
import java.util.List;


public class LearnStreams {
	
	public static void main(String args[])
	{ 
		LearnStreams ls = new LearnStreams();
		List<String> myList =
			    Arrays.asList("a1", "a2", "b1", "c2", "c1");
		myList.stream()
		    .filter(s -> s.startsWith("c")).map(String::toUpperCase).sorted().forEach(System.out::println);
		List<Integer> myList2 =
			    Arrays.asList(3, 4, 5, 6, 7);
		Arrays.stream(new int[] {1, 2, 3})
	    .map(n -> 2 * n + 1)
	    .average()
	    .ifPresent(System.out::println); 
		
		  ((Object) ls).operate(5,7);
		 
	}
	
	

	int operate =(a,  b)->{return a+b;}
	   
}
