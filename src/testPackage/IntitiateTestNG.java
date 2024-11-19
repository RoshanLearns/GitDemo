package testPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class IntitiateTestNG {
	@Test(enabled=false)
	public void demo() {
		System.out.println("hello");
	}
	
	@Test(groups = {"smoke"})
	public void demo2() {
		System.out.println("bye");
	}
	
	@BeforeClass
	public void befCla() {
		System.out.println("I execute before all methods of the particular class");
	}
	
	@AfterClass
	public void aftCla() {
		System.out.println("I execute after all methods of the particular classs");
	}

}
