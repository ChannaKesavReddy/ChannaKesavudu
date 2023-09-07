package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class I_frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver	driver=new EdgeDriver();
driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
//navigateto first frame
driver.switchTo().frame(0);
String wb = driver.findElement(By.xpath("(//a[text()='org.openqa.selenium'])[1]")).getText();
System.out.println(wb);
//driver.switchTo().frame("")
//search any elements store in reference veriable

	}

}
