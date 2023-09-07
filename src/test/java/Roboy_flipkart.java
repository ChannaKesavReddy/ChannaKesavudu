import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Roboy_flipkart {

	public static void main(String[] args) throws AWTException, Throwable
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.flipkart.com");
		Robot ff=new Robot();
		ff.keyPress(KeyEvent.VK_PAGE_DOWN);
		ff.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(3000);
		ff.keyPress(KeyEvent.VK_PAGE_UP);
		ff.keyRelease(KeyEvent.VK_PAGE_UP);
		Thread.sleep(3000);
		ff.keyPress(KeyEvent.VK_PAGE_DOWN);
		ff.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		

	}

}

