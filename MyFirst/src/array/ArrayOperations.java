package array;

public class ArrayOperations {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int A[]= {8,6,10,9,2,15,7,13,14,11};
//		int B[]=new int[10];
//		
//		
//		for(int i=10;i<A.length;i++) {
//			System.out.print(B[i]+", ");
//		}
//		
		
		int A[][]= {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int i=0;i<A.length;i++) {
			for(int j=0;j<A[0].length;j++) {
				System.out.print("  "+A[i][j]);
			}System.out.println("\n");
		}
		
		
		
		
	}

}
