import java.util.Scanner;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.*;
public class OneDirectoryToAnother{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		try{
			System.out.println("enter source file path : ");	
			String sourceFile = sc.nextLine();

			System.out.println("enter source file path : ");
			String destFile = sc.nextLine();
			
			File sFile = new File(sourceFile);
			if (!sFile.exists()) {
            			throw new IOException("Source file does not exist.");
       			}
			File DFile = new File(destFile);
			

			if(sFile.renameTo(DFile)){
				sFile.delete();
				System.out.println("Successfully moved");
			}else{
				System.out.println("Failed to move");
			}
			
		}catch(Exception e){
			System.out.println(e);
		}
	}
}