import java.util.Scanner;
import java.util.*;
public class arrDoubleTriple{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter Array Size:");
        int n=sc.nextInt();
        int[] inputArray = new int[n];
        System.out.println("Enter Array elements: ");
        for(int i=0; i<n; i++)
        {
            inputArray[i]=sc.nextInt();
        }
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
