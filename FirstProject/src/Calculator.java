class Calc{
	private int op1,op2;

	public int getOp1() {
		return op1;
	}

	public void setOp1(int op1) {
		this.op1 = op1;
	}

	public int getOp2() {
		return op2;
	}

	public void setOp2(int op2) {
		this.op2 = op2;
	}
	int add(int x, int y) {
		return op1+op2;
	}
	int sub(int x,int y) {
		return op1-op2;
	}
	int mul(int x,int y) {
		return op1*op2;
	}
	int div(int x,int y) {
		return op1/op2;
	}
}

public class Calculator {
	public static void main (String[] args) {
		Calc calc = new Calc();
		calc.setOp1(10);
		calc.setOp2(20);
	}
}
