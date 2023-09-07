import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class data {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
FileInputStream f=new FileInputStream("C:\\Users\\User\\Documents\\html\\redentials.properties");
Properties p=new Properties();
p.load(f);
String s=p.getProperty("url");
System.out.println(s);



	}

}
