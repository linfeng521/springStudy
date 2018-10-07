package temporary;
//回调函数的意义在于能够是使
public class Test {
	public static void main(String[] args) {
		AProgram aProgram = new AProgram();
		CallInterface callInterface = new BProgram();
		aProgram.setCallFunc(callInterface);
		aProgram.call();
	}
}
