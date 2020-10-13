package methods;
import java.util.*;

public class prime {
	static void checkPrime(int num) {
		for (int i=2;i<num/2;i++) {
			if(num%i==0) {
				System.out.println("prime number.");
				
			}
			
		System.out.println("not a prime number.");
	
		}
	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number to be checked :");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		checkPrime(number);
		

	}

}
