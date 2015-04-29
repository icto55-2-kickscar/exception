package exception1;

import java.io.IOException;

public class ThrowsText {
	public void suspiciousMethod() {
		//throw new IOException(); // 강제로 예외 발생
		
		throw new ArithmeticException();
	}
}
