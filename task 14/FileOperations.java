import java.io.*;
import java.util.Scanner;

public class FileOperations{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		try{
				
			//creation
			System.out.println("file creation : ");
			System.out.println("enter file name to create");
			String fileName = sc.nextLine();
			File file = new File(fileName);
			if(file.createNewFile()) {
				System.out.println("new file created");
			}else{
				System.out.println("file already exists");
			}

			//writing
			System.out.println("\nfile Writing : ");
			System.out.println("enter text to write into file : ");
			FileWriter fileWriter = new FileWriter(file);
			BufferedWriter bfWriter = new BufferedWriter(fileWriter);
		
			String line;
			while (!(line = sc.nextLine()).isEmpty()) {
				bfWriter.write(line);
				bfWriter.newLine();
			}
			bfWriter.close();

			//Reading
			System.out.println("\nfile Reading : ");
			System.out.println("enter file name to read : ");
			String readFile = sc.nextLine();
			FileReader fileReader = new FileReader(readFile);
			BufferedReader bfReader = new BufferedReader(fileReader);

			System.out.println("Contents of the file:");
            		String content; 
            		while ((content = bfReader.readLine()) != null) {
                		System.out.println(content);
            		}
           		bfReader.close();
			
			//Deletion
			System.out.println("\nfile Deleation : ");
			System.out.println("enter file name to delete: ");
			String delFile = sc.nextLine();
			File deleteFile = new File(delFile);
			if(deleteFile.exists()){
				deleteFile.delete();
				System.out.println("file deleted");
			}

	
		}catch(IOException e){
			System.out.println(e);
		}
	}
}