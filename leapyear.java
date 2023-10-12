package day1;

import java.util.Scanner;

public class leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("entee an year");
		int year = sc.nextInt();
		sc.close();
		switch(year%4) {
		case 0:	
			if(year%100 == 0) {
				if(year%400 == 0) {
					System.out.println("leap year");
				}else {
					System.out.println("not leap year");
				}
			}else {
				System.out.println("leap year");
			}
			break;
		default :
			System.out.println("not leap year");
			break;
		}
	}
}