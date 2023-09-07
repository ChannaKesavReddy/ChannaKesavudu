package Batch_execution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample2 {
@Test
public void tc4() {
	Reporter.log("==I am From tc4==",true);
}
@Test
public void tc5() {
	Reporter.log("==I am From tc5==",true);
}
@Test
public void tc6() {
	Reporter.log("==I am From tc6==",true);
}
}
