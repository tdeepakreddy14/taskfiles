import java.util.*;
import java.util.stream.Collectors;
public class StreamsFilter{
	public static void main(String args[]){
		List<String> words = Arrays.asList("Apple","Mango","Bannana","Avacado","Grapes");
		List<String> modifiedList = words.stream()
			.map(word -> word.startsWith("A") ? word : word.toUpperCase())		//ternery operator
			.collect(Collectors.toList());
			
		System.out.println(modifiedList);
	}
}


