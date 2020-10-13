package loops;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    Scanner scan=new Scanner(System.in);
	        System.out.println("Enter start number(a):");
	        int a=scan.nextInt();
	        System.out.println("Enter the difference(d)");
	        int d=scan.nextInt();
	        System.out.println("enter value of n:");
	        int n=scan.nextInt();
//	        
	        
	        
	        //FOR AP
	        int term=a;
	        for(int i=0;i<n;i++) {
	        	
	        	System.out.print(term+",");
	        	term=term+d;
	        }
	        
	               
	       
	}

}
