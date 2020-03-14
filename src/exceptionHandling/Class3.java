package exceptionHandling;

public class Class3 {
	
	public static void main(String[] args) throws Exception {
		
		Class3 s = new Class3();
		s.studentMarks(34);
		
		
	}
	
	void studentMarks(int marks) throws Exception {
		
		if(marks<50) {
			throw new Exception("Student Failed");
		}else {
			System.out.println("Student passed");
		}
		
	}

}
