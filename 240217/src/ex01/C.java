package ex01;

public class C extends B {
	int c;

	public C() {
	}

	public C(int a, int b, int c) {
		super(a, b);
		this.c = c;
		int sum = a+b+c;
	}

	int calc() {
		return a+b+c;
	}
}
