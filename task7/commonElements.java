import java.util.*;
public class commonElements {
	public static void main(String[] args) {
		int[] array1 = {1,2,3,4,5};
		int[] array2 = {4,5,6,7,8};
		
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		for(int arr1:array1) {
			set1.add(arr1);
		}
		for(int arr2:array2) {
			set2.add(arr2);
		}
		
		Set<Integer> commonSet = new HashSet<>(set1);
		commonSet.retainAll(set2);
		
		int sumOfSquares = 0;
		for(int num : commonSet) {
			sumOfSquares += num*num; 
		}
		System.out.println("sum of common elements are : "+sumOfSquares);
	}
}