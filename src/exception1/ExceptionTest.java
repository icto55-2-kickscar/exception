package exception1;

public class ExceptionTest {
	public static void main(String[] args) throws DivideByZeroException {
		
		int a = 10;
		double b;
		b = 100 / a; // java.lang.ArithmeticException 발생
		System.out.println("Some more codes"); // 예외 발생으로 수행되지 않음
		
		ThrowsText tt = new ThrowsText();
		tt.suspiciousMethod();
		

	}
}
