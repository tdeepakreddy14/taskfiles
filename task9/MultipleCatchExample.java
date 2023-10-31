import java.util.Scanner;
import java.util.InputMismatchException;
public class MultipleCatchExample{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("enter a :");
			int a = sc.nextInt();
			System.out.println("enter b : ");
			int b = sc.nextInt();
			
			int result = divide(a,b);
			System.out.println("result is : "+result);
		}catch(ArithmeticException e) {
			System.err.println("ArithmeticException - "+e.getMessage());
		}catch(InputMismatchException e) {
			System.err.println("Enter integers Only");
		}
	}
	public static int divide(int dividend, int divisor) {
        try {
            return dividend / divisor;
        } catch (ArithmeticException e) {
            System.err.println("Division by zero is not allowed.");
            throw e;
        } catch (InputMismatchException e) {
            System.err.println("Enter integers Only");
            throw e;
        }
    }
}