package methods;
import java.util.*;

public class parameterPassing {
	
	//***ADDING 2 NUMBERS***
//	static int add(int x,int y) {
//		int z=x+y;
//		return z;
//	}
//	
//	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter a and b :");
//		int a=sc.nextInt();
//      int b=sc.nextInt();
	
//   	c=add(a,b);
//		int	System.out.printf("The sum of %d and %d is %d",a,b,c);
//				
//	}
	
	//***Print welcome message*****
	static void welcome(String n) {
		System.out.println("welcome Mr. "+n);
	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name :");
		String name=sc.nextLine();
		welcome(name);
		
		
		
	}
	
	

}
