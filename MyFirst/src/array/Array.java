package array;
import java.util.*;

public class Array {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);	
	
	int A[]= {3,9,7,8,12,6,15,4,10};
	//System.out.println("enter the search element :");
	//int ele=sc.nextInt();
	
	
	int max=0;
	int secondmax=0;
	for(int i=0;i<A.length;i++) {
		
		if (A[i]>max) {
			
			max=A[i];
			
		}
	
		
		
	}
	System.out.println("value of Second max element is "+secondmax);
	}
}