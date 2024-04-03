package Property;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class LoginDetails {
Properties pr = new Properties();

public static Properties logInfo() {
	Properties pr = new Properties();
	try {
		FileInputStream file = new FileInputStream("C:\\TestWorkplace\\HRMSCucumber\\src\\test\\java\\Property\\LoginInfo.properties");
		pr.load(file);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return pr;

}
}
