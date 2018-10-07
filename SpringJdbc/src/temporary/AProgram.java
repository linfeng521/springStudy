package temporary;

public class AProgram {
	CallInterface callInterface;

	public void setCallFunc(CallInterface callInterface) {
		this.callInterface = callInterface;
	}

	public void call() {
		callInterface.call();
	}
}
