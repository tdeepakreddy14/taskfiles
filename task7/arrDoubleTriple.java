import java.util.*;
public class arrDoubleTriple{
	public static void main(String[] args) {
		int[] inputArray = {1,2,3,4,5,6};
		int[] modifiedarray = new int[inputArray.length];
		
		for(int i=0;i<inputArray.length;i++) {
			if (inputArray[i]%2==0){
				modifiedarray[i] = inputArray[i]*2; 
			}else {
				modifiedarray[i] = inputArray[i]*3;
			}
		}
		System.out.println("input array : "+Arrays.toString(inputArray));
		System.out.println("modified array : "+Arrays.toString(modifiedarray));
	}
}
