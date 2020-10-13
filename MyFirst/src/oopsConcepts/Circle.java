package oopsConcepts;


class Circle1 
{
    public double radius;
    
    public static double area()
    {
        return Math.PI*radius*radius;
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


public class Circle {

    public static void main(String[] args) {
     Circle1 c1=new Circle1();
     Circle1 c2=new Circle1();
     
     c1.radius=7;
     c2.radius=4;
     
     System.out.println("Area1:"+c1.area());
     System.out.println("Perimeter1:"+c1.perimeter());
     System.out.println("Circumference1:"+c1.circumference());
     System.out.println("\n");
     System.out.println("Area2:"+c2.area());
     System.out.println("Perimeter2:"+c2.perimeter());
     System.out.println("Circumference2:"+c2.circumference());
    }
    
}



