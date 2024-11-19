package javaConcepts;

import org.testng.annotations.Test;

public class CC extends PC {
	
	@Test
	public void childMet() {
		
		realClass();
		int a =3;
		SC sc = new SC(a);//Parameterized constructor
		
		System.out.println(sc.increment());
		System.out.println(sc.increment());
		System.out.println(sc.decrement());
		
		System.out.println(sc.multiplyThree());
	}

}
