import java.util.*;
import java.util.stream.Collectors;
public class StreamCommonEle{
	public static void main(String args[]){
		List<Integer> l1 = Arrays.asList(1,2,3,4,5,6);
		List<Integer> l2 = Arrays.asList(4,5,6,7,8,9);

		List<Integer> commonElements = l1.stream()
						.filter(l2::contains)
						.collect(Collectors.toList());
		System.out.println(commonElements);
	}
}