import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Robot_class_actitime {

			public static void main(String[] args) throws Throwable 
			{
		
				
				
				WebDriver driver=new EdgeDriver();
				driver.get("https://www.amazon.in");
				
				Robot d=new Robot();
				d.keyPress(KeyEvent.VK_PAGE_DOWN);
				d.keyRelease(KeyEvent.VK_PAGE_DOWN);
				Thread.sleep(5000);
				d.keyPress(KeyEvent.VK_PAGE_DOWN);
				d.keyRelease(KeyEvent.VK_PAGE_DOWN);
				
			}

		}

	


