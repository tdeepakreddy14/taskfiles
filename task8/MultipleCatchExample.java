import java.util.Scanner;
public class MultipleCatchExample{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a :");
		int a = sc.nextInt();
		System.out.println("enter b : ");
		int b = sc.nextInt();
		try {
			int result = divide(a,b);
			System.out.println("result is : "+result);
		}catch(ArithmeticException e) {
			System.err.println("ArithmeticException - "+e.getMessage());
		}catch(NullPointerException e) {
			System.err.println("numm pointer exception - "+e.getMessage());
		}
		
	}
	public static int divide(int dividend, int divisor) {
        try {
            return dividend / divisor;
        } catch (ArithmeticException e) {
            System.err.println("Division by zero is not allowed.");
            throw e;
        } catch (NullPointerException e) {
            System.err.println("NullPointerException occurred.");
            throw e;
        }
    }
}