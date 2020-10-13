package oopsConcepts;

public class Rectangle {
	public float length;
	public float breadth;
	
	public float area() {
		return length*breadth;
		
	}
	public float perimeter() {
		return 2*(length+breadth);
	}
	public boolean isSquare() {
		return length==breadth;
		
	}
}

public class RectangleTest{
	public static void main(String[] args) {
		Rectangle r1= new Rectangle();
		r1.length=5;
		r1.breadth=6;
		System.out.println("Area 1 is "+r1.area());
		System.out.println("Perimeter 1 is "+r1.Perimeter());
	}
	
	
}
