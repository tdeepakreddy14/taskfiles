
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
public class jsonfile{
	public static void main(String args[]){
	try{
		FileReader file = new FileReader("jsonFile.json");
		BufferedReader buffer=  new BufferedReader(file);
		String line = buffer.readLine();
		while(line != null){
			System.out.println(line);
			line = buffer.readLine();
		}
	}catch(IOException e){
		System.out.println(e.getMessage());
	}
	}
}



