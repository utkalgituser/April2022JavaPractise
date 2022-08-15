package enumconcept;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropFIle {

	public static void main(String[] args) {
		FileInputStream fis = null;
		Properties prop = null;
		try {
			fis = new FileInputStream(".\\src\\enumconcept\\config.properties");
			prop = new Properties();
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		String val = prop.getProperty("url");
		System.out.println(val);

		if (Boolean.parseBoolean(prop.getProperty("headless"))) {
			System.out.println("Running headless....");
		}
	}

}
