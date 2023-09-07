import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.io.Files;

public class sereenshot_facebook {

	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		TakesScreenshot ff=(TakesScreenshot)driver;
		File src=ff.getScreenshotAs(OutputType.FILE);
		File dest=new File("c:\\Users\\User\\Desktop\\screenshot\\facebook.png");
	

	}

}