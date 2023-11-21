import java.util.Scanner;
import java.io.*;
public class AppendTextToFile{
	public static void main(String args[]) throws Exception{
		Scanner sc = new Scanner(System.in);

		System.out.println("enter file name");
		String fileName = sc.nextLine();

		System.out.println("enter text");
		String line = sc.nextLine();

		appendToTextFile(fileName,line);
		
		sc.close();
	}
	public static void appendToTextFile(String FileName , String content) throws Exception {
		File f = new File(FileName);
		FileWriter fw = new FileWriter(f,true);
		if(content != null){
			fw.write("\n"+content);
			
			System.out.println("text moved");
		}else{
			System.out.println("enter text");

		}
		
		fw.close();
	}
}