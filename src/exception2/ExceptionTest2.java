package exception2;


public class ExceptionTest2 {
	public static void main(String[] args) {
				int a = 10;
				double b;
				try {
				    b = 100/a;
				    System.out.println("Some more codes in try block");
				    
				} catch(ArithmeticException e) {
				    System.out.println("Exception occurred : "+e);
				    return;
				} finally {
					System.out.println("Some more codes in finally block"); 
				}
				
				
				
	}
}
