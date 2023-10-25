package task6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class AnagramGrouper{
	public static List<List<String>> anagramGroup(List<String> strings){
		Map<String,List<String>> anagramMap = new HashMap<>();
		for(String str:strings) {
			char[] charArray = str.toCharArray();
			Arrays.sort(charArray);
			String sortedstr = new String(charArray);
			
			anagramMap.computeIfAbsent(sortedstr, k ->new ArrayList<>()).add(str);
		}
		return new ArrayList<>(anagramMap.values());
	}
	public static void main(String[] args) {
		List<String> inputString = Arrays.asList("listen", "silent", "hello", "world", "dog", "god");
		//List<List<String>> anagramgroup = 
		System.out.println(anagramGroup(inputString));
	}
}