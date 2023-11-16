import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CalSum {
	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(1,2,3,4,5,6,7,8,9);
		int newList = l.stream()
				.filter(num -> num%2==0)
				.mapToInt(num -> num*num)
				.sum();
		System.out.println(newList);
	}
}
