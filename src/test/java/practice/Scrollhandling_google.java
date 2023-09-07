package practice;

		// TODO Auto-generated method stub
		import org.openqa.selenium.JavascriptExecutor;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class Scrollhandling_google
		{

			public static void main(String[] args) throws Throwable 
			{
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.google.com/");
				JavascriptExecutor gg=(JavascriptExecutor)driver;
				gg.executeScript("window.scrollBy(0,3000);");
				Thread.sleep(4000);
				gg.executeScript("window.scrollBy(0,-2000);");
			}

		}
	


