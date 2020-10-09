package myfirst;
import java.util.*;

public class Expression {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		float s;
		
		System.out.println("enter the sides:");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		s=(a+b+c)/2;
		double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Area is "+ area);
		
		
		
		// TODO Auto-generated method stub

	}

}
