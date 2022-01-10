package src.com.rk.java.generic;

public class ExceptionPractice2 {
	
	public static void main(String[] args) {
		
		try {
			execute();
			System.out.println("success");
			
		} catch (Exception e) {
			System.out.println("catch............");
		}
	}
	
	@SuppressWarnings("finally")
	public static void execute() {
		try {
			throw new IllegalArgumentException();
		} catch (Exception e) {
			throw new NullPointerException();
		}
		finally {
			throw new IndexOutOfBoundsException();
		}
	}

}
