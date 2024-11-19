package testPackage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo2 {

	@Test(groups = {"smoke"})
	public void demo() {
		System.out.println("good");
	}
	
	@BeforeTest
	public void imp() {
		System.out.println("print me first");
	}
	
	@AfterTest
	public void last() {
		System.out.println("I am the end");
	}
}
