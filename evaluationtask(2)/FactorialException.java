import java.util.InputMismatchException;
import java.util.Scanner;
class InvalidNumberException extends Exception{
	InvalidNumberException(String Message){
		super(Message);
	}
}

public class FactorialException{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		try{
			int num = sc.nextInt();
			if(num<0){
				throw new InvalidNumberException("negative numbers not allowed");
			}
			int factorial = Factorial(num);
			System.out.println("factorial of "+num+" is : "+factorial);
		}catch(InvalidNumberException e){
			System.out.println(e.getMessage());
		}catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}catch (InputMismatchException e) {
            		System.out.println("Invalid input, Please enter an integer.");
		}
	}
	public static int Factorial(int num){
		if(num==0){
			return 1;
		}else{
			int fact = 1;
			for(int i=1;i<=num;i++){
				fact *= i;
			}
		if(fact<=0){
			throw new ArithmeticException(" The given number exceeds the Integer.MAX_VALUE");
		}
		return fact;
		
		}
		
	}
}