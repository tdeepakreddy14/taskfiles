import java.util.*;
import java.io.*;
public class OneBinFileToAnother{
	public static void main(String args[]) throws Exception{
		FileInputStream fis = new FileInputStream("D:\\deepak\\javatraining\\taskfiles\\task 19\\wcCheck.bin");
		BufferedInputStream bis1 = new BufferedInputStream(fis);

		FileOutputStream fos = new FileOutputStream(new File("D:\\deepak\\javatraining\\taskfiles\\task 19\\wcCheck2.bin"));
		BufferedOutputStream bis2 = new BufferedOutputStream(fos);
		byte[] array = new byte[1024];
		//int line;
		while(bis1.read(array) != -1){
			bis2.write(array);
		}
		bis2.flush();
		bis2.close();
	}
}