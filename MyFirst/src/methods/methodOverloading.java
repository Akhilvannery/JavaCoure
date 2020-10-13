package methods;

public class methodOverloading {

	
		// TODO Auto-generated method stub
		static double area(double x,double y) {
			//System.out.println("area of rectangle is :" );
			return x*y;
		}
		
		
		static double area(double r) {
			System.out.println("area of circle is ");
			return Math.PI*r*r;
		}
		
		
		
	    public static void main(String[] args) {
	    	double a=area(3,4);
	    	//double b=area(2);
	    	
	    }
	
	

}
