package ex01;

public class MainClass {
	public static void main(String[] args) {
		
		dowork(new A());
		dowork(new B());
		dowork(new C());		
		
	}
	
	static void dowork(A a) {
		if(a instanceof B) {
			B b = (B)a;
			b.fb();
		}
		else if(a instanceof C) {
			C c = (C)a;
			c.fc();
		}
		else {
			a.fa();
		}
	}
}
