package in.ineuron;

public class TestApp {

	public static void main(String[] args) {
		ExceptionProblem exc = new ExceptionProblem();
   // Handling the Exception		
	try {
		exc.printNum(-6);
	}catch (Exception e) {
	    System.out.println("Number must be Positive");
	}
	}

}
