package abc;

import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {

	public static void main(String[] args) {
		try {
			FileReader reader=new FileReader("C:\\Users\\sarala\\OneDrive\\Desktop");
			int ch;
			while ((ch=reader.read())!=-1) {
				System.out.println((char)ch);
			}
			reader.close();
			
		} catch (IOException e) {
			System.out.println("Error:"+e.getMessage());
			
			
		}

	}

}
