package oopsConcepts;
public class Student {
	
	public int rollnum;
	public String name;
	public String course;
	public int m1,m2,m3;
	
	public int total() {
		return m1+m2+m3;
	}
	public int average(){
		return (m1+m2+m3)/3;	
	}
	public String grade() {
		if(average()>=50)
			return "A grade";
		else
			return "B Grade";
	}
	
	
	
}
public class StudentTest {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		s.rollnum=2;
		
		s.m1=5;
		s.m2=45;
		s.m3=76;
		System.out.println("the grade is "+s.grade());
		
		
		
	}

}
