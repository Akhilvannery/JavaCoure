package myfirst;

import java.util.Scanner;

public class QuadraticEquation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		
		
		
		System.out.println("enter a,b,c :");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		double r1=(-b+(Math.sqrt((b*b)-(4*a*c))))/(2*a);
		double r2=(-b-(Math.sqrt((b*b)-(4*a*c))))/(2*a);
		System.out.printf("the root of "+a+","+b+" "+"and "+c+" is "+r1);
		//System.out.println("r1= "+r2);
		
	}

}
