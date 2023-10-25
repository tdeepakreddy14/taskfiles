package task6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class KthLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the list of integers
        System.out.print("Enter a list of integers : ");
        String input = sc.nextLine();
        List<Integer> integerList = new ArrayList<>();
        String[] elements = input.split(",");

        for (String element : elements) {
            integerList.add(Integer.parseInt(element.trim()));
        }
        System.out.print("Enter the kth value  : ");
        int k = sc.nextInt();
        
        // Check if k is valid
        if (k < 1 || k > integerList.size()) {
            System.out.println("Invalid value of k");
        } else {
        	// Sort the list in descending order
            Collections.sort(integerList, Collections.reverseOrder());

            // Find the kth largest element
            int kthLargest = integerList.get(k - 1);

            // Output the result
            System.out.println("The " + k + "th largest element is: " + kthLargest);
        }
    }
}
