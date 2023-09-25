package in.ineuron;

public abstract class UserAbstract {

	int x=5;
	String name="Nitin";
	public void displayNum(int x) {
		System.out.println(x);
	}
	
	protected void wishWelcome( String name) {
		System.out.println("Welcome "+name);
	}
}
