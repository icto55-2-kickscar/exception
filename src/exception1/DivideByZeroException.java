package exception1;

public class DivideByZeroException extends Exception {


	public DivideByZeroException(){
		super("Dividing by 0");
	}

	public DivideByZeroException(String msg) {
		super(msg);
	}

}
