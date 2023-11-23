import java.util.*;
import java.io.*;
public class CountNumberOfWordsInTextFile {
	public static void main(String args[]) throws Exception{
		File f = new File("D:\\deepak\\javatraining\\taskfiles\\task 19\\wcCheck.txt");
		BufferedReader bf = new BufferedReader(new FileReader(f));
		String line;
		String[] Array;
		int count=0;
		while((line = bf.readLine()) != null){
			Array = line.split(" ");
			count+= Array.length;
		}
		
		System.out.println(count);
		bf.close();
	}
}