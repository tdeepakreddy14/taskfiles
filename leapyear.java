
import java.util.Scanner;

public class leapyear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("entee an year");
		int year = sc.nextInt();
		sc.close();
		switch(year%4) {
		case 0:
			switch(year%100){
				case 0:
					switch(year%400) {
					case 0:
						System.out.println("leap year");
						break;
					default :
						System.out.println(" not leap year");
					}
					break;
			default :
				System.out.println("leap year");
			}
			break;
			
		default :
			System.out.println("not leap year");
			break;
		}
	}
}
