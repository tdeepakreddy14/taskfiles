import java.util.Scanner;
class dupChar{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String enterString = sc.nextLine();
		sc.close();
		char[] chrArray = enterString.toCharArray();
		int[] count = new int[128];
		for(char ch : chrArray) {
			if(Character.isLetter(ch)) {
				count[ch]++;
			}
		}
		for(int i=0;i<count.length;i++) {
			if(count[i] > 1) {
				System.out.println("Chara: "+ (char)i +",Count: "+count[i]+"times.");
			}
		}
	}
}
