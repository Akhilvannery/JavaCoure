package array;

public class MatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[][]= {{3,5,9},{7,6,2},{4,3,5}};
		int B[][]= {{1,5,2},{6,8,4},{3,9,7}};
		int C[][]=new int[3][3];
		
		
//		********ADDING TWO MATRIX********
//		for(int i=0;i<A.length;i++) {
//			for(int j=0;j<B.length;j++) {
//				C[i][j]=A[i][j]+B[i][j];
//			}
//		}
//		
//		for(int i=0;i<C.length;i++) {
//			for(int j=0;j<C.length;j++) {
//				System.out.print(C[i][j]+" ");
//			}System.out.println("\n");
//		}
		
		//******MULTIPLYING TWO MATRIX*********
		
		
		for(int i=0;i<A.length;i++) {
			for (int j=0;j<A[0].length;j++) {
				C[i][j]=0;
				for(int k=0;k<A.length;k++) {
					C[i][j]=C[i][j]+A[i][k]*B[k][j];
				}
			}
			
		}
		for(int i=0;i<C.length;i++) {
			for(int j=0;j<C[0].length;j++) {
				System.out.print(C[i][j]+" ");
			}System.out.println("\n");
		}
       		
		
		
		
	}

}
