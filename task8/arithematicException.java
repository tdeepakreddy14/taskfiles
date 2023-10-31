import java.util.Scanner;
public class arithematicException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a : ");
		int a = sc.nextInt();
		System.out.println("enter b : ");
		int b = sc.nextInt();
		try {	
		int sum = a + b;
		System.out.println("addition of a and b : "+sum);
		int sub = a-b;
		System.out.println("subraction of a and b : "+sub);
		int mul=a*b;
		System.out.println("multiplaction if a and b is : "+mul);
		int div = a/b;
		System.out.println("div of a and b is : "+div);
		}
		catch(ArithmeticException e){
			System.out.println("Arithematic expression : "+e.getMessage());
		}
		
	}
}
