package practice;




		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class Xpathby_index {

			public static void main(String[] args) {
				
				WebDriver  driver=new ChromeDriver();
				driver.get("http://demo.actitime.com/login.do");
				driver.findElement(By.xpath("(//input)[3]")).sendKeys("admin");
				driver.findElement(By.xpath("(//input)[4]")).sendKeys("manager");
				driver.findElement(By.xpath("(//div)[13]")).click();

			

		

	}

}
