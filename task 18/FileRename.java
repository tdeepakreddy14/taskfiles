import java.util.*;
import java.io.*;

public class FileRename{
	public static void main(String args[]) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter old file name with path");
		String OldFile =  sc.nextLine();
		
		
		System.out.println("enter new file name with path");
		String NewFile  = sc.nextLine();
		
		
		if(renameFile(OldFile,NewFile)){
			System.out.println("rename successfull.");
		}else{
			System.out.println("rename Failed.");
		}
		sc.close();
	}
	public static boolean renameFile(String CurrentFile , String NewFile){
		File of = new File(CurrentFile);
		File nf  = new File(NewFile);

		return of.renameTo(nf);
	}
}

