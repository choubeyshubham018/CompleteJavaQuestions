package in.ineuron;

public class Circle implements Shapes {
	
	private float rad;

	public Circle( float rad) {
		this.rad=rad;
	}
	
	
	@Override
	public void calcArea() {
		float area=(22*rad*rad)/7;
		System.out.println(area);

	}

	@Override
	public void calcPerimeter() {
		float perimeter=(22*rad)/7;
		System.out.println(perimeter);

	}

}
