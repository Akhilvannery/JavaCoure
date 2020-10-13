package loops;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int n=sc.nextInt();
		int m=n;
		int r=0;
		int rev=0;
		while (n>0) {
		r=n%10;
		rev=rev*10+r;
		n=n/10;
		}
		if(m==rev) {
			System.out.println("it is a palindrome!!");
		}
		else {
			System.out.println("it is not a palindrome");
		}
		System.out.println("reverse of the number is : "+rev);
//		
	}

}
