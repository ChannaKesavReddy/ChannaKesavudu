package Batch_execution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample1 {
@Test
public void tc1() {
	Reporter.log("==Hii I am from tc1== ",true);
}
@Test
public void tc2() {
	Reporter.log("==Hii I am from tc2== ",true);
}
@Test
public void tc3() {
	Reporter.log("==Hii I am from tc3== ",true);
}

}
