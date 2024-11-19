package javaConcepts;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PC {
	
	@BeforeMethod
	public void bMet() {
		System.out.println("execute me first");
	}
	
	@Test
	public void realClass() {
		System.out.println("I am real");
	}

}
