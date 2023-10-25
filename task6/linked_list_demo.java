package task6;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class linked_list_demo {
	public static void main(String[] args) {
		List<String> stringlist = new LinkedList<>();   
		stringlist.add("apple");
		stringlist.add("orange");
		stringlist.add("apple");
		stringlist.add("bannana");
		stringlist.add("mango");
		System.out.println("list : "+stringlist);
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string : ");
		String lastocc = sc.nextLine();
		sc.close();
		
		ListIterator<String> iterate = stringlist.listIterator(stringlist.size()); //listiterator(int index
			while(iterate.hasPrevious()) {
				if(iterate.previous().equals(lastocc)) {
					iterate.remove();
					break;
				}
			}
		System.out.println("list after removing last occurance : "+stringlist);
	}
}
