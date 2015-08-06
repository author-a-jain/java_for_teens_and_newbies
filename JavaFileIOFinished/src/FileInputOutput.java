import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputOutput {

	public static void main(String[] args) {
		try {
			FileOutputStream fOutStream = new FileOutputStream("myFile.txt");
			String str = "One direction is the greatest band ever";
			byte byteArray[] = str.getBytes();// convert string into byte
												// array
			fOutStream.write(byteArray);
			fOutStream.close();
			System.out.println("success...");
		} catch (Exception e) {
			System.out.println(e);
		}

		try {
			FileInputStream fileInputStream = new FileInputStream("myFile.txt");
			int i = 0;
			while ((i = fileInputStream.read()) != -1) {
				System.out.println((char) i);
			}
			fileInputStream.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
