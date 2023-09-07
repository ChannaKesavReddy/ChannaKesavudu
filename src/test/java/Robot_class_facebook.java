import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Robot_class_facebook {

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		Robot f=new Robot();
		f.keyPress(KeyEvent.VK_PAGE_DOWN);
		f.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(2000);
		f.keyPress(KeyEvent.VK_PAGE_UP);
		f.keyRelease(KeyEvent.VK_PAGE_UP);
		
		

	}

}
		
		
	



