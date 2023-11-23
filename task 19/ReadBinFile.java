import java.util.*;
import java.io.*;
public class ReadBinFile{
	public static void main(String args[]) throws Exception{
		DataInputStream dos = new DataInputStream (new FileInputStream("D:\\deepak\\javatraining\\taskfiles\\task 19\\wcCheck.bin"));
		String line;
		while((line = dos.readLine())!=null){
			String[] array = line.split(" ");
			for(String str : array){
				System.out.print((char)Integer.parseInt(str,2));
			}
		}
	}
}