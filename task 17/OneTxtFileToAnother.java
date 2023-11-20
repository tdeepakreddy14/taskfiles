
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
public class OneTxtFileToAnother{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		try{
			System.out.println("Enter source file path : ");		
			String sourceFile = sc.nextLine();
			System.out.println("Enter Destination path : ");;
			String destinationFile = sc.nextLine();
			FileReader fr = new FileReader(sourceFile);
			BufferedReader bf = new BufferedReader(fr);

			FileWriter fw = new FileWriter(destinationFile);
			BufferedWriter bw = new BufferedWriter(fw);

			String line;
			while((line = bf.readLine()) != null){
				bw.write(line);
				bw.newLine();
			}
			bf.close();
			bw.close();
		}catch(Exception e){
			System.out.println(e);
		}
		sc.close();
			
	}

}