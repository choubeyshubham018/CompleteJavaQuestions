package in.ineuron;

public class Triangle implements Shapes{
	
	private float side1;
	private float side2;
	private float side3;
	
	

	public Triangle(float side1, float side2, float side3) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	@Override
	public void calcArea() {
		float s=(side1+side2+side3)/2;
		float area=(float) Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));	
		System.out.println(area);
	}

	@Override
	public void calcPerimeter() {
		float perimeter=side1+side2+side3;
		System.out.println(perimeter);
	}

}
