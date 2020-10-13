package methods;

public class MethodPractice {
	static void change(int X[],int index,int value) {
		X[index]=value;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int A[]= {2,4,6,8};
	change(A,0,3);
	for(int x:A) {
		System.out.println(x);
	}
		
	}

}
