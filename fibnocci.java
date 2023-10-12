package day1;
import java.util.*;
public class fibnocci {
	public static void main(String[] args) {
		int a=0,b=1,c=0,i;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number: ");
		int n = sc.nextInt();
		sc.close();
		if(n==0) {
			System.out.println(a);
		}
		else {
			System.out.println(a);
			System.out.println(b);
		}
		for(i=2;i<n;i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
					
		}
	}
}
