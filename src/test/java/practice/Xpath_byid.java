package practice;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Xpath_byid {

		public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.get("http://demo.actitime.com/login.do");
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager");
			driver.findElement(By.xpath("//a[@id='loginButton']")).click();
			//driver.quit();

		}

	}
