package practice;

	import org.openqa.selenium.Dimension;

	import org.openqa.selenium.Point;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	public class Size {
		public static void main(String[] args) {
			WebDriver driver=new  ChromeDriver();
			driver.get("https://www.amazon.in");
			Dimension d=new Dimension(100,200);
			driver.manage().window().setSize(d);
			Point p=new Point(400,200);
			driver.manage().window().setPosition(p);

		}

	}

