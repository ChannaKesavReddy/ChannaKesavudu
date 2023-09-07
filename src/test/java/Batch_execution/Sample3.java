package Batch_execution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample3 {
@Test
public void tc7() {
	Reporter.log("==Iam from tc7==",true);
}
@Test
public void tc8() {
	Reporter.log("==I am From tc8==",true);
}
@Test
public void tc9() {
	Reporter.log("==I am From tc9==",true);
}
}
