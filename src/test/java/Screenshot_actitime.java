import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class Screenshot_actitime {

	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.actitime.com/login.do");
		//TakesScreenshot dd=(TakesScreenshot)driver;
		//File scr=dd.getScreenshotAs(OutputType.FILE);
		//File dest=new File("c:\\Users\\User\\Desktop\\screenshot\\actitimepage.png");
	//	Files.copy(scr,dest);

	}
}
