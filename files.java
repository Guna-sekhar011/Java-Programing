package FileHandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class files {
	private static FileWriter writer = null;

	public static void main(String[] args) {
		String path = "D:\\File Handler\\data.txt";
		String path2 = "D:\\File Handler\\data2.txt";
		FileReader reader = null;
		try {
			reader = new FileReader(path);
			writer  =  new FileWriter(path2);
			int i = reader.read();
			while(i!=-1) {
			writer.write(i);
			System.out.print((char)i);
			i = reader.read();
			}
			writer.flush();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				reader.close();
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}