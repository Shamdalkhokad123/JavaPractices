import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStream {

	public static void main(String[] args) throws IOException 
	{
		writeToFile();
		writeTostr();
		
		

	}

	private static void writeTostr() {
		System.out.println("Enter somathing");
		try
		{
			File f = new File("D:/demo1.txt");
			FileOutputStream fos = new FileOutputStream(f);
			String str = "Shamdal Ramdal Khokad";
			
			byte[] ch = str.getBytes();
			fos.write(ch);
			fos.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void writeToFile() {
		System.out.println("Enter somathing");
		try
		{
			File f = new File("D:/demo.txt");
			FileOutputStream fos = new FileOutputStream(f);
			fos.write(65);
			fos.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
