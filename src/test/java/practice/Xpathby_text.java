package practice;



		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class Xpathby_text {

			public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.get("http://demo.actitime.com/login.do");
			driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.xpath("//div[text( )='Login ']")).click();
 

	}

}
