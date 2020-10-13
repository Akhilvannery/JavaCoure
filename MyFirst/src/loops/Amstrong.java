package loops;
import java.util.Scanner;
public class Amstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int n=sc.nextInt();
		int m=n;
//		int r;
//		while(n>0) {
//		r=n%10;
//		System.out.print(r+" ");
//		n=n/10;
//		}
		int r;
		int sum=0;
		while(n>0) {
			r=n%10;
			sum=sum+(r*r*r);
			n=n/10;
			
			
		}
		if(sum==m) {
			System.out.println("it is an amstrong number.");
			
		}
		else {
			System.out.println("it is not an amstrong number.");
		}
		
		
		
		
		
		
	}

}
