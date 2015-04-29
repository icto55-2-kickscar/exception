package exception1;

public class DivideByZeroException extends Exception {


	public DivideByZeroException(){
		super("Dividing by Zero");
	}

	public DivideByZeroException(String msg) {
		super(msg);
	}

}
