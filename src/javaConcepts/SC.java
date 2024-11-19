package javaConcepts;

public class SC extends TC{

	int a;
	//default constructor
	public SC(int i) {
		// TODO Auto-generated constructor stub
		super(i);
		this.a=i;
	}
	
	public int increment() {
		a = a+1;
		return a;
	}
	
	public int decrement() {
		a=a-1;
		return a;
	}
	

}
