package circle1;

class Circle
{
    public double radius;
    
    public double area()
    {
        return Math.PI * radius *radius;
    }
    
    public double perimeter()
    {
        return 2*Math.PI*radius;
    }
    public double circumference()
    {
        return perimeter();
    }
}
class Cylinder extends Circle{
	public double height;
	public double volume() {
		return area()*height;
		
	}
}




public class Circle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1=new Circle();
		c1.radius=2;
		System.out.println("print =="+c1.area());
	}

}
