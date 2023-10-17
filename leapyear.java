import java.util.Scanner;
public class leapyear {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("entee an year");
		int year = sc.nextInt();
		sc.close();
		int value = ((year%4==0 && year%100 != 0)|| year%400==0)? 0:1 ; // conditional (ternary) operator 
		switch(value){
			case 0:
				System.out.println("leap year");
				break;
			default :
				System.out.println("not leap year");
				break;
		}
	}
}
