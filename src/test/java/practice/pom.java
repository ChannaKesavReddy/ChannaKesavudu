package practice;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;



public class pom {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in");
	WebElement	texta=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	driver.navigate().refresh();
	texta.sendKeys("mobiles under 15000");
	}

}
