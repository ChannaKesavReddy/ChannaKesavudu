package practice;


	import java.io.File;
	import java.io.IOException;

	import org.openqa.selenium.By;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	import com.google.common.io.Files;

	public class Single_sereenshotelements {

		public static void main(String[] args) throws Throwable {
			WebDriver driver=new ChromeDriver();
			driver.get("http://www.google.com/");
			TakesScreenshot t=(TakesScreenshot)driver;
			WebElement a = driver.findElement(By.xpath("//img[@class='lnXdpd']"));
			File src = a.getScreenshotAs(OutputType.FILE);
			File dest=new File("C:\\\\Users\\\\User\\\\Desktop\\\\sereenshot\\\\googlelogo.png");
			Files.copy(src, dest);

		}

	}
