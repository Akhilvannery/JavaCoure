package relational;
import java.util.*;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int day;
		System.out.println("enter a number:");
		day=sc.nextInt();
		
		switch (day) {
		case 1:System.out.println("monday");
				break;
		case 2:System.out.println("tuesday");
				break;
		case 3:System.out.println("wednesday");
				break;
		case 4:System.out.println("thursday");
				break;
		default:System.out.println("invalid entry!!");
				break;
		}

	}

}
