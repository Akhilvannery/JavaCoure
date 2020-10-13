package oopsConcepts;

public class Cylinder extends Circle {
	public int height;
	 
	public int volume() {
		return Circle1.area()*height;
	}

}
