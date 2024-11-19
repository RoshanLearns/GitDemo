package testPackage;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class demo4 {
	
	@Parameters({"URL"})
	@Test
	public void webLoginHomeLoan(String urlName) {
		System.out.println("Home Web Login");
		System.out.println(urlName);
	}
	
	@Test(dependsOnMethods = {"webLoginHomeLoan"})
	public void mobileLoginHomeLoan() {
		System.out.println("Home Mobile Login");
	}
	
	@Test(groups = {"smoke"})
	public void apiLoginHomeLoan() {
		System.out.println("Home API Login1");
	}
	
	@BeforeSuite
	public void Alpha() {
		System.out.println("I am the Alpha suite");
	}
	
	@AfterSuite
	public void Zeta() {
		System.out.println("I am the Zeta suite");
	}

}
