package in.ineuron;

public class Square implements Shapes{

	private int side;
	
	
	public Square(int side) {
		this.side = side;
	}

	@Override
	public void calcArea() {
	Integer area=side*side;
		System.out.println(area);
	}

	@Override
	public void calcPerimeter() {
    
		Integer perimeter=4*side;
		System.out.println(perimeter);
		
	}

}
