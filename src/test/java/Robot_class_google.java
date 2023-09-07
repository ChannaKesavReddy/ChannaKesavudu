import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Robot_class_google {

	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.google.com/");
		Robot g=new Robot();
		g.keyPress(KeyEvent.VK_PAGE_DOWN);
		g.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(2000);
		g.keyPress(KeyEvent.VK_PAGE_UP);
		g.keyRelease(KeyEvent.VK_PAGE_UP);
		Thread.sleep(3000);
		g.keyPress(KeyEvent.VK_PAGE_UP);
		g.keyRelease(KeyEvent.VK_PAGE_UP);

	}

}