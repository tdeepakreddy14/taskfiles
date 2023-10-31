import java.io.IOException;
import java.util.Scanner;

public class ThrowVsThrowsDemo {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    try {
    	System.out.println("enter a");
    	int a = sc.nextInt();
    	System.out.println("enter b");
    	int b = sc.nextInt();
    	int result = divide(a,b);
    	System.out.println("resilt : "+result);
    }catch(ArithmeticException e){
    	System.out.println("Arthematic expression : "+e.getMessage());
    }
    }
    public static int divide(int a,int b) throws ArithmeticException{
    	if(b==0) {
    		throw new ArithmeticException("div by 0 not allowed");
    	}
    	return a/b;
    }
}