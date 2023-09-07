package practice;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annotaions_flow {
  
	@BeforeSuite
	public void m1() {
		Reporter.log("====Connection to DB====",true);
	}
	@BeforeClass
	public void m2() {
		Reporter.log("====Open the browser====",true);
	}
	@BeforeMethod
	public void m3() {
		Reporter.log("====Login to App====",true);
	}
	@Test
	public void t1() {
		Reporter.log("====Boss I am main tC====",true);
	}
	@AfterMethod
		public void m4() {
			Reporter.log("====Logout from App====",true);
		}
	
	@AfterClass
	public void m5() {
		Reporter.log("==== Close The browser====",true);
	}
	@AfterSuite
	public void m6() {
		Reporter.log("====Disconnect DB connection========",true);
	}

	
	
	
}

