import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
public class ReadingCSVFile {
	public static void main(String[] args) {
        try {
		FileReader file = new FileReader("file.csv");
		BufferedReader reader = new BufferedReader(file);
                String line = reader.readLine(); 
                while (line != null) {
                	System.out.println(line);
                	line = reader.readLine();
                }
            	reader.close();
        	} catch (IOException e) {
            		System.out.println(e.getMessage()); 
        }
    	}
}
