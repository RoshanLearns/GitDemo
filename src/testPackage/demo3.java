package testPackage;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class demo3 {
	
	@Parameters({"URL"})
	@Test
	public void webLoginCarLoan(String urlName) {
		System.out.println("Car Web Login");
		System.out.println(urlName);
		Assert.assertTrue(false);
	}
	
	@Test(groups = {"smoke"})
	public void mobileLoginCarLoan() {
		System.out.println("Car Mobile Login");
	}
	
	@Test
	public void apiLoginCarLoan() {
		System.out.println("Car API Login");
	}
	
	@BeforeMethod
	public void befMet() {
		System.out.println("Before each Method of the Class file which needs to be executed");
	}
	
	@AfterMethod
	public void aftMet() {
		System.out.println("After each Method of the Class file which needs to be executed");
	}
	
	@Test(dataProvider="getData")
	public void LoginAll(String username, String password) {
		System.out.println(username);
		System.out.println(password);
	}
	
	@DataProvider
	public Object[][] getData() {
		//1st combination username/password - good credit
		//2nd combination - no credit
		//3rd combination - fraud credit
		
		Object[][] data = new Object[3][2];
		//1st set
		data[0][0] = "firstsetusername";
		data[0][1] = "first password";
		
		//2nd Set
		data[1][0] = "secondsetusername";
		data[1][1] = "second password";
		
		//3rd Set
		data[2][0] = "thirdsetusername";
		data[2][1] = "third password";
		
		
		return data;
	}

}
