package in.ineuron;

public class ExceptionProblem {

	public void printNum(int num) {
		if(num>0) {
			System.out.println(num);
		}
		else {
			throw new IllegalArgumentException("Input must be a Positive Number");
		}
	}
	
}
