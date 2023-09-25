package in.ineuron;

public class App {

	public static void main(String[] args) {
		
		//Circle Area and Perimeter
		Shapes cir=new Circle(2.5f);
        cir.calcArea();
        cir.calcPerimeter();
        
        //Triangle Area and Perimeter
        Shapes tri=new Triangle(3, 4, 5);
        tri.calcArea();
        tri.calcPerimeter();

        //Square Area and Perimeter
        Shapes sq=new Square(3);
        sq.calcArea();
        sq.calcPerimeter();
	}

}
